package Aplicacion;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.jdesktop.swingx.*;

public class MenuPrincipal extends JFrame implements ActionListener
{
	JFrame vent=null;
	
	/***********************************************COMPONENTES***********************************/
		//ToolBar
		JToolBar tb=new JToolBar(JToolBar.VERTICAL);
		JScrollPane stb=new JScrollPane(tb);
		JXTaskPane xtp1=new JXTaskPane();
		//General
			JLabel l1_gral=new JLabel("Punto de Venta",JLabel.LEFT);
		JXTaskPane xtp2=new JXTaskPane();
		//Inventarios
		JXTaskPane xtp3=new JXTaskPane();
		//Creditos
		JXTaskPane xtp4=new JXTaskPane();
		//Clientes
		JXTaskPane xtp5=new JXTaskPane();
		//Cortes
	
	public MenuPrincipal()
	{
		vent=new JFrame("Menú Principal");
		
		//GUI
		GUI();
		
		vent.add(stb,new BorderLayout().WEST);
		
		vent.setSize(800, 600);
		vent.setExtendedState(JFrame.MAXIMIZED_BOTH);
		vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vent.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
	}
	
	//Servicios GUI
	private void GUI()
	{
		//Toolbar
		Toolbar();
	}
	
	private void Toolbar()
	{
		//XTask
		General();
		Inventario();
		Credito();
		Cliente();
		Cortes();
		
		tb.add(xtp1);
		tb.setFloatable(true);
		tb.add(xtp2);
		tb.setFloatable(false);
		tb.add(xtp3);
		tb.setFloatable(false);
		tb.add(xtp4);
		tb.setFloatable(false);
		tb.add(xtp5);
		tb.setFloatable(false);
	}
	
	//XTast
	private void General()
	{
		xtp1.setTitle("                    General                    ");
		xtp1.setExpanded(false);
		xtp1.add(l1_gral);
	}
	
	private void Inventario()
	{
		xtp2.setTitle("                Inventario                    ");
		xtp2.setExpanded(false);
		//xtp2.add(l1_gral);
	}
	
	private void Credito()
	{
		xtp3.setTitle("                    Credito                    ");
		xtp3.setExpanded(false);
		//xtp3.add(l1_gral);
	}
	
	private void Cliente()
	{
		xtp4.setTitle("                    Cliente                    ");
		xtp4.setExpanded(false);
		//xtp4.add(l1_gral);
	}
	
	private void Cortes()
	{
		xtp5.setTitle("                    Cortes                    ");
		xtp5.setExpanded(false);
		//xtp5.add(l1_gral);
	}
}
