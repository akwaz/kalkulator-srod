package kalkulator_srod;

import java.awt.EventQueue;

import javax.swing.JFrame;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Window {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 221, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		JLabel lblDoKocaRoku = new JLabel("Do ko\u0144ca roku jeszcze");
		lblDoKocaRoku.setFont(new Font("Open Sans", Font.PLAIN, 18));
		lblDoKocaRoku.setBounds(10, 11, 195, 48);
		frame.getContentPane().add(lblDoKocaRoku);
		
		JLabel labelNumOfWed = new JLabel("90", SwingConstants.CENTER);
		labelNumOfWed.setForeground(SystemColor.textHighlight);
	    labelNumOfWed.setVerticalAlignment(SwingConstants.CENTER);
		labelNumOfWed.setFont(new Font("Open Sans", Font.PLAIN, 150));
		labelNumOfWed.setBounds(0, 59, 205, 127);
		
		frame.getContentPane().add(labelNumOfWed);
		
		JLabel labelWed = new JLabel("New label");
		labelWed.setBounds(73, 217, 46, 14);
		frame.getContentPane().add(labelWed);
		
		
		Simulation sim = new Simulation();
		
	}
}
