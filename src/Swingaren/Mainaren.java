package Swingaren;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mainaren extends JFrame implements WindowListener {

	public Mainaren() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = this.getContentPane();

		this.addWindowListener(this);

		addButtons(contentPane);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		this.setSize(tk.getScreenSize().width, tk.getScreenSize().height);
		this.setUndecorated(true);
		this.setOpacity(0.80f);
		this.setLocationRelativeTo(null);
	}


	public void addButtons(Container contentPane) {
		JButton okButton = new JButton("ok");
        contentPane.add(okButton,BorderLayout.NORTH);
		okButton.addActionListener(e -> buttonAction());
		
		JButton closeButton = new JButton("BACK");
		contentPane.add(okButton,BorderLayout.WEST);
		okButton.addActionListener(e -> buttonAction());
	}
  
	public void buttonAction() {
	 System.out.println("OK button pressed!");
	}

	public static void main(String[] args) {
		Mainaren frame = new Mainaren();
		frame.setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");

	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");

	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");

	}

}