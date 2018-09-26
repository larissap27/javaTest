package String;

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

public class String1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String1 frame = new String1();
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
	public String1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(Color.BLUE);
		textPane.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textPane.setText("Что будет выведено в консоль после выполнения\r\n данного кода?");
		textPane.setBounds(10, 27, 396, 56);
		contentPane.add(textPane);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hello world");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		rdbtnNewRadioButton.setBounds(10, 382, 171, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Goodbye world");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		rdbtnNewRadioButton_1.setBounds(10, 356, 155, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Hello world Goodbye world");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		rdbtnNewRadioButton_2.setBounds(10, 330, 252, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Ошибка компиляции");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		rdbtnNewRadioButton_3.setBounds(10, 301, 211, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JTextArea txtrPublicClassHellogoodbye = new JTextArea();
		txtrPublicClassHellogoodbye.setText("  public class HelloGoodbye  {\r\n       public static void main (String[] args)   {\r\n               try  {\r\n                   System.out.println(\"Hello world\") ;\r\n                    System.exit(0) ;\r\n            }    finaly     {\r\n                  System.out.println(\"Goodbye world\") ;\r\n                              }\r\n                       }\r\n                }\r\n    \r\n\r\n");
		txtrPublicClassHellogoodbye.setFont(new Font("Monospaced", Font.BOLD, 11));
		txtrPublicClassHellogoodbye.setBounds(10, 104, 396, 177);
		contentPane.add(txtrPublicClassHellogoodbye);
	}

}
