package Aplicacion;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Punto_Venta extends JFrame implements ActionListener
{
	JFrame vent=null;
	
	//Componentes
	JPanel jp_north=new JPanel(new BorderLayout());
	JPanel jp_center=new JPanel();
	JPanel jp_south=new JPanel();
	JPanel jp_east=new JPanel();
	JPanel jp_west=new JPanel();
	
	JToolBar jtb=new JToolBar();
	
	String vec[]={"CANT","NOMBRE","PRECIO","SUBTOTAL"};
	String mat[][]={{"2","Chetos FlameHot","6.0","6.0"}};
	JTable venta=new JTable(mat,vec);
	JScrollPane jsp_venta=new JScrollPane(venta);
	Font normal = new Font( "Arial",Font.BOLD,20 );
	
	JTextArea jta_ayuda=new JTextArea(20,30);
	JScrollPane jsp_ayuda=new JScrollPane(jta_ayuda);
	
	//
	JMenuBar jmb=new JMenuBar();
	JMenu jm_archivo=new JMenu("Archivo");
	JMenu jm_edicion=new JMenu("Edicion");
	JMenu jm_heramientas=new JMenu("Herramientas");
	JMenu jm_acerca=new JMenu("Acerda de");
	
	public Punto_Venta()
	{
		vent=new JFrame("Punto de Venta");
		
		//GUI
		GUI();
		
		vent.setSize(800, 600);
		vent.setExtendedState(JFrame.MAXIMIZED_BOTH);
		vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vent.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
	}
	
	public static void main(String [] args)
	{
		new Punto_Venta();
	}
	
	//GUI
	private void GUI()
	{
		North();
		Center();
		South();
		East();
		West();
		
		jta_ayuda.setEditable(false);
		jta_ayuda.setAlignmentY(jta_ayuda.CENTER_ALIGNMENT );
		jta_ayuda.setAlignmentX(jta_ayuda.CENTER_ALIGNMENT );
		jta_ayuda.setText("AYUDA:");
		
		vent.add(jp_north,new BorderLayout().NORTH);
		vent.add(jp_south,new BorderLayout().SOUTH);
		vent.add(jsp_venta,new BorderLayout().CENTER);
		//vent.add(jsp_ticket_preliminar,new BorderLayout().EAST);
		vent.add(jsp_ayuda,new BorderLayout().WEST);
	}
	
	private void Center()
	{
		venta.setEnabled(false);
		DefaultTableCellRenderer AlinearDer = new DefaultTableCellRenderer();
		AlinearDer.setHorizontalAlignment(SwingConstants.RIGHT);
		venta.getColumnModel().getColumn(3).setCellRenderer(AlinearDer);
		venta.getColumnModel().getColumn(2).setCellRenderer(AlinearDer);
		DefaultTableCellRenderer AlinearCenter = new DefaultTableCellRenderer();
		AlinearCenter.setHorizontalAlignment(SwingConstants.CENTER);
		venta.getColumnModel().getColumn(0).setCellRenderer(AlinearCenter);
		
		//scrollPane.getViewport().getSize().height
		System.out.println("With: "+(int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth()));
		venta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumnModel modeloColumna = venta.getColumnModel();
        TableColumn columnaTabla=null;
        columnaTabla = modeloColumna.getColumn(0);
        columnaTabla.setPreferredWidth((int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth())*5/100);
        columnaTabla = modeloColumna.getColumn(1);
        columnaTabla.setPreferredWidth((int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth())*45/100);
        columnaTabla = modeloColumna.getColumn(2);
        columnaTabla.setPreferredWidth((int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth())*12/100);
        columnaTabla = modeloColumna.getColumn(3);
        columnaTabla.setPreferredWidth((int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth())*13/100);
        
		venta.setRowHeight(30);
		venta.setBackground(Color.cyan);//color de fondo
        venta.setFont(normal);//tipo de fuente
		
		jp_center.add(jsp_venta);
	}
	
	private void North()
	{
		//Menu
		jmb.add(jm_archivo);
		jmb.add(jm_edicion);
		jmb.add(jm_heramientas);
		jmb.add(jm_acerca);
		
		jtb.add(new JButton("X"));
		
		jtb.setFloatable(false);
		
		jp_north.add(jmb,new BorderLayout().NORTH);
		//jp_north.add(jtb,new BorderLayout().SOUTH);
	}
	
	private void South()
	{
		//jp_south.setLayout(null);
		
		//Componentes
		JLabel jl_Total=new JLabel("TOTAL_MN:");
		JTextField jtf_Total=new JTextField(10);
		
		jp_south.add(new JLabel("   "),new BorderLayout().NORTH);
		jp_south.add(new JLabel("   "),new BorderLayout().CENTER);
		jp_south.add(jtf_Total,new BorderLayout().SOUTH);
	}
	
	private void East()
	{
		jp_east.add(new JButton("Aceptar"));
	}
	
	private void West()
	{
		jp_west.add(new JButton("Aceptar"));
	}
}
