package com.ranxing.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {

    //创建一个主界面
    public GameJFrame() {
        //初始化一个界面
        initJFrame();
        //初始化一个菜单
        initJMenuBer();




        //让界面显示出来
        this.setVisible(true);
    }














    private void initJMenuBer() {
        //初始化菜单

        //创建整个菜单对象
        JMenuBar menuBar = new JMenuBar();
        //创建上面的两个选项的对象("功能","关于我们")
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        //创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reloginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        //将条目对象添加到选项下
        functionJMenu.add(replayItem);
        functionJMenu.add(reloginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);
        //将两个选项添加到菜单当中
        menuBar.add(functionJMenu);
        menuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(menuBar);
    }

    private void initJFrame() {
        //初始化界面

        //设置界面的宽和高
        this.setSize(603,680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
