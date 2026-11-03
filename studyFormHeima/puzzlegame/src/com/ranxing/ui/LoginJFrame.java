package com.ranxing.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //创建一个登录界面
    public LoginJFrame() {
        //设置界面的宽和高
        this.setSize(488,430);
        //设置界面的标题
        this.setTitle("拼图登录");
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //让界面显示
        this.setVisible(true);
    }
}
