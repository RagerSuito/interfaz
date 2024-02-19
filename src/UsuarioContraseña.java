import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class UsuarioContraseña {

	private JFrame frame;
	private JTextField textUsuario;
	private JPasswordField textContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioContraseña window = new UsuarioContraseña();
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
	public UsuarioContraseña() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(20, 20, 1500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel labelUsuario = new JLabel("Usuario:");
		labelUsuario.setBounds(56, 55, 43, 13);
		frame.getContentPane().add(labelUsuario);

		JLabel labelContrasena = new JLabel("Contraseña:");
		labelContrasena.setBounds(56, 90, 61, 13);
		frame.getContentPane().add(labelContrasena);

		textUsuario = new JTextField();
		textUsuario.setBounds(122, 52, 96, 19);
		frame.getContentPane().add(textUsuario);
		textUsuario.setColumns(10);

		JButton botonLim = new JButton("Limpia");
		botonLim.setBounds(10, 10, 85, 21);
		frame.getContentPane().add(botonLim);

		JButton botonLog = new JButton("LogIn");
		botonLog.setBounds(133, 130, 85, 21);
		frame.getContentPane().add(botonLog);

		JButton botonCan = new JButton("Cancela");
		botonCan.setBounds(327, 10, 85, 21);
		frame.getContentPane().add(botonCan);

		textContrasena = new JPasswordField();
		textContrasena.setBounds(122, 87, 96, 19);
		frame.getContentPane().add(textContrasena);

		JLabel labelInfo = new JLabel("");
		labelInfo.setBounds(267, 41, 736, 123);
		frame.getContentPane().add(labelInfo);

		botonLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String data = "Usuario: " + labelUsuario.getText();
				data += "," + " Contraseña: " + new String(textContrasena.getPassword());

				labelInfo.setText(data);
				int i=0;
				if(!textUsuario.getText().equals("Rodrigo"))
					
					JOptionPane.showMessageDialog(null, "El usuario no existe");
					
				if(!textContrasena.getText().equals("1234")) {
					
					
					JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
					i++;
				}
				
				if(textUsuario.getText().equals("Rodrigo")&&textContrasena.getText().equals("1234")) {
					JOptionPane.showMessageDialog(null,"Bienvenido");
				}

			}

		});

		botonCan.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});
		
		botonLim.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				textContrasena.setText(null);
				textUsuario.setText(null);
				labelInfo.setText(null);
			}
			
		});

		
		
		
		

	}
}
