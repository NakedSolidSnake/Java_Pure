package application;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Program extends JFrame{
	
	public Program () {
		initUI();
	}

	private void initUI() {
		var webIcon = new ImageIcon("src/resources/web.png");
		setIconImage(webIcon.getImage());
		
		setTitle("Icon");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			var ex = new Program();
			ex.setVisible(true);
		});

	}

}
