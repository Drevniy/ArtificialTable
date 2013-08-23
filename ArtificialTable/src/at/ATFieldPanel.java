package at;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ATFieldPanel extends JPanel
{
	String [] field = {"ID","FName","LName","Age"};
	
	public ATFieldPanel()
	{
		for (int i = 0; i < field.length; i++)
		{
			JLabel lbl = new JLabel(field[i],JLabel.CENTER);
			lbl.setPreferredSize(new Dimension(120, 20));
			add(lbl);
		}
	}
}
