/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JApplet;


/**
 *
 * @author ting4900
 */
public class ComputerParts extends JApplet implements ActionListener {
    //step 1 declare objects you need
    JButton btnram,btnhdd,btnboard;
    JButton btnpower,btnoptical,btncpu;
    JLabel lblanswer;
    String htmlstyle="<HTML><FONT FACE=Arial> <p style='padding:10px; background:black; color:white;font-size:12px;'>";
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
   
    public void init() {
        // step 2 - create objects
        btnram=new JButton("RAM");
        btnhdd=new JButton("HDD");
        btnboard=new JButton("MotherBoard");
        btnpower=new JButton("Power Supply");
        btnoptical=new JButton("Optical Drive");
        btncpu=new JButton("CPU");
        lblanswer=new JLabel ("Definition goes here");
        //step 3 - add components to applet
        setLayout(new FlowLayout ());
        add(btnram);
        add(btnhdd);
        add(btnboard);
        add(btnpower);
        add(btnoptical);
        add(btncpu);
        add(lblanswer);
        //step 4-attach buttonts to button code
        btnhdd.addActionListener (this);
        btnboard.addActionListener (this);
        btnpower.addActionListener (this);
        btnoptical.addActionListener (this);
        btncpu.addActionListener (this);
        btnram.addActionListener (this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btncpu)lblanswer.setText(htmlstyle +"CPU is the brains of the computer. <br>It stands for Center Processing Unit.");
        if (e.getSource()==btnram)lblanswer.setText(htmlstyle+"RAM stands for Random Access Memory <br> It is temporary memory for programs in use");
        if (e.getSource()==btnhdd)lblanswer.setText(htmlstyle +"This is the storage of the computer.<br>A hard drive retains its data even <br>when it has powered off.");
        if (e.getSource()==btnboard)lblanswer.setText(htmlstyle +"This is the mainframe, it holds and<br> connects all the other components");
        if (e.getSource()==btnpower)lblanswer.setText(htmlstyle +"This supplies power to the<br> other parts of the computer.");
        if (e.getSource()==btnoptical)lblanswer.setText(htmlstyle +"This reads data from optical disks <br>with laser lights.");
        
    }
    
}
