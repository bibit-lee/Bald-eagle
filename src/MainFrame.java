import javax.swing.*;

public class MainFrame extends JFrame {
    JPanel beijing;

    public MainFrame(){
        JFrame mainFrame=new JFrame();
        JLayeredPane jLayeredPane=new JLayeredPane();

        mainFrame.setExtendedState(MAXIMIZED_BOTH);
        BackGroundPanel backGroundPanel=new BackGroundPanel();
        beijing=backGroundPanel.backGroundPanel();
        jLayeredPane.add(beijing,Integer.valueOf(100));

        mainFrame.setContentPane(jLayeredPane);
        mainFrame.setVisible(true);


    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
