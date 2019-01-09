
import java.awt.Graphics;

import java.awt.Insets;

import javax.swing.ImageIcon;

import javax.swing.JPasswordField;

import javax.swing.JTextField;



/**

 *

 * @author WZH

 */

public class JTextFieldPassword extends JPasswordField {

    private ImageIcon icon;



    public JTextFieldPassword() {

//        获取当前路径下的图片

      ImageIcon  icon = new ImageIcon(getClass().getResource("res/search.png"));

        Insets insets = new Insets(0, 20, 0, 0);

        //设置文本输入距左边20

        this.setMargin(insets);

    }



    @Override

    public void paintComponent(Graphics g) {

        Insets insets = getInsets();

        super.paintComponent(g);

        int iconWidth = icon.getIconWidth();

        int iconHeight = icon.getIconHeight();

        int Height = this.getHeight();

        //在文本框中画上之前图片

        icon.paintIcon(this, g, (insets.left - iconWidth)/2, (Height - iconHeight) / 2);

    }

    public static void main(String[] args) {
        new JTextFieldPassword();
    }

}
