package Aplicacion.Formularios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Registro_Prod extends JFrame implements ActionListener
{
	JFrame vent=null;
	
	//Componentes
	JLabel jl_clv=new JLabel("CLAVE: ");
		JTextField jtf_clv=new JTextField();
	JLabel jl_nom=new JLabel("NOMBRE: ");
		JTextField jtf_nom=new JTextField();
	JLabel jl_des=new JLabel("DESCRIPCIÓN: ");
		JTextArea jta_des=new JTextArea();
		JScrollPane jsp_des=new JScrollPane(jta_des);
	JLabel jl_marca=new JLabel("MARCA: ");
		JTextField jtf_marca=new JTextField();
	JLabel jl_ext=new JLabel("EXISTENCIA: ");
		JTextField jtf_ext=new JTextField();
	JLabel jl_prec=new JLabel("PRECIO COMP: ");
		JTextField jtf_prec=new JTextField();
	JLabel jl_prev=new JLabel("PRECIO VENT: ");
		JTextField jtf_prev=new JTextField();
	JButton b1=new JButton("REGISTRAR");
	JButton b2=new JButton("CALCELAR");
	
	public Registro_Prod()
	{
		vent=new JFrame("Registro de Producto");
		
		GUI();
		
		vent.setSize(500, 400);
		vent.setResizable(false);
		vent.setLayout(null);
		vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vent.setLocation((int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2)-250,(int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2)-200);
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
		new Registro_Prod();
	}
	
	//Conformaion de GUI de la ventana...
	private void GUI()
	{
		vent.add(jl_clv);
		jl_clv.setBounds(10, 10, 100, 30);
		vent.add(jtf_clv);
		jtf_clv.setBounds(100, 15, 370, 20);
		vent.add(jl_nom);
		jl_nom.setBounds(10, 35, 100, 30);
		vent.add(jtf_nom);
		jtf_nom.setBounds(100, 40, 370, 20);
		vent.add(jl_des);
		jl_des.setBounds(10, 60, 100, 30);
		vent.add(jsp_des);
		jsp_des.setBounds(100, 65, 370, 135);
		vent.add(jl_marca);
		jl_marca.setBounds(10,200, 100, 30);
		vent.add(jtf_marca);
		jtf_marca.setBounds(100, 205, 370, 20);
		vent.add(jl_ext);
		jl_ext.setBounds(10,225, 100, 30);
		vent.add(jtf_ext);
		jtf_ext.setBounds(100, 230, 370, 20);
		vent.add(jl_prec);
		jl_prec.setBounds(10,250, 100, 30);
		vent.add(jtf_prec);
		jtf_prec.setBounds(100,255, 370, 20);
		vent.add(jl_prev);
		jl_prev.setBounds(10,275, 100, 30);
		vent.add(jtf_prev);
		jtf_prev.setBounds(100,280, 370, 20);
		
		vent.add(b1);
		b1.setBounds(120,310, 150, 40);
		vent.add(b2);
		b2.setBounds(290,310, 150, 40);
	}
}
