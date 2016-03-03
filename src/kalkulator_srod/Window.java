package kalkulator_srod;

import java.awt.EventQueue;

import javax.swing.JFrame;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.util.Calendar;

public class Window {

	private JFrame frame;
	private Calendar start, end;
	
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
	public Window() {
		initialize();
	}

	private void initialize() {
		

		//wygenerowane automatycznie
		//obowi¹zkowe œmieszne komentarze
		frame = new JFrame();
		frame.setBounds(100, 100, 220, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		JLabel lblDoKocaRoku = new JLabel("Do ko\u0144ca roku jeszcze");
		lblDoKocaRoku.setFont(new Font("Open Sans", Font.PLAIN, 18));
		lblDoKocaRoku.setBounds(10, 11, 195, 48);
		frame.getContentPane().add(lblDoKocaRoku);
		
		JLabel labelNumOfWed = new JLabel("90", SwingConstants.CENTER);
		labelNumOfWed.setForeground(SystemColor.textHighlight);
	    labelNumOfWed.setVerticalAlignment(SwingConstants.CENTER);
		labelNumOfWed.setFont(new Font("Open Sans", Font.PLAIN, 150));
		labelNumOfWed.setBounds(0, 59, 214, 127);
		
		frame.getContentPane().add(labelNumOfWed);
		
		JLabel labelWed = new JLabel("", SwingConstants.CENTER);
		labelWed.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelWed.setBounds(10, 197, 195, 45);
		frame.getContentPane().add(labelWed);
		
		//co za spaghetti!
		//nie bój nic, na szczêœcie œwinka bezpieczeñstwa przyby³a!
		//                               _
		//  _._ _..._ .-',     _.._(`))
		// '-. `     '  /-._.-'    ',/
		//    )         \            '.
		//   / _    _    |             \
		//  |  a    a    /              |
		//  \   .-.                     ;  
		//   '-('' ).-'       ,'       ;
		//      '-;           |      .'
		//         \           \    /
		//         | 7  .__  _.-\   \
		//         | |  |  ``/  /`  /
		//        /,_|  |   /,_/   /
		//           /,_/      '`-'

		start = Calendar.getInstance();

		end = Calendar.getInstance();
		end.set(Calendar.YEAR, 2016);
		end.set(Calendar.MONTH, Calendar.JUNE);
		end.set(Calendar.DAY_OF_MONTH, 24);

		if (start.compareTo(end) > 0) {
			JOptionPane.showMessageDialog(null, "Data wa¿noœci programu minê³a.", "To koniec!", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		Simulation sim = new Simulation(end, start);
		
		int numOfWeds = sim.howManyWeds();
		
		if (numOfWeds == 1)
			labelWed.setText("œroda");
		else if (numOfWeds == 0)
			labelWed.setText("œród");
		else if (numOfWeds >= 2 && numOfWeds <=4)
			labelWed.setText("œrody");
		else if (numOfWeds >= 5 && numOfWeds <= 21)
			labelWed.setText("œród");

		
		labelNumOfWed.setText(Integer.toString(numOfWeds));
	}
}
