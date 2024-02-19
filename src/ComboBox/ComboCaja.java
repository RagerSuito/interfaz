package ComboBox;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class ComboCaja {
	JComboBox comboBox;

	private JFrame frame;
	String[] datosComboBox = { "hamburgesa", "kebab", "durum", "ensalada", "cerveza" };


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboCaja window = new ComboCaja();
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
	public ComboCaja() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	void iniciarComponentes() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		JLabel et1 = new JLabel("New label");
		et1.setBounds(10, 7, 120, 61);
		frame.getContentPane().add(et1);

		comboBox = new JComboBox(datosComboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				et1.setText("" + comboBox.getSelectedItem());
			}
		});
		comboBox.setBounds(285, 10, 141, 54);
		frame.getContentPane().add(comboBox);

		JButton btn1 = new JButton("Mostrar Seleccion.");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "Se ha elegido: " + comboBox.getSelectedItem();
				JOptionPane.showMessageDialog(null, message);
			}
		});
		btn1.setBounds(218, 153, 132, 23);
		frame.getContentPane().add(btn1);

	}

	void showDialog() {
		/* show mesage dialog
		JOptionPane.showMessageDialog(null, "Quieres comer?");
		JOptionPane.showMessageDialog(null, "QUE SI QUIERES COMER.", "Alert", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "QUE ME DIGAS QUE QUIERES COMER YA TONTO.", "EXPLOSION", JOptionPane.ERROR_MESSAGE);
	*/
		//show confirm dialog
		/*
		int respuesta = JOptionPane.showConfirmDialog(null, "Señora homer Quiere uste un fresisui");
		System.out.println("Opcion escogida: "+respuesta);
		if(respuesta==1) {
			JOptionPane.showMessageDialog(null,"Salga de mi restaurante");
		}
		if(respuesta==0) {
			JOptionPane.showMessageDialog(null,"Seran 23 euricos primo");
		}
		if(respuesta==2) {
			JOptionPane.showMessageDialog(null,"No tenes verguenza pallo");
		}
		*/
		//show input dialog
		String respuesta2=JOptionPane.showInputDialog("Introduce una iocion de comida");
		JOptionPane.showMessageDialog(null,"Opcion introducida: "+ respuesta2);
		
		int respuesta3=JOptionPane.showConfirmDialog(null, "Quieres añadir algo al menu?");
		if(respuesta3==JOptionPane.YES_OPTION) {
			String alimento=JOptionPane.showInputDialog("Introduce la comida: ");
			comboBox.addItem(alimento);
		}
		
	}

	private void initialize() {
		iniciarComponentes();
		showDialog();

	}

}
