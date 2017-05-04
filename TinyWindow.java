package GUI;
// File   : gui-tutorial/tw/TinyWindow.java

import java.awt.FlowLayout;

// Purpose: Create a very small window!  
//          This is about the smallest possible GUI program.
//          It does nothing, but close box and window resizing work.
// Author : Fred Swartz - 2006-11-09

//Note 1
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class TinyWindow extends JFrame {

	public TinyWindow() {
		setTitle("Yeah");
		setSize(500, 500);
		setLocation(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());
	}

	public static void main(String[] args) {
		TinyWindow first = new TinyWindow();

		JFrame window = new JFrame();
		window.show();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
