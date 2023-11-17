package cadastros;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class cadgui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadgui window = new cadgui();
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
	public cadgui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame();
		frame.setName("CADASTROS");
		frame.setBounds(100, 100, 600, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(92, 9, 114, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 39, 114, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(92, 70, 114, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(92, 101, 114, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 11, 80, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nascimento:");
		lblNewLabel_1.setBounds(10, 39, 80, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1.setBounds(10, 73, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("EMAIL:");
		lblNewLabel_1_1_1.setBounds(10, 104, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		btnNewButton = new JButton("Cadastro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(92, 132, 114, 23);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setToolTipText("");
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{},
			},
			new String[] {
			}
		));
		table.setBounds(234, 9, 340, 429);
		
		frame.getContentPane().add(table);
	}
}
