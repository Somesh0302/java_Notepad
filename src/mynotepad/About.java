
package mynotepad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class About extends JFrame implements ActionListener{
     JButton b1;
    About(){
        setBounds(400, 100, 600,500);
        setLayout(null);
        
        
        
        
        JLabel text = new JLabel("hello everyone  this is My Notepad");
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        text.setBounds(150, 130, 500, 300);
        add(text);
        
        b1 = new JButton("OK");
        b1.setBounds(580, 500, 80, 25);
        b1.addActionListener(this);
        add(b1);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String[] args){
        new About().setVisible(true);
    }
    
}
