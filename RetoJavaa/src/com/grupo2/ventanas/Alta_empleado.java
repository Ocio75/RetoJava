package com.grupo2.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;

import com.grupo2.MensaEmergentes;
import com.grupo2.objetos.Empleado;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alta_empleado extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
    private String [] puestos={"","",""};
    private JPanel bg;
    private JButton btEnviar;
    private JComboBox<String> jcPuesto;
    private JLabel lblAntiguedad;
    private JLabel lblApellidos;
    private JLabel lblDni;
    private JLabel lblEncabezado;
    private JLabel lblNSeguridad;
    private JLabel lblNombre;
    private JLabel lblPaswd;
    private JLabel lblPaswd2;
    private JLabel lblPuesto;
    private JTextField txtApellido;
    private JTextField txtDni;
    private JTextField txtNSeguridad;
    private JTextField txtNombre;
    private JTextField txtPaswd;
    private JTextField txtPaswd2;

	public Alta_empleado() {
	     initCOmponentes();
	     lblEncabezado.setText("AÑADIR EMPLEADO");
	     btEnviar.setText("AÑADIR");
	}
	public Alta_empleado(Empleado emple) {
	     initCOmponentes();
	     lblEncabezado.setText("MODIFICAR EMPLEADO");
	     btEnviar.setText("MODIFICAR");
	     txtDni.enable(false);
         selecCombo(jcPuesto,"");

        
	}
	private void initCOmponentes() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setMinimumSize(new Dimension(630, 390));
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblEncabezado = new JLabel("New label");
		lblEncabezado.setBounds(228, 10, 337, 32);
		contentPanel.add(lblEncabezado);
		
		 lblDni = new JLabel("DNI");
		lblDni.setBounds(68, 98, 45, 13);
		contentPanel.add(lblDni);
		
		 lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(249, 98, 45, 13);
		contentPanel.add(lblNombre);
		
		 lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(435, 98, 45, 13);
		contentPanel.add(lblApellidos);
		
		 lblPuesto = new JLabel("Puesto");
		lblPuesto.setBounds(68, 182, 45, 13);
		contentPanel.add(lblPuesto);
		
		 lblAntiguedad = new JLabel("Antiguedad");
		lblAntiguedad.setBounds(249, 182, 79, 13);
		contentPanel.add(lblAntiguedad);
		
		 lblNSeguridad = new JLabel("Nº Seguridad Social");
		lblNSeguridad.setBounds(435, 182, 97, 13);
		contentPanel.add(lblNSeguridad);
		
		 lblPaswd = new JLabel("Contraseña");
		lblPaswd.setBounds(249, 269, 79, 13);
		contentPanel.add(lblPaswd);
		
		 lblPaswd2 = new JLabel("Confirma la contraseña");
		lblPaswd2.setBounds(435, 269, 110, 13);
		contentPanel.add(lblPaswd2);
		setModal(true);
		
		 btEnviar = new JButton("New button");
		btEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(btEnviar.getText().toString().equals("AÑADIR")){
			        if(!comprobarPaswd()){
			           MensaEmergentes.alerta(4,"Las contraseñas no coinciden","Error");
			         }
			            
			     }else if(btEnviar.getText().toString().equals("MODIFICAR")){
			    	 if(!comprobarPaswd()){
				           MensaEmergentes.alerta(4,"Las contraseñas no coinciden","Error");
				         }
			      }
			}
		});
		btEnviar.setBounds(68, 277, 110, 47);
		contentPanel.add(btEnviar);
		
		JDateChooser jdcAntiguedad = new JDateChooser();
		jdcAntiguedad.setBounds(245, 205, 130, 32);
		contentPanel.add(jdcAntiguedad);
		
		 jcPuesto = new JComboBox();
		jcPuesto.setBounds(68, 205, 130, 32);
		contentPanel.add(jcPuesto);
		
		txtDni = new JTextField();
		txtDni.setBounds(68, 121, 130, 32);
		contentPanel.add(txtDni);
		txtDni.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(245, 121, 130, 32);
		contentPanel.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(435, 121, 130, 32);
		contentPanel.add(txtApellido);
		
		txtNSeguridad = new JTextField();
		txtNSeguridad.setColumns(10);
		txtNSeguridad.setBounds(435, 205, 130, 32);
		contentPanel.add(txtNSeguridad);
		
		txtPaswd2 = new JTextField();
		txtPaswd2.setColumns(10);
		txtPaswd2.setBounds(435, 285, 130, 32);
		contentPanel.add(txtPaswd2);
		
		txtPaswd = new JTextField();
		txtPaswd.setColumns(10);
		txtPaswd.setBounds(245, 285, 130, 32);
		contentPanel.add(txtPaswd);
		 lblEncabezado.putClientProperty("FlatLaf.style", "font:bold  $h1.font");
	        lblAntiguedad.putClientProperty("FlatLaf.style", "font:  $h4.font");
	        lblDni.putClientProperty("FlatLaf.style", "font:  $h4.font");
	        lblNSeguridad.putClientProperty("FlatLaf.style", "font:  $h4.font");
	        lblNombre.putClientProperty("FlatLaf.style", "font:  $h4.font");
	        lblApellidos.putClientProperty("FlatLaf.style", "font:  $h4.font");  
	        lblPuesto.putClientProperty("FlatLaf.style", "font:  $h4.font");        
	        lblPaswd.putClientProperty("FlatLaf.style", "font:  $h4.font");
	        lblPaswd2.putClientProperty("FlatLaf.style", "font:  $h4.font"); 
	        llenarCombo(puestos,jcPuesto);
	}
	 private boolean comprobarPaswd(){
	        boolean dev=false;
	        if(lblPaswd.getText().toString().equals(lblPaswd2.getText().toString())){
	            dev=true;
	        }        
	        return(dev);
	    }
	 public static void llenarCombo (String[] valores, JComboBox combo){
         combo.removeAllItems();
         for (String valor : valores) {
             combo.addItem(valor);
         }
     }
	 public static void selecCombo(JComboBox comboBox, String valorBuscado) {
	        for (int i = 0; i < comboBox.getItemCount(); i++) {
	            Object item = comboBox.getItemAt(i);
	            if (item != null && item.equals(valorBuscado)) {
	                comboBox.setSelectedIndex(i);
	                return; 
	            }
	        }
	    }
	
}
