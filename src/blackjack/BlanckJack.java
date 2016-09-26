/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author oop
 */
public class BlanckJack extends JFrame
{
    private MyButton b[];
    private JLabel d;
    //--------------------------------------------------------------------------
    
    public BlanckJack()
    {
        super("BlackJack(Version buttons)");
        setSize(300, 200);
        widgets();
        events();
        setVisible(true);
        
    }
    //--------------------------------------------------------------------------
    
    private void widgets()
    {
        JPanel p = new JPanel(new GridLayout(4,3));
        b = new MyButton[12];
        Random r = new Random();
        for(int i=0; i<12; i++)
        {
            b[i]= new MyButton(r.nextInt(12)+1);
            p.add(b[i]);
        }
        d= new JLabel("0",JLabel.CENTER);
        d.setFont(new Font("Arial",Font.BOLD, 80));
        add(p,BorderLayout.WEST);
        add(d,BorderLayout.CENTER);
    }
    //--------------------------------------------------------------------------

    
    private void events()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        for(int i=0; i<12; i++)
        {
            b[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   MyButton src = (MyButton)e.getSource();
                   src.show();
                   int tot = Integer.parseInt(d.getText());
                   tot += src.valve();
                   d.setText(""+tot);
                   if(tot>21)
                   {
                       JOptionPane.showMessageDialog(null, "Perdiste");
                   }
               if(tot==21)
                   {
                       JOptionPane.showMessageDialog(null, "El puto amo");
                   }
                }
            });            
        }        
    }    
    
    //--------------------------------------------------------------------------

    
    public static void main(String[] args) 
    {
        new BlanckJack();
    }    
   

    
    
}