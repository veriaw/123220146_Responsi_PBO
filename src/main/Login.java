/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class Login extends JFrame implements ActionListener {
    JLabel greet = new JLabel("Selamat Datang!");
    JLabel content = new JLabel("Silahkan masuk untuk melanjutkan.");
    JLabel username = new JLabel("Username");
    JTextField inputUsername = new JTextField();
    JLabel password = new JLabel("Password");
    JTextField inputPassword = new JTextField();
    JButton login = new JButton("Login");
    public Login(){
        setVisible(true);
        setSize(552, 600);
        setLocationRelativeTo(null);
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(greet);
        greet.setBounds(20, 20, 400, 24);
        greet.setFont(greet.getFont().deriveFont(20f));
        
        add(content);
        content.setBounds(20, 45, 500, 24);
        content.setFont(content.getFont().deriveFont(14f));
        
        add(username);
        username.setBounds(20, 70, 500, 24);
        username.setFont(username.getFont().deriveFont(14f));
        
        add(inputUsername);
        inputUsername.setBounds(20, 100, 400, 24);
        
        add(password);
        password.setBounds(20, 125, 500, 24);
        password.setFont(password.getFont().deriveFont(14f));
        
        add(inputPassword);
        inputPassword.setBounds(20, 155, 400, 24);
        
        add(login);
        login.setBounds(20, 190, 400, 40);
        login.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        String username = inputUsername.getText();
        if(username.isEmpty()){
            throw new Exception("Tolong isi username terlebih dahulu!!");
        }
        new MainMenu();
        this.dispose();
        }catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
    
    
}
