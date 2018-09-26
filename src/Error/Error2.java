package Error;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Error2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Error2 frame = new Error2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Error2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(Color.BLUE);
		textPane.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textPane.setText("  Какая исключительная ситуация будет\r\n  брошена  во время выполнения\r\n  программы?");
		textPane.setBounds(10, 11, 396, 72);
		contentPane.add(textPane);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("  java.langOutOfMemotyError");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		rdbtnNewRadioButton.setBounds(10, 382, 299, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("  java.lang.RuntimeException");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		rdbtnNewRadioButton_1.setBounds(10, 356, 277, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("  java.lang.IllegalArgumentException");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		rdbtnNewRadioButton_2.setBounds(10, 330, 337, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("  java.lang.StackOverflowError");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		rdbtnNewRadioButton_3.setBounds(10, 301, 288, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JTextArea txtrPublicClassHellogoodbye = new JTextArea();
		txtrPublicClassHellogoodbye.setForeground(Color.BLUE);
		txtrPublicClassHellogoodbye.setText("    \r\n  public class Main  {\r\n\r\n       public static void main (String[] args)   {\r\n\r\n            main ( args )  ;\r\n         }\r\n   }");
		txtrPublicClassHellogoodbye.setFont(new Font("Monospaced", Font.BOLD, 13));
		txtrPublicClassHellogoodbye.setBounds(10, 104, 396, 177);
		contentPane.add(txtrPublicClassHellogoodbye);
	}
}