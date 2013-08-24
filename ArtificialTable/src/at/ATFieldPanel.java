package at;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ATFieldPanel extends JPanel
{
	public static String [] field = {"ID","FName","LName","Age"};
	
	
	public ATFieldPanel()
	{
		setLayout(new GridLayout(1, 4));
		for (int i = 0; i < field.length; i++)
		{
			JLabel lbl = new JLabel(field[i],JLabel.CENTER);
			lbl.setPreferredSize(new Dimension(120, 20));
			add(lbl);
		}
	}
}
