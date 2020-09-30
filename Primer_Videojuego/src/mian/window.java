package mian;

import javax.swing.*;

public class window extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public static final int width=800, heigth=600;
	
	public window(){
		
		setTitle("Naves en el espacio");
		setSize(width,heigth);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new window();

	}

}
