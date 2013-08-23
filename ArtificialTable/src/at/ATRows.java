package at;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ATRows extends JPanel  
{
	public ATRows()
	{
		
		for (int i = 0; i < 4; i++)
		{
			JTextField txt = new JTextField();
			txt.setPreferredSize(new Dimension(130, 20));
			txt.setEnabled(false);
			add(txt);
		}
		
		addMouseListener(new MouseAdapter() {
			
					@Override
					public void mouseEntered(MouseEvent e)
					{
						
						setFocusable(true);
						setRequestFocusEnabled(true);
						requestFocus();
						
						JPanel pnl = (JPanel) e.getSource();
						pnl.setBorder(BorderFactory.createLineBorder(Color.GRAY));
						
					}
					
					@Override
					public void mouseExited(MouseEvent e)
					{
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e)
					{
						JPanel pnl = (JPanel) e.getSource();
						pnl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
					}
				});
		
		
	}
}
