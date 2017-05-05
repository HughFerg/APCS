package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class TinyWindow extends JFrame implements ActionListener {

	public TinyWindow() {

		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		Dimension dem = Toolkit.getDefaultToolkit().getScreenSize();

		setTitle("Yeah");
		setSize(465, 300);
		setLocation((int) (dem.width / 2 - this.getSize().width / 2), dem.height / 2 - this.getSize().height / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());

		JButton b1 = new JButton();
		b1.setSize(150, 50);
		b1.setVisible(true);
		b1.setText("Cyan");
		add(b1);
		b1.setLocation(0, 0);
		b1.setActionCommand("cyan");
		b1.addActionListener(this);

		JButton b2 = new JButton();
		b2.setSize(150, 50);
		b2.setVisible(true);
		b2.setText("Fuschia");
		add(b2);
		b2.setLocation(150, 0);
		b2.setActionCommand("fuschia");
		b2.addActionListener(this);

		JButton b3 = new JButton();
		b3.setSize(150, 50);
		b3.setVisible(true);
		b3.setText("Macaroni + Cheese");
		add(b3);
		b3.setLocation(300, 0);
		b3.setActionCommand("macaroni and cheese");
		b3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent a) {
		if (a.getActionCommand().equals("cyan")) getContentPane().setBackground(Color.CYAN);
		if (a.getActionCommand().equals("fuschia")) getContentPane().setBackground(Color.PINK);
		if (a.getActionCommand().equals("macaroni and cheese")) getContentPane().setBackground(Color.YELLOW);
	}

	public static void main(String[] args) {
		TinyWindow first = new TinyWindow();
	}

}
