import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class LectorEscritura {

	private JFrame frame;
	private JTextField text1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LectorEscritura window = new LectorEscritura();
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
	public LectorEscritura() {
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

		text1 = new JTextField();
		text1.setBounds(221, 20, 177, 180);
		frame.getContentPane().add(text1);
		text1.setColumns(10);

		JButton btnLeer = new JButton("Leer");
		btnLeer.setBounds(43, 39, 85, 21);
		frame.getContentPane().add(btnLeer);

		btnLeer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");

				fc.setAcceptAllFileFilterUsed(false);

				fc.addChoosableFileFilter(filter);

				int resul = fc.showOpenDialog(null);

				if (resul == JFileChooser.APPROVE_OPTION) {

					try {

						File file = fc.getSelectedFile();
						BufferedReader bufer = new BufferedReader(new FileReader(file));

						String line;
						String texto = "";

						while ((line = bufer.readLine()) != null) {
							texto += line + "\n";

						}
						text1.setText(texto);

					}
					
					catch(FileNotFoundException e3) {
						JOptionPane.showConfirmDialog(null, "Malisimo", "Aprende a escribir", JOptionPane.ERROR_MESSAGE);
					}


					catch (Exception e2) {
						e2.printStackTrace();
					}
				}

			}
		});

		JButton btnEscri = new JButton("Escritura");
		btnEscri.setBounds(43, 144, 85, 21);
		frame.getContentPane().add(btnEscri);

		btnEscri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				fc.setAcceptAllFileFilterUsed(false);
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
				fc.addChoosableFileFilter(filter);
				int resul = fc.showSaveDialog(null);

				if (resul == JFileChooser.APPROVE_OPTION) {

					File file = fc.getSelectedFile();
					String cont = text1.getText();

					try {

						FileWriter fw = new FileWriter(file, true);
						fw.write(cont);						
						fw.close();

					}
					
					catch(FileNotFoundException e3) {
						JOptionPane.showConfirmDialog(null, "Malisimo", "Aprende a escribir", JOptionPane.ERROR_MESSAGE);
					}

					catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				

			}
		});

	}
}
