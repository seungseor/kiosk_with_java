package func;
import javax.swing.*;
import java.awt.*;

public class functions2 extends JFrame{
    //resize method
    public static ImageIcon resize2(String path){
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image reSizeImg = img.getScaledInstance(190, 200,Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(reSizeImg);

        return changeIcon;

    }

}
