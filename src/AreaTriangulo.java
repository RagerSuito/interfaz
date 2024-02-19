import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AreaTriangulo {

	private JFrame frame;
	private JTextField textBase;
	private JTextField textAltura;
	private JTextField textResul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaTriangulo window = new AreaTriangulo();
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
	public AreaTriangulo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelBase = new JLabel("Base");
		labelBase.setBounds(30, 63, 45, 13);
		frame.getContentPane().add(labelBase);
		
		JLabel baseAltura = new JLabel("Altura");
		baseAltura.setBounds(30, 99, 45, 13);
		frame.getContentPane().add(baseAltura);
		
		JLabel lblNewLabel_2 = new JLabel("Calcular Area Triangulo");
		lblNewLabel_2.setBounds(178, 22, 141, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		textBase = new JTextField();
		textBase.setBounds(88, 60, 96, 19);
		frame.getContentPane().add(textBase);
		textBase.setColumns(10);
		
		textAltura = new JTextField();
		textAltura.setBounds(88, 96, 96, 19);
		frame.getContentPane().add(textAltura);
		textAltura.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setBounds(184, 184, 96, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		textResul = new JTextField();
		textResul.setBounds(168, 207, 96, 19);
		frame.getContentPane().add(textResul);
		textResul.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(250, 59, 85, 21);
		frame.getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double base;
				double altura;
				double resultado;
				base = Double.valueOf(textBase.getText());
				altura= Integer.valueOf(textAltura.getText());
				resultado=(base*altura)/2;
				
				textResul.setText(""+resultado);
				
				
				
			}
		});
		
		
		
		
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(250, 95, 85, 21);
		frame.getContentPane().add(btnLimpiar);
		
		
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				textAltura.setText("");
				textBase.setText("");
				textResul.setText("");
				
			}
		});
	}
}
