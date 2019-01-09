package phixma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by lb200 on 2019-01-10.
 */
public class d4 extends JFrame implements ActionListener {

    Connection con;
    String dbName = "kcb";
    String bdUser = "root";
    String dbPassword = "root";
    String dbUrl = "jdbc:mysql://localhost:3306/test";
    JButton showButton;
    static JLabel[] lbl;
    JPanel panel;

    public d4() {

        try {
            con = DriverManager.getConnection(dbUrl, bdUser, dbPassword);
            System.out.println("Connected to database successfully!");

        } catch (SQLException ex) {
            System.out.println("Could not connect to database");
        }

        add(mypanel(), BorderLayout.PAGE_START);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(2000, 1500);
        setLocation(0, 0);
        setVisible(true);
    }

    public JPanel mypanel() {
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        showButton = new JButton("Show");
        showButton.addActionListener(this);
//        lbl = recordsLabel();
//        for (JLabel jlabel : lbl) {
//            panel.add(jlabel);               // Make no sense , Why?
//        }
        panel.add(showButton);

        return panel;
    }

    public static void main(String[] args) {
        new d4();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == showButton) {
//
        }
    }
    public JLabel[] recordsLabel() {
        try {
            Statement st1 = con.createStatement();
            ResultSet result1 = st1.executeQuery("select * from mytable");
            ArrayList<String> lableList = new ArrayList<>();
            while (result1.next()) {
                String resultRow = result1.getString(1) + " " + result1.getString(2);
                System.out.println(resultRow);
                lableList.add(resultRow);
            }
            Object[] arrayResultRow = lableList.toArray();

            int rows = result1.last() ? result1.getRow() : 0;
            System.out.println("Number of rows is: " + rows);

            lbl = new JLabel[rows];
            for (int i = 0; i < rows; i++) {
                lbl[i] = new JLabel(arrayResultRow[i].toString());
            }

        } catch (SQLException sqle) {
            System.out.println("Can not excute sql statement");
            sqle.printStackTrace();
        }
        return lbl;
    }
}