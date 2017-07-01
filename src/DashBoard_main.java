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

public class DashBoard_main {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JPanel panel; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard_main window = new DashBoard_main();
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
	public DashBoard_main() {
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
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		
		lblNewLabel = new JLabel("           New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 780, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(41, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(153)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(89, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(9, 0, 0, 10));
		
		JButton btnNewButton_2 = new JButton("Day to Day");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText(arg0.getActionCommand());
				
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
				lblNewLabel.setText(arg0.getActionCommand());
				
			}
		});
		btnNewButton_3.setBackground(Color.BLACK);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Sales");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText(arg0.getActionCommand());
				panel_1.remove(lblNewLabel);
				
			}
		});
		btnNewButton_4.setBackground(Color.BLACK);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Products");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText(arg0.getActionCommand());
				//lblNewLabel.setVisible(false);
				panel_1.remove(lblNewLabel);
				
			}
		});
		btnNewButton_5.setBackground(Color.BLACK);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Accounts");
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText(arg0.getActionCommand());
				
			}
		});
		btnNewButton_6.setBackground(Color.BLACK);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Employees");
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText(arg0.getActionCommand());
				
			}
		});
		btnNewButton_7.setBackground(Color.BLACK);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton = new JButton("Stockes");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText(arg0.getActionCommand());
				
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		panel.add(btnNewButton);
		
		JButton btnNewButton_8 = new JButton("Settings");
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText(arg0.getActionCommand());
				
			}
		});
		btnNewButton_8.setBackground(Color.BLACK);
		panel.add(btnNewButton_8);
		frame.getContentPane().setLayout(groupLayout);
	}
}
