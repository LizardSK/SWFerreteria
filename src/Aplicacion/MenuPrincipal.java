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
		JLabel l1_gral=new JLabel("Consultar Categoria",JLabel.LEFT);
	
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
		
		tb.add(xtp1);
		tb.setFloatable(false);
	}
	
	//XTast
	private void General()
	{
		xtp1.setTitle("                    General                    ");
		xtp1.setExpanded(false);
		xtp1.add(l1_gral);
	}
}
