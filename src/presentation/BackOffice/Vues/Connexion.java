package presentation.BackOffice.Vues;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import presentation.BackOffice.Controlleur.ControlleurConnexion;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.awt.Color;

import java.awt.Button;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Connexion extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPanel panel;
	private JLabel lblEnsa;
	private Button LogIn;
	private JLabel lblUSER;
	private JLabel lblPassword;
	private ControlleurConnexion ControlleurConnexion;
	
	
	
	public Connexion(ControlleurConnexion  c) {
		super();
		this.initialiser();
		this.dessiner();
		this.login();
		this.ControlleurConnexion = c;
	}
	
	public void initialiser() {
		contentPane = new JPanel();
		panel = new JPanel();
		lblEnsa = new JLabel("");
		textField = new JTextField();
		LogIn = new Button("Log in");
		lblUSER = new JLabel("USERNAME");
		lblPassword = new JLabel("PASSWORD");
		passwordField = new JPasswordField();
	}
	
	public void dessiner() {
		setBackground(new Color(255, 255, 255));
		setFont(new Font("Consolas", Font.PLAIN, 12));
		setTitle("Connexion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 420);
		
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 325, 381);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		lblEnsa.setBounds(49, 73, 206, 206);
		lblEnsa.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEnsa.setIcon(new ImageIcon("C:\\Users\\kerbo\\OneDrive\\Documents\\NetBeansProjects\\Gestion de projet\\src\\presentation\\img\\ensakhouribga.couleur-206x206.png"));
		panel.add(lblEnsa);
		
		
		LogIn.setFont(new Font("Dialog", Font.PLAIN, 16));
		LogIn.setForeground(Color.WHITE);
		LogIn.setBackground(Color.RED);
		LogIn.setActionCommand("Log in\r\n");
		
		LogIn.setBounds(454, 257, 132, 36);
		contentPane.add(LogIn);
		
		
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(373, 106, 270, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		lblUSER.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUSER.setBounds(374, 59, 159, 36);
		contentPane.add(lblUSER);
		
		
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(374, 153, 111, 36);
		contentPane.add(lblPassword);
		
		
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(373, 200, 270, 36);
		contentPane.add(passwordField);
	}
	
	public void login() {
		LogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = textField.getText();
				String pass = passwordField.getText();
				ControlleurConnexion.HandleLogIn(user,pass);
				}
		});
	}
	
}
