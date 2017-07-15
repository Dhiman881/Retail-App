package Test;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;
//import javax.swing.JMenuBar;
//import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.JLayeredPane;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Test_1_DashBoard {

	private JFrame frame;
	private JPanel panel; 
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test_1_DashBoard window = new Test_1_DashBoard();
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
	public Test_1_DashBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1221, 716);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLayeredPane layeredPane = new JLayeredPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 837, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 837, 662);
		layeredPane.add(panel_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Description", "Rate"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(638)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 825, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(97)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(9, 0, 0, 10));
		
		JButton btnNewButton_2 = new JButton("Day to Day");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		
		JLabel lblRetailApp = new JLabel("          Retail App");
		lblRetailApp.setFont(new Font("Tahoma", Font.PLAIN, 29));
		panel.add(lblRetailApp);
		btnNewButton_2.setBackground(Color.BLACK);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Reports And Analysis");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//lblNewLabel.setText(arg0.getActionCommand());
				
			}
		});
		btnNewButton_3.setBackground(Color.BLACK);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Sales");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//lblNewLabel.setText(arg0.getActionCommand());
				//panel_1.remove(lblNewLabel);
				
			}
		});
		btnNewButton_4.setBackground(Color.BLACK);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Products");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//lblNewLabel.setText(arg0.getActionCommand());
				//lblNewLabel.setVisible(false);
				//panel_1.remove(lblNewLabel);
				
			}
		});
		btnNewButton_5.setBackground(Color.BLACK);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Accounts");
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//lblNewLabel.setText(arg0.getActionCommand());
				
			}
		});
		btnNewButton_6.setBackground(Color.BLACK);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Employees");
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//lblNewLabel.setText(arg0.getActionCommand());
				
			}
		});
		btnNewButton_7.setBackground(Color.BLACK);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton = new JButton("Stockes");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//lblNewLabel.setText(arg0.getActionCommand());
				
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		panel.add(btnNewButton);
		
		JButton btnNewButton_8 = new JButton("Settings");
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//lblNewLabel.setText(arg0.getActionCommand());
				
			}
		});
		btnNewButton_8.setBackground(Color.BLACK);
		panel.add(btnNewButton_8);
		frame.getContentPane().setLayout(groupLayout);
	}
}
