package at;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ATDialog extends JDialog
{
	public ATDialog (JFrame atFrame)
	{
		super(atFrame,true);
		setBounds(300, 200, 200, 200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new GridLayout(1, 2));
		addElements();
		setVisible(true);
	}
	
	public void addElements()
	{
		JPanel jpLbl = new JPanel();
		jpLbl.setLayout(new GridLayout(5, 1,10,8));
		for (int i = 0; i < ATFieldPanel.field.length; i++)
		{
			JLabel lbl  = new JLabel(" "+ATFieldPanel.field[i]);
			jpLbl.add(lbl);
		}
		this.add(jpLbl);
		
		JPanel jpTxt = new JPanel();
		jpTxt.setLayout(new GridLayout(5, 1,10,8));
		final ArrayList<JTextField> txtField = new ArrayList<>();
		
		JTextField txtID = new JTextField();
		JTextField txtFN = new JTextField();
		JTextField txtLN = new JTextField();
		JTextField txtAge = new JTextField();
		
		txtField.add(txtID);
		txtField.add(txtFN);
		txtField.add(txtLN);
		txtField.add(txtAge);
		
		for (int i = 0; i < ATFrame.jpRows.getComponentCount(); i++)
		{
			JPanel selPanel = (JPanel) ATFrame.jpRows.getComponent(i);
			
			if(selPanel.isFocusable())
			{
				for (int j = 0; j < 4; j++)
				{
					JTextField txt = (JTextField)selPanel.getComponent(j);
					txtField.get(j).setText(txt.getText());
					jpTxt.add(txtField.get(j));
				}
			}
		}
		this.add(jpTxt);
		
		JButton ok = new JButton("Ok");
		jpLbl.add(ok);
		JButton cancel = new JButton("Cancel");
		jpTxt.add(cancel);
		
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				for (int i = 0; i < ATFrame.jpRows.getComponentCount(); i++)
				{
					JPanel selPanel = (JPanel) ATFrame.jpRows.getComponent(i);
					
					if(selPanel.isFocusable())
					{
						for (int j = 0; j < 4; j++)
						{
							JTextField txt = (JTextField)selPanel.getComponent(j);
							txt.setText(txtField.get(j).getText());
						}
					}
				}
				dispose();
			}
		});
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
	}
}
