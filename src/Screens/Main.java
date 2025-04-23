package Screens;
import javax.swing.*;

import static List.orderList.curBasket;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import func.functions2;

public class Main extends JFrame {
	
	public static String name = null;
	public static int beverageNum = 0;
	public static String temp = null;
	public static int shot = 0;
	public static int syrup = 0;
	public static int whipping = 0;
	public static boolean decaf = false;
	public static int price = 0;
	public static int bevPrice = 0;
	
	public Main() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("메뉴선택창1");
		
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
        
        JButton americano_btn = new JButton();
        americano_btn.setLayout(new BorderLayout());
        JLabel imgAmericano = new JLabel(functions2.resize2("./images/아메리카노.jpg"));
        JLabel americanoLabel = new JLabel("<html> 아메리카노 <br> 2000원 </html>");
        imgAmericano.setHorizontalAlignment(JLabel.CENTER);
        americanoLabel.setHorizontalAlignment(JLabel.CENTER);
        americano_btn.add(imgAmericano, BorderLayout.NORTH);
        americano_btn.add(americanoLabel,BorderLayout.SOUTH);
        
        JButton cafelatte = new JButton();
        cafelatte.setLayout(new BorderLayout());
        JLabel imgCafelatte = new JLabel(functions2.resize2("./images/카페라떼.png"));
        JLabel cafelatteLabel = new JLabel("<html> 카페라떼 <br> 2900원 </html>");
        imgCafelatte.setHorizontalAlignment(JLabel.CENTER);
        cafelatteLabel.setHorizontalAlignment(JLabel.CENTER);
        cafelatte.add(imgCafelatte, BorderLayout.NORTH);
        cafelatte.add(cafelatteLabel, BorderLayout.SOUTH);

        JButton cappucino = new JButton();
        cappucino.setLayout(new BorderLayout());
        JLabel imgCappucino = new JLabel(functions2.resize2("./images/americano.jpg"));
        JLabel cappucinoLabel = new JLabel("<html> 카푸치노 <br> 2900원 </html>");
        imgCappucino.setHorizontalAlignment(JLabel.CENTER);
        cappucinoLabel.setHorizontalAlignment(JLabel.CENTER);
        cappucino.add(imgCappucino, BorderLayout.NORTH);
        cappucino.add(cappucinoLabel, BorderLayout.SOUTH);
        
        JButton coldbrew = new JButton();
        coldbrew.setLayout(new BorderLayout());
        JLabel imgColdbrew = new JLabel(functions2.resize2("./images/americano.jpg"));
        JLabel coldbrewLabel = new JLabel("<html> 콜드브루 <br> 2000원 </html>");
        imgColdbrew.setHorizontalAlignment(JLabel.CENTER);
        coldbrewLabel.setHorizontalAlignment(JLabel.CENTER);
        coldbrew.add(imgColdbrew, BorderLayout.NORTH);
        coldbrew.add(coldbrewLabel, BorderLayout.SOUTH);
        
        JPanel basket = new JPanel();
        JButton basket_btn = new JButton("장바구니");
        basket_btn.setBackground(new Color(0, 85, 67));
        basket_btn.setForeground(Color.BLACK);
        JLabel blank = new JLabel();
        basket.add(basket_btn);
        
       
        JPanel curBasket;
        curBasket = curBasket();
        
        americano_btn.setBackground(Color.WHITE);
        americano_btn.setPreferredSize(new Dimension(150,300));
        cafelatte.setBackground(Color.WHITE);
        cappucino.setBackground(Color.WHITE);
        coldbrew.setBackground(Color.WHITE);
        basket_btn.setBackground(new Color(0,85,67));
        basket_btn.setForeground(Color.WHITE);
        
        menu.add(americano_btn);
        menu.add(cafelatte);
        menu.add(cappucino);
        menu.add(coldbrew);
        
        c.add(category, BorderLayout.NORTH);
        c.add(menu);
        c.add(basket, BorderLayout.SOUTH);
        
        setSize(600,1000);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;

        setVisible(true);
        
        americano_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "아메리카노";
                beverageNum = 1;
                price = 2000;
                bevPrice = 2000;
                new Options();
                setVisible(false);
            }
        });
        cafelatte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "카페라떼";
                beverageNum = 1;
                price = 2900;
                bevPrice = 2900;
                new Options();
                setVisible(false);
            }
        });
        cappucino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "카푸치노";
                beverageNum = 1;
                price = 2900;
                bevPrice = 2900;
                new Options();
                setVisible(false);
            }
        });
        
        coldbrew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "콜드브루";
                beverageNum = 1;
                price = 3500;
                bevPrice = 3500;
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
