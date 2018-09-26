package javaTest;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Collection.Collection1;
import Collection.Collection2;
import Collection.Collection3;
import Collection.Collection4;
import Error.Error1;
import Error.Error2;
import Error.Error3;
import Error.Error4;
import String.String1;
import String.String2;
import String.String3;
import String.String4;

public class TestMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestMain frame = new TestMain();
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
	public TestMain() {
		
		Error1 frame1 = new Error1();
		frame1.setVisible(false);
		
		Error2 frame2 = new Error2();
		frame2.setVisible(false);
		
		Error3 frame3 = new Error3();
		frame3.setVisible(false);
		
		Error4 frame4 = new Error4();
		frame4.setVisible(false);
		//////////////////////////////////
		
		String1 frame5 = new String1();
		frame5.setVisible(false);
		
		String2 frame6 = new String2();
		frame6.setVisible(false);
		
		String3 frame7 = new String3();
		frame7.setVisible(false);
		
		String4 frame8 = new String4();
		frame8.setVisible(false);
		/////////////////////////////////////
		
		Collection1 frame9 = new Collection1();
		frame9.setVisible(false);
		
		Collection2 frame10 = new Collection2();
		frame10.setVisible(false);
		
		Collection3 frame11 = new Collection3();
		frame11.setVisible(false);
		
		Collection4 frame12 = new Collection4();
		frame12.setVisible(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setToolTipText("");
		panel.setForeground(Color.CYAN);
		contentPane.add(panel);
		
		
		JTextField textField = new JTextField();
		textField.setText("выберите тему:");
		textField.setBounds(26, 6, 216, 33);
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField.setForeground(new Color(0, 0, 255));
		textField.setBackground(Color.black);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(" Error&Exception ");
		rdbtnNewRadioButton.setBounds(26, 76, 251, 35);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		rdbtnNewRadioButton.setForeground(Color.BLACK);
		rdbtnNewRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
			frame1.setVisible(true);
		}
		});
		rdbtnNewRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
			frame2.setVisible(true);
		}
		});
		rdbtnNewRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
			frame3.setVisible(true);
		}
		});
		rdbtnNewRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
			frame4.setVisible(true);
		}
		});
		
		
		
		JRadioButton rdbtnButton = new JRadioButton(" String ");
		rdbtnButton.setBounds(-196, 131, 341, 35);
		rdbtnButton.setHorizontalAlignment(SwingConstants.TRAILING);
		rdbtnButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		rdbtnButton.setForeground(Color.BLACK);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
			frame5.setVisible(true);
		}
		});
		rdbtnNewRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
			frame6.setVisible(true);
		}
		});
		rdbtnNewRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
			frame7.setVisible(true);
		}
		});
		rdbtnNewRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
			frame8.setVisible(true);
		}
		});
		
		JRadioButton rdbtnButton_1 = new JRadioButton(" Collection ");
		rdbtnButton_1.setBounds(26, 197, 163, 35);
		rdbtnButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		rdbtnButton_1.setForeground(Color.BLACK);
		panel.setLayout(null);
		panel.add(textField);
		panel.add(rdbtnNewRadioButton);
		panel.add(rdbtnButton);
		panel.add(rdbtnButton_1);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
			frame9.setVisible(true);
		}
		});
		rdbtnNewRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
			frame10.setVisible(true);
		}
		});
		rdbtnNewRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
			frame11.setVisible(true);
		}
		});
		rdbtnNewRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
			frame12.setVisible(true);
		}
		});
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setText("1111");
		passwordField.setBounds(512, 239, 40, 20);
		panel.add(passwordField);
		
		JTextField txtAdmin = new JTextField();
		txtAdmin.setText("admin");
		txtAdmin.setBounds(512, 209, 40, 20);
		panel.add(txtAdmin);
		txtAdmin.setColumns(10);
		
		
		
		
		
		
	}

}
