package List;
import static Screens.Main.*;

import javax.swing.*;

public class orderList extends JFrame {

    public static JPanel curBasket(){
       
        JPanel curOrder = new JPanel();

        JLabel curBeverage = new JLabel("상품명: " + name + "\n");
        JLabel curbeverageNum = new JLabel("수량:" + beverageNum + "\n");
        JLabel curTemp = new JLabel("냉/온: " + temp + "번\n");
        JLabel curShot = new JLabel("샷추가: " + shot + "번\n");
        JLabel curSyrup = new JLabel("바닐라시럽추가:" + syrup + "번 \n");
        JLabel curWhipping = new JLabel("휘핑추가: " + whipping+ "개 \n" );
        JLabel curDecaf = new JLabel("디카페인 변경: " + decaf + "\n");

        curOrder.add(curBeverage);
        curOrder.add(curbeverageNum);
        curOrder.add(curTemp);
        curOrder.add(curShot);
        curOrder.add(curSyrup);
        curOrder.add(curWhipping);
        curOrder.add(curDecaf);

        return curOrder;
    }
}