package at;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ATFrame extends JFrame
{
	public ATFrame()
	{
		setBounds(320, 200, 600, 400);
		
		JPanel jpRows = new JPanel();
		jpRows.setPreferredSize(new Dimension(600, 200));
		JScrollPane scroll = new  JScrollPane(jpRows);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jpRows.add(new ATRows());
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new ATFieldPanel(),BorderLayout.NORTH);
		add(scroll, BorderLayout.CENTER);
		add(new ATButtonPanel(jpRows), BorderLayout.SOUTH);
		setVisible(true);
	}
}
