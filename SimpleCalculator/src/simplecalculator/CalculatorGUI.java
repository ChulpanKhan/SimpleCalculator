
package simplecalculator;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CalculatorGUI extends JFrame {
    
    public CalculatorGUI(){
        setSize(600,600);
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(new GridLayout(4, 2, 5, 5));
        JButton button1 = new JButton("Умножить");
        JButton button2 = new JButton("Разделить");
        panel.add(button1);
        panel.add(button2);
        JTextField txt1 = new JTextField(20);
        JTextField txt2 = new JTextField(20);
        panel.add(txt1);
        panel.add(txt2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String b = txt1.getText();
                double realb = Double.parseDouble(b);
                String a = txt2.getText();
                double reala = Double.parseDouble(a);
                Calculator calc = new Calculator();
                double answer = calc.multiply(reala, realb);
                String finalanswer = Double.toString(answer);
                JOptionPane.showMessageDialog(CalculatorGUI.this, finalanswer, "",  JOptionPane.INFORMATION_MESSAGE);
               
            }
            
        });
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String b = txt1.getText();
                double realb = Double.parseDouble(b);
                String a = txt2.getText();
                double reala = Double.parseDouble(a);
                Calculator calc = new Calculator();
                double answer = calc.divide(realb, reala);
                String finalanswer = Double.toString(answer);
                JOptionPane.showMessageDialog(CalculatorGUI.this, finalanswer, "",  JOptionPane.INFORMATION_MESSAGE);
               
            }
            
        });
        
        
    }
    
    
    
}
