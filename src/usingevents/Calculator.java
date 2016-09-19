/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingevents;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author oop
 */
public class Calculator extends JFrame 
{
    private JLabel display;
    private JButton operator[];
    private JButton numbers[];   
    private JButton clear;
    
    //--------------------------------------------------------------------------
    
    public Calculator()
    {
        super("Calculator");
        setSize(300,300);
        widgets();
        events();
        setVisible(true);                
    }
    
    //--------------------------------------------------------------------------
    
    private void widgets()
    {
        JPanel p = new JPanel(new GridLayout(4,4));
        display = new JLabel("0",JLabel.RIGHT);
        numbers = new JButton[10];
        for(int i=0; i<10; i++)
        {
            numbers[i]= new JButton(""+i);
        }
        operator = new JButton[5];
        String op[] = {"=","+","-","x","/"};
        for(int i=0; i<5; i++)
        {
            operator[i]= new JButton(op[i]);            
        }
        clear = new JButton("C");
        
        add(display,BorderLayout.NORTH);
        add(p,BorderLayout.CENTER);
        
        p.add(numbers[7]); p.add(numbers[8]); p.add(numbers[9]); p.add(operator[1]);
        p.add(numbers[4]); p.add(numbers[5]); p.add(numbers[6]); p.add(operator[2]);
        p.add(numbers[1]); p.add(numbers[2]); p.add(numbers[3]); p.add(operator[3]);
        p.add(numbers[0]); p.add(clear); p.add(operator[0]); p.add(operator[4]);
    }
    
    //--------------------------------------------------------------------------
    
    private void events()
    {
        
    }
    
    //--------------------------------------------------------------------------
    
    public static void main(String[] args) 
    {
        new Calculator();
    }
}
