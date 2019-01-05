import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Border1 {
    public JFrame border1(){
        JFrame jFrame=new JFrame();
        Container container=jFrame.getContentPane();
        container.setBackground(Color.green);
        jFrame.setSize(1000,1000);
        jFrame.setLayout(null);
        ImageIcon icon=new ImageIcon("res/logo.png");
        JLabel jLabel=new JLabel(icon);
        jLabel.setBackground(Color.pink);
        jLabel.setOpaque(true);
        jLabel.setBounds(100,100,80,80);
        jLabel.setBorder(BorderFactory.createLineBorder(Color.white,3));
        container.add(jLabel);

        jFrame.setVisible(true);

        jLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jLabel.setBounds(100,100,400,300);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jLabel.setBounds(100,100,80,80);
            }
        });

        return jFrame;
    }

    public static void main(String[] args) {
        new Border1().border1();
    }

}
