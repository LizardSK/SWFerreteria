package Aplicacion.Formularios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Registro_Cli extends JFrame implements ActionListener
{
	JFrame vent=null;
	
	//Componentes
	private String clv_cli=null;
	JLabel jl_nom=new JLabel("NOMBRE(s): ");
		JTextField jtf_nom=new JTextField();
	JLabel jl_ap=new JLabel("APELLIDO(s): ");
		JTextField jtf_ap=new JTextField();
	JLabel jl_calle=new JLabel("CALLE: ");
		JTextField jtf_calle=new JTextField();
	JLabel jl_n_ext=new JLabel("No. EXT: ");
		JTextField jtf_n_ext=new JTextField();
	JLabel jl_n_int=new JLabel("No.INT: ");
		JTextField jtf_n_int=new JTextField();
	JLabel jl_col=new JLabel("COLONIA: ");
		JTextField jtf_col=new JTextField();
	JLabel jl_mun=new JLabel("MUNICIPIO: ");
		JComboBox<String> jtf_mun=new JComboBox<String>();
	JLabel jl_stdo=new JLabel("ESTADO: ");
		JComboBox<String> jtf_stdo=new JComboBox<String>();
	JLabel jl_cp=new JLabel("C.P: ");
		JTextField jtf_cp=new JTextField();
	JLabel jl_tel=new JLabel("TEL: ");
		JTextField jtf_tel=new JTextField();
	JLabel jl_cel=new JLabel("CEL: ");
		JTextField jtf_cel=new JTextField();
	JLabel jl_email=new JLabel("E-MAIL: ");
		JTextField jtf_email=new JTextField();
	
	JButton b1=new JButton("REGISTRAR");
	JButton b2=new JButton("CALCELAR");
	
	public Registro_Cli()
	{
		vent=new JFrame("Registro de Cliente");
		
		//GUI
		GUI();
		
		vent.setSize(700, 280);
		vent.setResizable(false);
		vent.setLayout(null);
		vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vent.setLocation((int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2)-350,(int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2)-140);
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
		new Registro_Cli();
	}
	
	//Conformacion del GUI
	private void GUI()
	{
		vent.add(jl_nom);
		jl_nom.setBounds(10, 10, 100, 30);
		vent.add(jtf_nom);
		jtf_nom.setBounds(100, 15, 570, 20);
		vent.add(jl_ap);
		jl_ap.setBounds(10, 35, 100, 30);
		vent.add(jtf_ap);
		jtf_ap.setBounds(100, 40, 570, 20);
		
		vent.add(jl_calle);
		jl_calle.setBounds(10, 60, 100, 30);
		vent.add(jtf_calle);
		jtf_calle.setBounds(100, 65, 330, 20);
		vent.add(jl_n_ext);
		jl_n_ext.setBounds(450, 60, 50, 30);
		vent.add(jtf_n_ext);
		jtf_n_ext.setBounds(500, 65, 50, 20);
		vent.add(jl_n_int);
		jl_n_int.setBounds(570, 60, 50, 30);
		vent.add(jtf_n_int);
		jtf_n_int.setBounds(620, 65, 50, 20);
		
		vent.add(jl_col);
		jl_col.setBounds(10, 85, 100, 30);
		vent.add(jtf_col);
		jtf_col.setBounds(100, 90, 370, 20);
		vent.add(jl_cp);
		jl_cp.setBounds(500, 85, 50, 30);
		vent.add(jtf_cp);
		jtf_cp.setBounds(550, 90, 120, 20);
		
		vent.add(jl_stdo);
		jl_stdo.setBounds(10, 110, 100, 30);
		vent.add(jtf_stdo);
		jtf_stdo.setBounds(100, 115, 220, 20);
		vent.add(jl_mun);
		jl_mun.setBounds(350, 110, 100, 30);
		vent.add(jtf_mun);
		jtf_mun.setBounds(450, 115, 220, 20);
		
		vent.add(jl_tel);
		jl_tel.setBounds(10, 135, 100, 30);
		vent.add(jtf_tel);
		jtf_tel.setBounds(100, 140, 220, 20);
		vent.add(jl_cel);
		jl_cel.setBounds(350, 135, 100, 30);
		vent.add(jtf_cel);
		jtf_cel.setBounds(450, 140, 220, 20);
		
		vent.add(jl_email);
		jl_email.setBounds(10, 160, 100, 30);
		vent.add(jtf_email);
		jtf_email.setBounds(100, 165, 570, 20);
		
		vent.add(b1);
		b1.setBounds(200,200, 150, 40);
		vent.add(b2);
		b2.setBounds(370,200, 150, 40);
	}
}
