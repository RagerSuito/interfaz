import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JComboBox;

import javax.swing.JTextField;

import javax.swing.JButton;

public class ComboPeli {

	private JFrame frame;

	private JTextField text1;

	/**
	 * 
	 * Launch the application.
	 * 
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					ComboPeli window = new ComboPeli();

					window.frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	/**
	 * 
	 * Create the application.
	 * 
	 */

	public ComboPeli() {

		initialize();

	}

	/**
	 * 
	 * Initialize the contents of the frame.
	 * 
	 */

	private void initialize() {

		frame = new JFrame();

		frame.setBounds(100, 100, 450, 300);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("el titulo de una pelicula");

		lblNewLabel.setBounds(10, 24, 159, 14);

		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Peliculas");

		lblNewLabel_1.setBounds(248, 24, 101, 14);

		frame.getContentPane().add(lblNewLabel_1);

		final JComboBox combo = new JComboBox();

		combo.setBounds(193, 49, 231, 34);

		frame.getContentPane().add(combo);

		text1 = new JTextField();

		text1.setBounds(20, 49, 125, 29);

		frame.getContentPane().add(text1);

		text1.setColumns(10);

		JButton btn1 = new JButton("Añadir");

		btn1.setBounds(33, 155, 89, 23);

		frame.getContentPane().add(btn1);

		final JLabel label2 = new JLabel("");

		label2.setBounds(193, 159, 231, 14);

		frame.getContentPane().add(label2);

		btn1.addActionListener(new ActionListener() {

			int contador = 0;

			public void actionPerformed(ActionEvent e) {

				String pelicula = text1.getText();

				if (!text1.getText().trim().equals("")) {

					combo.addItem(pelicula);
					text1.setText("");
					contador++;
					label2.setText("Añadiste " + contador + " Peliculas.");
					
					combo.setSelectedItem(null);
				}

				else {
					label2.setText("No se puede añadir en blanco");
					text1.setText("");
				}

			}

		});

	}

	
	
	
	
}
