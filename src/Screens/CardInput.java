package Screens;

import javax.swing.*;

import Device.Kiosk;
import Device.OrderDevice;
import Device.OrderNumber;
import Device.PaymentDevice;
import Device.PaymentReq;
import Device.PosDevice;
import Device.PurchaseOrder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardInput extends JFrame implements ActionListener{
    private JTextField cardNumberField;
    private JTextField expiryYearField;
    private JTextField expiryMonthField;

    public CardInput() {
        setTitle("카드 정보 입력");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 1000);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(3, 2));

        JPanel numPanel = new JPanel();
        numPanel.setLayout(new GridLayout(4, 4));

        cardNumberField = new JTextField(16);
        expiryYearField = new JTextField(2);
        expiryMonthField = new JTextField(2);

        fieldPanel.add(new JLabel("Card Number:"));
        fieldPanel.add(cardNumberField);

        fieldPanel.add(new JLabel("Expiry Year:"));
        fieldPanel.add(expiryYearField);

        fieldPanel.add(new JLabel("Expiry Month:"));
        fieldPanel.add(expiryMonthField);

        for (int i = 9; i >= 0; i--) {
            JButton numberButton = new JButton("" + i);
            numberButton.addActionListener(this);
            numPanel.add(numberButton);
            
        }

        JButton submitButton = new JButton("Submit");
        numPanel.add(submitButton);

        submitButton.addActionListener(e -> {
            String cardNumber = cardNumberField.getText();
            String expiryYear = expiryYearField.getText();
            String expiryMonth = expiryMonthField.getText();
            
            OrderNumber orderNum = new OrderDevice();  
    	    PaymentReq payReq = new PaymentDevice();  
    	    PurchaseOrder posDev = new PosDevice();
            
            
            System.out.println("Card Number: " + cardNumber);
            System.out.println("Expiry Year: " + expiryYear);
            System.out.println("Expiry Month: " + expiryMonth);
            
            new Kiosk(orderNum, payReq, posDev, cardNumber, expiryYear, expiryMonth);
        });

        panel.add(fieldPanel);
        panel.add(numPanel);

        add(panel);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
                String buttonText = e.getActionCommand();
                if (cardNumberField.hasFocus()) {
                    cardNumberField.setText(cardNumberField.getText() + buttonText);
                } else if (expiryYearField.hasFocus()) {
                    expiryYearField.setText(expiryYearField.getText() + buttonText);
                } else if (expiryMonthField.hasFocus()) {
                    expiryMonthField.setText(expiryMonthField.getText() + buttonText);
                }
    }


    
}