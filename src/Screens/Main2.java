package Screens;
import javax.swing.*;

import static List.orderList.curBasket;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import func.functions2;

public class Main2 extends JFrame {
	
	public static String name = null;
	public static int beverageNum = 0;
	public static String temp = null;
	public static int shot = 0;
	public static int syrup = 0;
	public static int whipping = 0;
	public static boolean decaf = false;
	public static int price = 0;
	public static int bevPrice = 0;
	
	public Main2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("메뉴선택창2");
		
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
        
        JButton icedTea_btn = new JButton();
        icedTea_btn.setLayout(new BorderLayout());
        JLabel imgIcedTea = new JLabel(functions2.resize2("./images/아이스티.jpg"));
        JLabel icedteaLabel = new JLabel("<html> 아이스티 <br> 2300원 </html>");
        imgIcedTea.setHorizontalAlignment(JLabel.CENTER);
        icedteaLabel.setHorizontalAlignment(JLabel.CENTER);
        icedTea_btn.add(imgIcedTea, BorderLayout.NORTH);
        icedTea_btn.add(icedteaLabel,BorderLayout.SOUTH);
        
        JButton greenTea = new JButton();
        greenTea.setLayout(new BorderLayout());
        JLabel imgGreentea = new JLabel(functions2.resize2("./images/녹차.jpg"));
        JLabel greenTeaLabel = new JLabel("<html> 녹차 <br> 2700원 </html>");
        imgGreentea.setHorizontalAlignment(JLabel.CENTER);
        greenTeaLabel.setHorizontalAlignment(JLabel.CENTER);
        greenTea.add(imgGreentea, BorderLayout.NORTH);
        greenTea.add(greenTeaLabel, BorderLayout.SOUTH);

        JButton chamomileTea = new JButton();
        chamomileTea.setLayout(new BorderLayout());
        JLabel imgChamomileTea = new JLabel(functions2.resize2("./images/캐모마일.jpg"));
        JLabel chamomileTeaLabel = new JLabel("<html> 캐모마일 <br> 2700원 </html>");
        imgChamomileTea.setHorizontalAlignment(JLabel.CENTER);
        chamomileTeaLabel.setHorizontalAlignment(JLabel.CENTER);
        chamomileTea.add(imgChamomileTea, BorderLayout.NORTH);
        chamomileTea.add(chamomileTeaLabel, BorderLayout.SOUTH);
        
        JButton jasmineTea = new JButton();
        jasmineTea.setLayout(new BorderLayout());
        JLabel imgJasmineTea = new JLabel(functions2.resize2("./images/자스민.jpg"));
        JLabel jasmineTeaLabel = new JLabel("<html> 자스민 <br> 2700원 </html>");
        imgJasmineTea.setHorizontalAlignment(JLabel.CENTER);
        jasmineTeaLabel.setHorizontalAlignment(JLabel.CENTER);
        jasmineTea.add(imgJasmineTea, BorderLayout.NORTH);
        jasmineTea.add(jasmineTeaLabel, BorderLayout.SOUTH);
        
        JPanel basket = new JPanel();
        JButton basket_btn = new JButton("장바구니");
        basket_btn.setBackground(new Color(0, 85, 67));
        basket_btn.setForeground(Color.BLACK);
        basket.add(basket_btn);
       
        JPanel curBasket;
        curBasket = curBasket();
        
        icedTea_btn.setBackground(Color.WHITE);
        icedTea_btn.setPreferredSize(new Dimension(150,300));
        greenTea.setBackground(Color.WHITE);
        chamomileTea.setBackground(Color.WHITE);
        jasmineTea.setBackground(Color.WHITE);
        basket_btn.setBackground(new Color(0,85,67));
        basket_btn.setForeground(Color.WHITE);
        
        menu.add(icedTea_btn);
        menu.add(greenTea);
        menu.add(chamomileTea);
        menu.add(jasmineTea);
        
        c.add(category, BorderLayout.NORTH);
        c.add(menu);
        c.add(basket, BorderLayout.SOUTH);
        
        setSize(800,1600);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;

        setVisible(true);
        
        icedTea_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "아이스티";
                beverageNum = 1;
                price = 2300;
                bevPrice = 2300;
                new Options();
                setVisible(false);
            }
        });
        greenTea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "녹차";
                beverageNum = 1;
                price = 2700;
                bevPrice = 2700;
                new Options();
                setVisible(false);
            }
        });
        chamomileTea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "캐모마일";
                beverageNum = 1;
                price = 2700;
                bevPrice = 2700;
                new Options();
                setVisible(false);
            }
        });
        
        jasmineTea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "자스민";
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
