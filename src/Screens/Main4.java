package Screens;
import javax.swing.*;

import static List.orderList.curBasket;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import func.functions2;

public class Main4 extends JFrame {
	
	public static String name = null;
	public static int beverageNum = 0;
	public static String temp = null;
	public static int shot = 0;
	public static int syrup = 0;
	public static int whipping = 0;
	public static boolean decaf = false;
	public static int price = 0;
	public static int bevPrice = 0;
	
	
	public Main4() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("메뉴선택창4");
		
		Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.setBackground(new Color(238,238,238));
        
        JPanel category = new JPanel(new GridLayout(1,5));
        
        JButton coffeeTab = new JButton("커피");
        JButton teaTab = new JButton("티");
        JButton adeTab = new JButton("에이드");
        JButton waffleTab = new JButton("와플");
        JButton smoothieTab = new JButton("스무디");
        
        
        coffeeTab.setBackground(Color.WHITE);
        teaTab.setBackground(Color.WHITE);
        adeTab.setBackground(Color.WHITE);
        waffleTab.setBackground(Color.WHITE);
        smoothieTab.setBackground(Color.WHITE);
        
        coffeeTab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeTab.setBackground(Color.BLUE);
                teaTab.setBackground(Color.WHITE);
                adeTab.setBackground(Color.WHITE);
                waffleTab.setBackground(Color.WHITE);
                new Main();
                setVisible(false);
            }
        });

        teaTab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeTab.setBackground(Color.WHITE);
                teaTab.setBackground(Color.BLUE);
                adeTab.setBackground(Color.WHITE);
                waffleTab.setBackground(Color.WHITE);
                new Main2();
                setVisible(false);
            }
        });

        adeTab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeTab.setBackground(Color.WHITE);
                teaTab.setBackground(Color.WHITE);
                adeTab.setBackground(Color.BLUE);
                waffleTab.setBackground(Color.WHITE);
                new Main3();
                setVisible(false);
            }
        });

        waffleTab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeTab.setBackground(Color.WHITE);
                teaTab.setBackground(Color.WHITE);
                adeTab.setBackground(Color.WHITE);
                waffleTab.setBackground(Color.BLUE);
                new Main4();
                setVisible(false);
            }
        });
        
        smoothieTab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeTab.setBackground(Color.WHITE);
                teaTab.setBackground(Color.WHITE);
                adeTab.setBackground(Color.WHITE);
                waffleTab.setBackground(Color.BLUE);
                new Main5();
                setVisible(false);
            }
        });
        
        category.add(coffeeTab);
        category.add(teaTab);
        category.add(adeTab);
        category.add(waffleTab);
        category.add(smoothieTab);
        
        JPanel menu = new JPanel(new GridLayout(2, 2));
        
        JButton nutellaWaffle = new JButton();
        nutellaWaffle.setLayout(new BorderLayout());
        JLabel imgNutellaWaffle = new JLabel(functions2.resize2("./images/누텔라와플.jpg"));
        JLabel nutellaWaffleLabel = new JLabel("<html> 크런치 누텔라 와플 <br> 가격 </html>");
        imgNutellaWaffle.setHorizontalAlignment(JLabel.CENTER);
        nutellaWaffleLabel.setHorizontalAlignment(JLabel.CENTER);
        nutellaWaffle.add(imgNutellaWaffle, BorderLayout.NORTH);
        nutellaWaffle.add(nutellaWaffleLabel, BorderLayout.SOUTH);

        JButton pigWaffle = new JButton();
        pigWaffle.setLayout(new BorderLayout());
        JLabel imgPigWaffle = new JLabel(functions2.resize2("./images/돼지와플.jpg"));
        JLabel pigWaffleLabel = new JLabel("<html> 크런치 피그 와플 <br> 가격 </html>");
        imgPigWaffle.setHorizontalAlignment(JLabel.CENTER);
        pigWaffleLabel.setHorizontalAlignment(JLabel.CENTER);
        pigWaffle.add(imgPigWaffle, BorderLayout.NORTH);
        pigWaffle.add(pigWaffleLabel, BorderLayout.SOUTH);

        JButton strawberryWaffle = new JButton();
        strawberryWaffle.setLayout(new BorderLayout());
        JLabel imgStrawberryWaffle = new JLabel(functions2.resize2("./images/딸기와플.jpg"));
        JLabel strawberryWaffleLabel = new JLabel("<html> 딸기잼 와플 <br> 가격 </html>");
        imgStrawberryWaffle.setHorizontalAlignment(JLabel.CENTER);
        strawberryWaffleLabel.setHorizontalAlignment(JLabel.CENTER);
        strawberryWaffle.add(imgStrawberryWaffle, BorderLayout.NORTH);
        strawberryWaffle.add(strawberryWaffleLabel, BorderLayout.SOUTH);

        JButton appleWaffle = new JButton();
        appleWaffle.setLayout(new BorderLayout());
        JLabel imgAppleWaffle = new JLabel(functions2.resize2("./images/사과와플.jpg"));
        JLabel appleWaffleLabel = new JLabel("<html> 사과잼 와플 <br> 가격 </html>");
        imgAppleWaffle.setHorizontalAlignment(JLabel.CENTER);
        appleWaffleLabel.setHorizontalAlignment(JLabel.CENTER);
        appleWaffle.add(imgAppleWaffle, BorderLayout.NORTH);
        appleWaffle.add(appleWaffleLabel, BorderLayout.SOUTH);

        
        JPanel basket = new JPanel();
        JButton basket_btn = new JButton("장바구니");
        basket_btn.setBackground(new Color(0, 85, 67));
        basket_btn.setForeground(Color.BLACK);
        basket.add(basket_btn);
       
        JPanel curBasket;
        curBasket = curBasket();
        
        nutellaWaffle.setBackground(Color.WHITE);
        nutellaWaffle.setPreferredSize(new Dimension(150,300));
        pigWaffle.setBackground(Color.WHITE);
        strawberryWaffle.setBackground(Color.WHITE);
        appleWaffle.setBackground(Color.WHITE);
        basket_btn.setBackground(new Color(0,85,67));
        basket_btn.setForeground(Color.WHITE);
        
        menu.add(nutellaWaffle);
        menu.add(pigWaffle);
        menu.add(strawberryWaffle);
        menu.add(appleWaffle);
        
        c.add(category, BorderLayout.NORTH);
        c.add(menu);
        c.add(basket, BorderLayout.SOUTH);
        
        setSize(800,1600);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;

        setVisible(true);
        
        nutellaWaffle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "누텔라와플";
                beverageNum = 1;
                price = 2300;
                bevPrice = 2300;
                new Options();
                setVisible(false);
            }
        });
        pigWaffle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "돼지와플";
                beverageNum = 1;
                price = 2700;
                bevPrice = 2700;
                new Options();
                setVisible(false);
            }
        });
        strawberryWaffle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "딸기와플";
                beverageNum = 1;
                price = 2700;
                bevPrice = 2700;
                new Options();
                setVisible(false);
            }
        });
        
        appleWaffle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "사과와플";
                beverageNum = 1;
                price = 2700;
                bevPrice = 2700;
                new Options();
                setVisible(false);
            }
        });
        
        basket_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Basket();
                setVisible(false);
            }
        });
        
     
        
     }
	

}