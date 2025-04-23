package Screens;
import javax.swing.*;

import static List.orderList.curBasket;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import func.functions2;

public class Main3 extends JFrame {
	
	public static String name = null;
	public static int beverageNum = 0;
	public static String temp = null;
	public static int shot = 0;
	public static int syrup = 0;
	public static int whipping = 0;
	public static boolean decaf = false;
	public static int price = 0;
	public static int bevPrice = 0;
	
	public Main3() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("메뉴선택창3");
		
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
        
        JButton greengrapeAde = new JButton();
        greengrapeAde.setLayout(new BorderLayout());
        JLabel imgGreengrapeAde = new JLabel(functions2.resize2("./images/그린포도에이드.jpg"));
        JLabel greengrapeAdeLabel = new JLabel("<html> 그린포도에이드 <br> 2300원 </html>");
        imgGreengrapeAde.setHorizontalAlignment(JLabel.CENTER);
        greengrapeAdeLabel.setHorizontalAlignment(JLabel.CENTER);
        greengrapeAde.add(imgGreengrapeAde, BorderLayout.NORTH);
        greengrapeAde.add(greengrapeAdeLabel, BorderLayout.SOUTH);

        JButton hanrabongAde = new JButton();
        hanrabongAde.setLayout(new BorderLayout());
        JLabel imgHanrabongAde = new JLabel(functions2.resize2("./images/한라봉에이드.jpg"));
        JLabel hanrabongAdeLabel = new JLabel("<html> 한라봉에이드 <br> 2700원 </html>");
        imgHanrabongAde.setHorizontalAlignment(JLabel.CENTER);
        hanrabongAdeLabel.setHorizontalAlignment(JLabel.CENTER);
        hanrabongAde.add(imgHanrabongAde, BorderLayout.NORTH);
        hanrabongAde.add(hanrabongAdeLabel, BorderLayout.SOUTH);

        JButton bluelemonAde = new JButton();
        bluelemonAde.setLayout(new BorderLayout());
        JLabel imgBluelemonAde = new JLabel(functions2.resize2("./images/블루레몬에이드.jpg"));
        JLabel bluelemonAdeLabel = new JLabel("<html> 블루레몬에이드 <br> 2700원 </html>");
        imgBluelemonAde.setHorizontalAlignment(JLabel.CENTER);
        bluelemonAdeLabel.setHorizontalAlignment(JLabel.CENTER);
        bluelemonAde.add(imgBluelemonAde, BorderLayout.NORTH);
        bluelemonAde.add(bluelemonAdeLabel, BorderLayout.SOUTH);

        JButton grapefruitAde = new JButton();
        grapefruitAde.setLayout(new BorderLayout());
        JLabel imgGrapefruitAde = new JLabel(functions2.resize2("./images/자몽에이드.jpg"));
        JLabel grapefruitAdeLabel = new JLabel("<html> 자몽에이드 <br> 2700원 </html>");
        imgGrapefruitAde.setHorizontalAlignment(JLabel.CENTER);
        grapefruitAdeLabel.setHorizontalAlignment(JLabel.CENTER);
        grapefruitAde.add(imgGrapefruitAde, BorderLayout.NORTH);
        grapefruitAde.add(grapefruitAdeLabel, BorderLayout.SOUTH);

        
        JPanel basket = new JPanel();
        JButton basket_btn = new JButton("장바구니");
        basket_btn.setBackground(new Color(0, 85, 67));
        basket_btn.setForeground(Color.BLACK);
        basket.add(basket_btn);
       
        JPanel curBasket;
        curBasket = curBasket();
        
        greengrapeAde.setBackground(Color.WHITE);
        greengrapeAde.setPreferredSize(new Dimension(150,300));
        hanrabongAde.setBackground(Color.WHITE);
        bluelemonAde.setBackground(Color.WHITE);
        grapefruitAde.setBackground(Color.WHITE);
        basket_btn.setBackground(new Color(0,85,67));
        basket_btn.setForeground(Color.WHITE);
        
        menu.add(greengrapeAde);
        menu.add(hanrabongAde);
        menu.add(bluelemonAde);
        menu.add(grapefruitAde);
        
        c.add(category, BorderLayout.NORTH);
        c.add(menu);
        c.add(basket, BorderLayout.SOUTH);
        
        setSize(800,1600);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;

        setVisible(true);
        
        greengrapeAde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "청보도에이드";
                beverageNum = 1;
                price = 2300;
                bevPrice = 2300;
                new Options();
                setVisible(false);
            }
        });
        hanrabongAde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "한라봉에이드";
                beverageNum = 1;
                price = 2700;
                bevPrice = 2700;
                new Options();
                setVisible(false);
            }
        });
        bluelemonAde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "블루레몬에이드";
                beverageNum = 1;
                price = 2700;
                bevPrice = 2700;
                new Options();
                setVisible(false);
            }
        });
        
        grapefruitAde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = "자몽에이드";
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
