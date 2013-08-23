package at;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ATButtonPanel extends JPanel
{
	public ATButtonPanel(final JPanel jpRows)
	{
		JButton btnAdd = new JButton("add");
		btnAdd.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e)
			{
				jpRows.add(new ATRows());
				jpRows.revalidate();
			}
		});
		add(btnAdd);
		
		JButton btnDell = new JButton("dell");
		btnDell.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e)
			{
				jpRows.removeAll();
				jpRows.revalidate();
			}
		});
		add(btnDell);
		
		JButton btnEdit = new JButton("edit");
		add(btnEdit);
		
	}
}
