package phixma3;


import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Dimension;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.List;



import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.ScrollPaneConstants;

import javax.swing.Timer;





public class RollingFrame extends JFrame{



    private static final int LIST_CELL_WIDTH = 120;// 每次滚一次的 刻度

    private static int y = 0;// 滚动轴滑动的刻度



    private JScrollPane sp;

    private static int index = 0; // 用来 计数，算的开始滚动到最后滚动的y

    private int currentResolution = 20; // 动画效果，50毫秒

    private Timer timer1 = null, timer2 = null;// 两个timer 用于 操作两个监听事件



    private int moveMinX;// 每次滚动的开始刻度

    private int moveMaxX;// 每次滚动的结束刻度

    private static int max;// 计算滚动面板的滚动轴的最大滑动刻度



    private JPanel j,centerPanel,statusPanel,scollPanel; // 定义一个面板。用于将节点添加到面板上，并将j天津到滚动面板上



    private JButton leftButton,rightButton;





    public RollingFrame()

    {

        // TODO Auto-generated constructor stub

        setBackground(Color.WHITE);

        initGui();

        setTitle("横向滚动");

        setBounds(100, 100, 365, 80);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

    }



    private void initGui()

    {

        // 初始化操作，将各个组件和节点添加到面板中

        setLayout(new BorderLayout(0, 0));

        add(getLeftButton(), BorderLayout.WEST);

        add(getRightButton(), BorderLayout.EAST);

        add(getSp(), BorderLayout.CENTER);

    }

    // 定义滚动面板，将j 和滚动条添加进去

    private JScrollPane getSp(){

        if(j==null){

            j = new JPanel();

            j.setBackground(Color.WHITE);

            j.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

            for(int i=0;i<15;i++){

                j.add(new JButton("按钮："+i));

            }

            sp = new JScrollPane(j, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,

                    ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            sp.setBackground(Color.WHITE);

        }

        return sp;

    }

    // 得到向左滑动按钮

    public JButton getLeftButton()

    {

        if (leftButton == null)

        {

            leftButton = new JButton("<<");

            leftButton.setBorder(null);

            leftButton.setContentAreaFilled(false);

            leftButton.setFocusPainted(false);

        }

        leftButton.addActionListener(new ActionListener()

        {

            @Override

            public void actionPerformed(ActionEvent arg0)

            {

                max = sp.getHorizontalScrollBar().getMaximum()

                        - sp.getHorizontalScrollBar().getModel().getExtent();// 得到滚动轴

                // 最大滑动刻度

                moveMinX = (index - 1) * LIST_CELL_WIDTH > max ? max

                        : (index - 1) * LIST_CELL_WIDTH;

                moveMaxX = index * LIST_CELL_WIDTH > max ? max : index

                        * LIST_CELL_WIDTH;

                if (moveMaxX > 0)

                {

                    if (timer1 == null)

                    {

                        timer1 = new Timer(currentResolution, action1);

                    }

                    if (!timer1.isRunning())

                    {

                        timer1.start();

                    }

                }

            }

        });

        leftButton.setPreferredSize(new Dimension(48, 50));

        return leftButton;

    }



    // 得到向右滑动按钮

    public JButton getRightButton()

    {

        if (rightButton == null)

        {

            rightButton = new JButton(">>");

            rightButton.setBorder(null);

            rightButton.setContentAreaFilled(false);

            rightButton.setFocusPainted(false);

        }

        rightButton.addActionListener(new ActionListener()

        {

            @Override

            public void actionPerformed(ActionEvent arg0)

            {

                max = sp.getHorizontalScrollBar().getMaximum()

                        - sp.getHorizontalScrollBar().getModel().getExtent();// 得到滚动轴

                // 最大滑动刻度

                moveMinX = index * LIST_CELL_WIDTH > 0 ? index

                        * LIST_CELL_WIDTH : 0;

                moveMaxX = moveMinX + LIST_CELL_WIDTH > max ? max : moveMinX

                        + LIST_CELL_WIDTH;

                if (moveMinX < max)

                {

                    if (timer2 == null)

                    {

                        timer2 = new Timer(currentResolution, action2);

                    }

                    if (!timer2.isRunning())

                    {

                        timer2.start();

                    }

                }



            }

        });

        rightButton.setPreferredSize(new Dimension(48, 50));

        return rightButton;

    }



    private ActionListener action1 = new ActionListener()

    {

        @Override

        public void actionPerformed(ActionEvent e)

        {

            y -= 8;

            if (y <= moveMinX)

            {

                y = moveMinX;

                timer1.stop();

                if (index > 0)

                {

                    index--;

                }

            }

            sp.getHorizontalScrollBar().setValue(y);

        }

    };

    private ActionListener action2 = new ActionListener()

    {

        @Override

        public void actionPerformed(ActionEvent e)

        {

            y += 8;

            if (y >= moveMaxX)

            {

                y = moveMaxX;

                timer2.stop();

                index++;

            }

            sp.getHorizontalScrollBar().setValue(y);

        }

    };



    public static void main(String[] args) {

        new RollingFrame();

    }



}

