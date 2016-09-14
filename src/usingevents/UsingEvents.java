/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingevents;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;

/**
 *
 * @author oop
 */
public class UsingEvents extends Frame 
{
    private TextField book;
    private Button add;
    private List list;
    private Button remove;
    
    //--------------------------------------------------------------------------
    
    public UsingEvents()
    {
        Panel p = new Panel(new BorderLayout());
        book    = new TextField();
        add     = new Button("Add");
        list    = new List();
        remove  = new Button("Remove");
        
        p.add(new Label("Tittle"), BorderLayout.WEST);
        p.add( book,               BorderLayout.CENTER);
        p.add(add,                 BorderLayout.EAST);
        
        add(p, BorderLayout.NORTH);
        add(list, BorderLayout.CENTER);
        add(remove,BorderLayout.SOUTH);
        
        setTitle("Book Register");
        setSize(400, 400);
        setVisible(true);
        
    }

    
    public static void main(String[] args) 
    {         
        
    }
    
}
