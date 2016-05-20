package Aplicacion;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
	JFrame vent=null;
	
	//Componentes
	JLabel jl_id=new JLabel("Usuario: ");
	JLabel jl_pass=new JLabel("Contraseña: ");
	JTextField jtf_id=new JTextField();
	JPasswordField jpf_pass=new JPasswordField();
	JButton jb_login=new JButton("ENTRAR");
	
	public Login()
	{	
		vent=new JFrame("Inicio de Sesión");
		
		vent.add(jl_id);
		jl_id.setBounds(50, 50, 300, 20);
		vent.add(jtf_id);
		jtf_id.setBounds(50, 70, 300, 20);
		vent.add(jl_pass);
		jl_pass.setBounds(50, 100, 300, 20);
		vent.add(jpf_pass);
		jpf_pass.setBounds(50, 120, 300, 20);
		vent.add(jb_login);
		jb_login.setBounds(200, 160, 150, 30);
		
		vent.setSize(400,300);
		vent.setLayout(null);
		vent.setResizable(false);
		vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vent.setLocation((int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2)-200,(int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2)-150);
		vent.setVisible(true);
		
		jb_login.addActionListener(this);
	}
	
	public static void main(String [] args)
	{
		new Login();
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==jb_login)
		{
			vent.dispose();
			new MenuPrincipal();
		}
	}
}
