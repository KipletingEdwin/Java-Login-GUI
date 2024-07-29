package gui;

import constants.CommonConstants;

import javax.swing.*;

public class LoginGUI extends JFrame {
    public  LoginGUI(){
        super(CommonConstants.APP_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(CommonConstants.FRAME_SIZE[0], CommonConstants.FRAME_SIZE[1]);

        addGUIComponent();
    }
    public  void  addGUIComponent(){
        SpringLayout springLayout = new SpringLayout();
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(springLayout);

        //username
        JLabel usernameLabel = new JLabel("Username");
        JTextField usernameField = new JTextField(CommonConstants.TEXTFIELD_SIZE);

        loginPanel.add(usernameLabel);

    }
}
