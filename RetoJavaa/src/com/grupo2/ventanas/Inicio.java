package com.grupo2.ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	
	public Inicio() {
		setMinimumSize(new Dimension(1280, 720));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setMinimumSize(new Dimension(525, 64));
		scrollPane.setBounds(51, 203, 1172, 451);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setMinimumSize(new Dimension(525, 64));
		scrollPane.setViewportView(table);

		table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
		 if (table.getColumnModel().getColumnCount() > 0) {
			 table.getColumnModel().getColumn(0).setResizable(false);
			 table.getColumnModel().getColumn(1).setResizable(false);
			 table.getColumnModel().getColumn(3).setResizable(false);
			 table.getColumnModel().getColumn(4).setResizable(false);
			 table.getColumnModel().getColumn(5).setResizable(false);
			 table.getColumnModel().getColumn(6).setResizable(false);
	        }
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(1049, 141, 174, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Buscar:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(976, 146, 81, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("GESTION DE EMPLEADOS");
		lblNewLabel_1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 70));
		lblNewLabel_1.setBounds(114, 42, 874, 103);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Añadir empleado");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 Alta_empleado p1 = new Alta_empleado();
			     p1.setVisible(true);
			     p1.setLocationRelativeTo(null);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(1049, 58, 174, 52);
		contentPane.add(btnNewButton);
	}
	private void initComponetes() {
		
		
	}
}
