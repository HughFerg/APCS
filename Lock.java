package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lock extends JFrame implements ActionListener {

	ArrayList<String> p = new ArrayList<String>();;

	public Lock() {

		JFrame content = new JFrame();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension dem = Toolkit.getDefaultToolkit().getScreenSize();

		content.setTitle("Lock Screen");
		content.setSize(500, 500);
		content.setLocation((int) (dem.width / 2 - this.getSize().width / 2), dem.height / 2 - this.getSize().height / 2);
		content.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints con = new GridBagConstraints();
		Insets insets = new Insets(10, 10, 10, 10);
		con.insets = insets;

		JButton b1 = new JButton("1");
		b1.setSize(50, 50);
		b1.setActionCommand("1");
		b1.addActionListener(this);
		con.gridx = 0;
		con.gridy = 1;
		grid.setConstraints(b1, con);

		JButton b2 = new JButton("2");
		b2.setSize(50, 50);
		b2.setActionCommand("2");
		b2.addActionListener(this);
		con.gridx = 1;
		con.gridy = 1;
		grid.setConstraints(b2, con);

		JButton b3 = new JButton("3");
		b3.setSize(50, 50);
		b3.setActionCommand("3");
		b3.addActionListener(this);
		con.gridx = 2;
		con.gridy = 1;
		grid.setConstraints(b3, con);

		JButton b4 = new JButton("4");
		b4.setSize(50, 50);
		b4.setActionCommand("4");
		b4.addActionListener(this);
		con.gridx = 0;
		con.gridy = 2;
		grid.setConstraints(b4, con);

		JButton b5 = new JButton("5");
		b5.setSize(50, 50);
		b5.setActionCommand("5");
		b5.addActionListener(this);
		con.gridx = 1;
		con.gridy = 2;
		grid.setConstraints(b5, con);

		JButton b6 = new JButton("6");
		b6.setSize(50, 50);
		b6.setActionCommand("6");
		b6.addActionListener(this);
		con.gridx = 2;
		con.gridy = 2;
		grid.setConstraints(b6, con);

		JButton b7 = new JButton("7");
		b7.setSize(50, 50);
		b7.setActionCommand("7");
		b7.addActionListener(this);
		con.gridx = 0;
		con.gridy = 3;
		grid.setConstraints(b7, con);

		JButton b8 = new JButton("8");
		b8.setSize(50, 50);
		b8.setActionCommand("8");
		b8.addActionListener(this);
		con.gridx = 1;
		con.gridy = 3;
		grid.setConstraints(b8, con);

		JButton b9 = new JButton("9");
		b9.setSize(50, 50);
		b9.setActionCommand("9");
		b9.addActionListener(this);
		con.gridx = 2;
		con.gridy = 3;
		grid.setConstraints(b9, con);

		JButton b0 = new JButton("0");
		b0.setSize(50, 50);
		b0.setActionCommand("0");
		b0.addActionListener(this);
		con.gridx = 1;
		con.gridy = 4;
		grid.setConstraints(b0, con);

		JLabel title = new JLabel("Enter Your Password");
		title.setSize(450, 400);
		title.setBackground(Color.yellow);
		con.gridx = 1;
		con.gridy = 0;
		grid.setConstraints(title,con);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 300);
		panel.setLayout(grid);
		panel.setBackground(Color.LIGHT_GRAY);

		panel.setVisible(true);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b0);
		panel.add(title);

		content.add(panel);
		content.setVisible(true);
	}

	void checkPassword(String c) {

		p.add(c);
		
		if (p.size() == 4)
		{
			if(p.get(0) == "6" && p.get(1) == "9" && p.get(2) == "6" && p.get(3) == "9") inOrOut(true);
			else inOrOut(false);
		}
	}
	
	void inOrOut(boolean a)
	{
		Dimension dem = Toolkit.getDefaultToolkit().getScreenSize();
		
		
		JFrame response = new JFrame("You're in!");
		response.setSize(400, 400);
		
		JLabel text = new JLabel();
		text.setText("Congrats on getting in and all that");
		text.setLocation(getWidth() / 2, getHeight() / 2);
		response.add(text);
		response.setVisible(false);
		response.setLocation(dem.width / 2 - this.getSize().width / 2, dem.height / 2 - this.getSize().height / 2);
		
		if (a) response.setVisible(true);
		else 
		{
			response.setTitle("Nice try");
			text.setText("See you in court");
			text.setForeground(Color.red);
			response.setVisible(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		checkPassword(a.getActionCommand());
	}

	public static void main(String[] args) {
		Lock lock = new Lock();
	}
}
