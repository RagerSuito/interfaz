import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class djksjakldjsa {

	public static void main(String[] args) {

		JFrame frame = new JFrame("File Explorer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private static void placeComponents(final JPanel panel) {
		panel.setLayout(null);

		JButton browseButton = new JButton("Browse");
		browseButton.setBounds(150, 20, 80, 25);
		panel.add(browseButton);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(50, 60, 300, 180);
		panel.add(textArea);

		browseButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

				int option = fileChooser.showOpenDialog(null);
				if (option == JFileChooser.APPROVE_OPTION) {
					File selectedDirectory = fileChooser.getSelectedFile();
					listFiles(selectedDirectory, textArea);
				}
			}
		});
	}

	private static void listFiles(File directory, JTextArea textArea) {
		if (directory.isDirectory()) {
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					textArea.append(file.getName() + "\n");
				}
			} else {
				textArea.setText("No se encontraron archivos en el directorio.");
			}
		} else {
			textArea.setText("Selecciona un directorio válido.");
		}
	}

}
