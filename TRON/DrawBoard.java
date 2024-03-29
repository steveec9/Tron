package tron;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * This class defines a main() routine that simply opens a window that displays a
 * TronPanel.  The frame is centered on the screen and is non-resizable.
 */

public class DrawBoard {


		public static void main(String[] args) {
			JFrame frame = new JFrame("Tron"); 
			JPanel panel = new TronPanel();
			frame.setContentPane(panel);
			frame.pack(); 
			frame.setResizable(false);
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int w = (screenSize.width - frame.getWidth()) / 2;
			int h = (screenSize.height - frame.getHeight()) / 2;
			frame.setLocation(w,h); 
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}

	}
