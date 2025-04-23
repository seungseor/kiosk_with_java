package Screens;
import javax.swing.*;

import Info.Coffee;

import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class Init_screen extends JFrame {
	public static ArrayList<Coffee> orderList = new ArrayList<>();
	
	public Init_screen() {
		
		setTitle("첫화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		  
		//BorderLayout.CENTER
		JPanel Init_background = new JPanel(new GridLayout()); //메인화면 백그라운드색_흰색   
		Init_background.setBackground(Color.white);
		c.add(Init_background);
		  
		//BorderLayout.NORTH
		JPanel Init_north = new JPanel(new FlowLayout());
		Init_north.setBackground(new Color(255, 158, 60));//주황색
		c.add(Init_north,BorderLayout.NORTH);
		  
		//BorderLayout.SOUTH
		JPanel Init_south = new JPanel(new GridLayout());         
		Init_south.setBackground(new Color(255, 158, 60)); //주황색
		c.add(Init_south,BorderLayout.SOUTH);
		
		JToggleButton eatin_btn = new JToggleButton("매장에서 먹어요");
		eatin_btn.setBounds(0, 665, 300, 100); 
		eatin_btn.setBackground(new Color(255, 158, 60)); 
		eatin_btn.setForeground(Color.white); 
		eatin_btn.setBorder(BorderFactory.createLineBorder(Color.white)); 
		eatin_btn.setFont(new Font("Dialog", Font.BOLD, 40)); 
		Init_south.add(eatin_btn, BorderLayout.WEST);
		  
		JButton takeout_btn = new JButton("포장해서 갈래요");
		takeout_btn.setBounds(300, 665, 300, 100);
		takeout_btn.setBackground(new Color(255, 158, 60));
		takeout_btn.setForeground(Color.white); 
		takeout_btn.setBorder(BorderFactory.createLineBorder(Color.white));
		takeout_btn.setFont(new Font("Dialog", Font.BOLD, 40)); 
		Init_south.add(takeout_btn,BorderLayout.EAST);	   
		  
		  
		//event------------------------------------------		  
		eatin_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Main();
                setVisible(false);

            }
        });
		      	    	      
			      
	    // 프레임 크기 ----------------------------------
		setSize(600, 1080);
		setLocationRelativeTo(null); 
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Init_screen();

	}

}
