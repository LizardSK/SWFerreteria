package Aplicacion.Formularios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ver_Abono extends JFrame implements ActionListener
{
	JFrame vent=null;
	
	//COponentes
	JLabel jl_fecha=new JLabel("FECHA: ");
	JLabel jl_nom_cli=new JLabel("CLIENTE: ");
		JTextField jtf_nom_cli=new JTextField();
	JLabel jl_nom_prod=new JLabel("PRODUCTO: ");
		JTextField jtf_nom_prod=new JTextField();
	JLabel jl_cant_prod=new JLabel("CANT: ");
		JTextField jtf_cant_prod=new JTextField();
	JLabel jl_pre_prod=new JLabel("PRECIO: ");
		JTextField jtf_pre_prod=new JTextField();
	JLabel jl_adeudo=new JLabel("ADEUDO: ");
		JTextField jtf_adeudo=new JTextField();
	JLabel jl_abonos=new JLabel("ABONOS: ");
		JTable abonos=null;
		JScrollPane jsp_abonos=new JScrollPane(abonos);
		
	JButton b1=new JButton("ABONAR");
	JButton b2=new JButton("CANCELAR");
	
	
	public Ver_Abono()
	{
		vent=new JFrame("Realizar Abono");
		
		//GUI
		GUI();
		
		vent.setSize(700, 400);
		vent.setResizable(false);
		vent.setLayout(null);
		vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vent.setLocation((int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2)-350,(int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2)-200);
		vent.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==b1)
		{
			
		}
		else
		{
			if(ae.getSource()==b2)
			{
				vent.dispose();
			}
		}
	}
	
	public static void main(String [] args)
	{
		new Ver_Abono();
	}
	
	//GUI
	private void GUI()
	{
		/*vent.add(jl_fecha);
		jl_fecha.setBounds(500, 5, 100, 30);*/
		
		//Propiedades
		jtf_adeudo.setEnabled(false);
		jtf_cant_prod.setEnabled(false);
		jtf_nom_cli.setEnabled(false);
		jtf_nom_prod.setEnabled(false);
		jtf_pre_prod.setEnabled(false);
		
		vent.add(jl_nom_cli);
		jl_nom_cli.setBounds(10, 10, 100, 30);
		vent.add(jtf_nom_cli);
		jtf_nom_cli.setBounds(100, 15, 270, 20);
		vent.add(jl_adeudo);
		jl_adeudo.setBounds(430, 10, 70, 30);
		vent.add(jtf_adeudo);
		jtf_adeudo.setBounds(500, 15, 170, 20);
		
		vent.add(jl_nom_prod);
		jl_nom_prod.setBounds(10, 35, 100, 30);
		vent.add(jtf_nom_prod);
		jtf_nom_prod.setBounds(100, 40, 250, 20);
		vent.add(jl_cant_prod);
		jl_cant_prod.setBounds(370, 35, 50, 30);
		vent.add(jtf_cant_prod);
		jtf_cant_prod.setBounds(410, 40, 50, 20);
		vent.add(jl_pre_prod);
		jl_pre_prod.setBounds(480, 35, 50, 30);
		vent.add(jtf_pre_prod);
		jtf_pre_prod.setBounds(530, 40, 140, 20);
		
		vent.add(jl_abonos);
		jl_abonos.setBounds(10, 85, 100, 30);
		vent.add(jsp_abonos);
		jsp_abonos.setBounds(10, 110, 670, 190);
		
		vent.add(b1);
		b1.setBounds(190,320, 150, 40);
		vent.add(b2);
		b2.setBounds(360,320, 150, 40);
	}
}
