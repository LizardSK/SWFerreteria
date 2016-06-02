package Aplicacion.Formularios;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Registrar_Abono extends JFrame implements ActionListener
{
	JFrame vent=null;
	
	//Componentes
	JLabel jl_abono=new JLabel("ABONO: ");
		JTextField jtf_abono=new JTextField();
	JButton b1=new JButton("REALIZAR");
	JButton b2=new JButton("CANCELAR");
	
	public Registrar_Abono()
	{
		vent=new JFrame("Abonar");
		
		//GUI
		GUI();
		
		vent.setSize(300, 150);
		vent.setResizable(false);
		vent.setLayout(null);
		vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vent.setLocation((int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2)-150,(int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2)-75);
		vent.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
	}
	
	public static void main(String [] args)
	{
		new Registrar_Abono();
	}
	
	//GUI
	private void GUI()
	{
		vent.add(jl_abono);
		jl_abono.setBounds(10, 20, 50, 30);
		vent.add(jtf_abono);
		jtf_abono.setBounds(60, 25, 220, 20);
		
		vent.add(b1);
		b1.setBounds(20,55, 120, 40);
		vent.add(b2);
		b2.setBounds(150,55, 120, 40);
	}
}
