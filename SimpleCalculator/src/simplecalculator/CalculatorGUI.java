package simplecalculator;


import simplecalculator.Calculator;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Expert
 */
public class CalculatorGUI extends JFrame implements ActionListener{
    JButton btn1;
    JTextField a;
    JTextField b;
    Calculator calc = new Calculator();
    public CalculatorGUI(){
        setSize(600, 600);
        JPanel panel = new JPanel();
        new FlowLayout(FlowLayout.CENTER, 100,100);
        setLayout(new FlowLayout(FlowLayout.CENTER, 100,100));
        getContentPane().add(panel);
        a = new JTextField(20);
        b = new JTextField(20);
        btn1 = new JButton("НАЖМИ ЧТОБЫ ВОЗВЕСТИ");
        btn1.setActionCommand("Go");
        btn1.addActionListener(this);
        panel.add(new JLabel("Напишите число:"));
        panel.add(a);
        panel.add(new JLabel("Напишите степень:"));
        panel.add(b);
        
        add(btn1);
        pack();
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double a1 = Double.parseDouble(a.getText().trim());
        double b1 = Double.parseDouble(b.getText().trim());
        double anse = calc.power(a1, b1);
        String sss = Double.toString(anse);
            
        JOptionPane.showMessageDialog(this, sss, "Успех", JOptionPane.INFORMATION_MESSAGE);
    }
        

}
