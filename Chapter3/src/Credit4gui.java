import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Credit4gui {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private final JLabel FN = new JLabel("New label");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit4gui window = new Credit4gui();
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
	public Credit4gui() {
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		FN.setBounds(194, 5, 46, 14);
		panel.add(FN);
		
		JLabel lblNewLabel = new JLabel("First Name ");
		lblNewLabel.setBounds(34, 42, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(34, 93, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(92, 39, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(92, 90, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setBounds(34, 134, 46, 14);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(92, 131, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DIS.setText("First Name:"+ "Last Name")
			}
		});
		btnNewButton.setBounds(224, 38, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(224, 130, 89, 23);
		panel.add(btnNewButton_1);
	}
}
