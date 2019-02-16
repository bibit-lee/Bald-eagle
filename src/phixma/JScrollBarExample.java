package phixma;


import java.awt.*;

import java.awt.event.*;

import javax.swing.*;



public class JScrollBarExample implements AdjustmentListener {

    JScrollBar scrollBar1;

    JScrollBar scrollBar2;

    JPanel panel1;

    JLabel label2 = new JLabel("刻度：", JLabel.CENTER);



    public JScrollBarExample() {

        JFrame f = new JFrame("JScrollBarDemo");

        Container contentPane = f.getContentPane();
        contentPane.setBackground(Color.PINK);



        JLabel label1 = new JLabel(new ImageIcon(".\\icons\\flower.jpg"));

        panel1 = new JPanel();

        panel1.add(label1);

		/*

		 * 产生一个垂直滚动轴，默认滚动轴位置在10刻度的地方，extent值设10，minimum值为0， maximan值为100，因此滚动轴一开始在刻度10的位置上，可滚动的区域大小为100-10-0=90刻度，滚动范围在0～90中。

		 */

        scrollBar1 = new JScrollBar(JScrollBar.VERTICAL, 10, 10, 0, 1000);

        scrollBar1.setUnitIncrement(1);// 设置拖曳滚动轴时，滚动轴刻度一次的变化量。

        scrollBar1.setBlockIncrement(10);// 设置当鼠标在滚动轴列上按一下是，滚动轴一次所跳的区块大小

        scrollBar1.addAdjustmentListener(this);



        scrollBar2 = new JScrollBar();// 建立一个空的JScrollBar
        scrollBar2.setPreferredSize(new Dimension(4000,500));
        scrollBar2.setOpaque(false);

        scrollBar2.setOrientation(JScrollBar.HORIZONTAL);// 设置滚动轴方向为水平方向

        scrollBar2.setValue(0);// 设置默认滚动轴位置在0刻度的地方。

        scrollBar2.setVisibleAmount(20);// extent值设为20

        scrollBar2.setMinimum(10);// minmum值设为10

        scrollBar2.setMaximum(60);// maximan值设为60,因为minmum值设为10，可滚动的区域大小为60-20-10=30

        // 个刻度，滚动范围在10~40中。

        scrollBar2.setBlockIncrement(5);// 当鼠标在滚动轴列上按一下时，滚动轴一次所跳的区块大小为5个刻度

        scrollBar2.addAdjustmentListener(this);



        contentPane.add(panel1, BorderLayout.CENTER);

        contentPane.add(scrollBar1, BorderLayout.EAST);

        contentPane.add(scrollBar2, BorderLayout.SOUTH);

        contentPane.add(label2, BorderLayout.NORTH);



        f.setSize(new Dimension(200, 200));

        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {

                System.exit(0);

            }

        });

    }



    // 实现adjustmentValueChanged方法。当用户改变转轴位置时，会将目前的滚动轴刻度写在labe2上。

    public void adjustmentValueChanged(AdjustmentEvent e) {

        if ((JScrollBar) e.getSource() == scrollBar1)

            label2.setText("垂直刻度" + e.getValue());// e.getValue()所得的值与scrollBar1.getValue()所得的值一样。

        if ((JScrollBar) e.getSource() == scrollBar2)

            label2.setText("水平刻度" + e.getValue());

    }



    public static void main(String[] args) {

        new JScrollBarExample();

    }



}
