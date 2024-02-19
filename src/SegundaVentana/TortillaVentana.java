package SegundaVentana;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
public class TortillaVentana {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TortillaVentana window = new TortillaVentana();
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
	public TortillaVentana() {
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
			
			final JLabel lblNewLabel = new JLabel("Texto por defecto");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(50, 46, 127, 33);
			frame.getContentPane().add(lblNewLabel);
			
			final JRadioButton rb1 = new JRadioButton("Con cebolla");
			rb1.setBounds(249, 52, 103, 21);
			frame.getContentPane().add(rb1);
			
			final JRadioButton rb2 = new JRadioButton("Sin cebolla");
			rb2.setHorizontalAlignment(SwingConstants.LEFT);
			rb2.setBounds(249, 75, 103, 21);
			frame.getContentPane().add(rb2);
			
			ButtonGroup gp = new ButtonGroup();
			gp.add(rb2);
			gp.add(rb1);
		
			
			JButton btnNewButton = new JButton("Click aqui");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (rb1.isSelected()) {
						lblNewLabel.setText("Tortilla "+ rb1.getText());
					}
					if (rb2.isSelected()) {
						lblNewLabel.setText("Tortilla "+ rb2.getText());
					}
				}
					
			});
			btnNewButton.setBounds(138, 203, 96, 33);
			frame.getContentPane().add(btnNewButton);
			
			final JLabel lblNewLabel_1 = new JLabel("Papa");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(249, 131, 103, 33);
			frame.getContentPane().add(lblNewLabel_1);
			
			final JCheckBox cb2 = new JCheckBox("Mama");
			cb2.setBounds(50, 118, 93, 21);
			frame.getContentPane().add(cb2);
			
			final JCheckBox cb1 = new JCheckBox("Papa");
			cb1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			cb1.setBounds(50, 95, 93, 21);
			cb1.setSelected(true);
			frame.getContentPane().add(cb1);
			
		
			ActionListener actionCheckbox = new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					if (cb1.isSelected() && cb2.isSelected()) {
						lblNewLabel_1.setText("Papa y Mama");
						JOptionPane.showMessageDialog(null, "Papa y Mama");
					}
					if (cb1.isSelected() && !cb2.isSelected()){
						lblNewLabel_1.setText("Papa");
						JOptionPane.showMessageDialog(null, "Papa");
					}
					if (!cb1.isSelected() && cb2.isSelected()){
						lblNewLabel_1.setText("Mama");
						JOptionPane.showMessageDialog(null, "Mama");
					}
					if (!cb1.isSelected() && !cb2.isSelected()){
						lblNewLabel_1.setText("Sin seleccion");
						JOptionPane.showMessageDialog(null, "Sin seleccion");
					}
				}
				
			};
			
			cb1.addActionListener(actionCheckbox);
			cb2.addActionListener(actionCheckbox);
			
			List<JCheckBox> checkboxes = new ArrayList<JCheckBox>();
			for(Component comp: frame.getContentPane().getComponents()) {
				if(comp instanceof JCheckBox) checkboxes.add((JCheckBox)comp);
				
			}
			
			cb1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				JCheckBox c=(JCheckBox) e.getSource();
				System.out.println(e.getStateChange()+" "+c.getText());
				
			}
			});

	}

}
