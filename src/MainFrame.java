import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame(){
        JPanel beijing;
        JFrame mainFrame=new JFrame();
        mainFrame.setExtendedState(MAXIMIZED_BOTH);
        JLayeredPane jLayeredPane=new JLayeredPane();


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
