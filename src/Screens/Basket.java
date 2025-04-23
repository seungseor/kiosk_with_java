package Screens;

import javax.swing.*;

import Info.Coffee;
import func.functions;

import java.awt.*;
import java.awt.event.*;

public class Basket extends JFrame{
	
	public static int sumPrice = 0;
	private JLabel priceLabel;
	
	public Basket() {
		
		setTitle("장바구니");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(0, 10));
		
		JPanel basketPanel = new JPanel();
        basketPanel.setLayout(new BoxLayout(basketPanel, BoxLayout.Y_AXIS));
        
        for(int i=0; i<Init_screen.orderList.size(); i++) {
        	JPanel basketList = new JPanel();
            basketList.setLayout(new GridLayout(1,4));
        	Coffee basket_list = Init_screen.orderList.get(i);
            
        	JPanel basketList1 = new JPanel();
            String imagePath = String.format("./images/%s.jpg", basket_list.getName());
            JLabel image = new JLabel(functions.resize(imagePath));
            basketList1.add(image);
            
            basketList.add(basketList1);
            
            JPanel basketList2 = new JPanel();
            basketList2.setLayout(new GridLayout(5,1));
            basketList2.add(new JLabel("<html><br>" + basket_list.getName()+ " " + basket_list.getBeverageNum() + "잔<br></html>"));
            basketList2.add(new JLabel("<html><br> 샷추가 " + basket_list.getShot()+"번<br></html>"));
            basketList2.add(new JLabel("<html><br> 바닐라시럽추가 " + basket_list.getSyrup()+"번<br></html>"));
            basketList2.add(new JLabel("<html><br> 휘핑추가 " + basket_list.getWhipping()+"번<br></html>"));
            basketList2.add(new JLabel("<html><br> 디카페인 원두변경 " + basket_list.getDecaf()+"<br><br></html>"));
            
            basketList.add(basketList2);
            
            JPanel basketList3 = new JPanel();
            basketList3.add(new JLabel("<html><br>" + basket_list.getPrice()+"<br></html>"));
            
            basketList.add(basketList3);
            
            JButton delete_btn = new JButton("삭제");
            delete_btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  
                    int index = basketPanel.getComponentZOrder(basketList);

                    
                    Init_screen.orderList.remove(index);

                   
                    basketPanel.remove(basketList);
                    basketPanel.revalidate();
                    basketPanel.repaint();

                  
                    sumPrice -= basket_list.getPrice();
                    priceLabel.setText(String.valueOf(sumPrice));
                    
                    if (Init_screen.orderList.isEmpty()) {
                        delete_btn.setEnabled(false);
                    }
                }
            });
            
            JPanel basketList4 = new JPanel();
            basketList4.add(delete_btn);
            basketList.add(basketList4);
            
            basketPanel.add(basketList);
            
            sumPrice += basket_list.getPrice();
            
            if (i < Init_screen.orderList.size() - 1) {
                JSeparator separator = new JSeparator(JSeparator.HORIZONTAL);
                separator.setPreferredSize(new Dimension(600, 1));
                basketPanel.add(separator);
            }
           
        }
        
        c.add(basketPanel, BorderLayout.NORTH);
        
        JSeparator separator = new JSeparator(JSeparator.HORIZONTAL);
        separator.setPreferredSize(new Dimension(600, 1));
        
        JPanel payInfo_BtnPanel = new JPanel(new GridLayout(3,1));
        
        JPanel payInfoPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel("결제 금액");
        priceLabel = new JLabel(String.valueOf(sumPrice));

        payInfoPanel.add(label);
        payInfoPanel.add(Box.createHorizontalStrut(200));
        payInfoPanel.add(priceLabel);

        FlowLayout layout = (FlowLayout) payInfoPanel.getLayout();
        layout.setVgap(5);


        
        JPanel payPanel = new JPanel(new FlowLayout());
        
        JButton goPay = new JButton("결제하기");
        goPay.setBackground(new Color(0, 85, 67));
        goPay.setForeground(Color.WHITE);
        goPay.setPreferredSize(new Dimension(200, 50));
        
        JButton tmp = new JButton("돌아가기");
        tmp.setBackground(new Color(0, 85, 67));
        tmp.setForeground(Color.WHITE);
        tmp.setPreferredSize(new Dimension(200, 50));
        
        payPanel.add(tmp);
        payPanel.add(goPay);

        payInfo_BtnPanel.add(separator);
        payInfo_BtnPanel.add(payInfoPanel);
        payInfo_BtnPanel.add(payPanel);
        
        c.add(payInfo_BtnPanel, BorderLayout.SOUTH);
        
        
        goPay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	new CardInput();
                setVisible(false);
            }
        });

        tmp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	new Main();
                setVisible(false);
            }
        });
        
        setSize(600,1000);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;
        setVisible(true);
		
	}

}
