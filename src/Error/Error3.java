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

public class Error3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Error3 frame = new Error3();
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
	public Error3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(Color.BLUE);
		textPane.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textPane.setText(" Какая исключительная ситуация\r\n будет брошена во время \r\n выполнения программы?");
		textPane.setBounds(10, 11, 396, 72);
		contentPane.add(textPane);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("  java.lang.ArithmeticException");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		rdbtnNewRadioButton.setBounds(10, 382, 292, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("  java.lang.RuntimeException");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		rdbtnNewRadioButton_1.setBounds(10, 356, 281, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("  java.lang.NullPointerException");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		rdbtnNewRadioButton_2.setBounds(10, 330, 308, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("  java.lang.ClassCastException");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		rdbtnNewRadioButton_3.setBounds(10, 301, 308, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JTextArea txtrPublicClassHellogoodbye = new JTextArea();
		txtrPublicClassHellogoodbye.setForeground(Color.BLUE);
		txtrPublicClassHellogoodbye.setText(" \r\n public class Main   {\r\n       public static void main (String[] args)   {\r\n\r\n              Number  n  =  new Integer  (OxOFF) ;\r\n             Short  s  = ( Short )  n  ;\r\n    \r\n      System.out.println ( s ) ;\r\n            }\r\n     }");
		txtrPublicClassHellogoodbye.setFont(new Font("Monospaced", Font.BOLD, 13));
		txtrPublicClassHellogoodbye.setBounds(10, 104, 396, 184);
		contentPane.add(txtrPublicClassHellogoodbye);
	}
}