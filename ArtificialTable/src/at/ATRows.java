package at;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ATRows extends JPanel  
{
	public ATRows()
	{
		setLayout(new GridLayout(1, 4));
		for (int i = 0; i < 4; i++)
		{
			JTextField txt = new JTextField();
			txt.setPreferredSize(new Dimension(130, 20));
			txt.setDisabledTextColor(Color.BLACK);
			txt.setEnabled(false);
			
			txt.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseEntered(MouseEvent e)
				{
					JTextField txt = (JTextField) e.getSource();
					JPanel pnl = (JPanel) txt.getParent();
					pnl.setBorder(BorderFactory.createLineBorder(Color.GRAY));
					
				}
				
				@Override
				public void mouseExited(MouseEvent e)
				{
					JTextField txt = (JTextField) e.getSource();
					JPanel pnl = (JPanel) txt.getParent();
					pnl.setBorder(BorderFactory.createEmptyBorder());
				}
				
				@Override
				public void mouseClicked(MouseEvent e)
				{
					for (int i = 0; i < ATFrame.jpRows.getComponentCount(); i++)
					{
						JPanel pnl = (JPanel) ATFrame.jpRows.getComponent(i);
						if(pnl.isFocusable())
							{
								pnl.setFocusable(false);
							for (int n = 0; n < 4; n++)
								{
									JTextField txt_child = (JTextField)pnl.getComponent(n);
									txt_child.setBackground(Color.WHITE);
								}	
							}
					}
					JTextField txt = (JTextField) e.getSource();
					JPanel pnl = (JPanel) txt.getParent();
					 
					pnl.setFocusable(true);
					for (int i = 0; i < 4; i++)
					{
						JTextField txt_child = (JTextField)pnl.getComponent(i);
						txt_child.setBackground(Color.getHSBColor(0.5f, 0.122f, 1f));
					}
				}
			});
			
			add(txt);
		}
	}
}
