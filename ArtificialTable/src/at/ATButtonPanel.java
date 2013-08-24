package at;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ATButtonPanel extends JPanel
{
	public ATButtonPanel(final JFrame atFrame)
	{
		JButton btnAdd = new JButton("add");
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				ATFrame.jpRows.add(new ATRows());
				ATFrame.jpRows.revalidate();
			}
		});
		add(btnAdd);
		
		JButton btnDell = new JButton("dell");
		btnDell.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				for (int i = 0; i < ATFrame.jpRows.getComponentCount(); i++)
				{
					JPanel pnl = (JPanel) ATFrame.jpRows.getComponent(i);
					if(pnl.isFocusable())
						{
							ATFrame.jpRows.remove(i);	
						}
				}
				ATFrame.jpRows.revalidate();
			}
		});
		add(btnDell);
		
		JButton btnEdit = new JButton("edit");
		btnEdit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				new ATDialog(atFrame);
			}
		});
		add(btnEdit);
		
	}
}
