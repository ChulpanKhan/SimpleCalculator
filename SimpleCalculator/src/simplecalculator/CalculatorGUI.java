package simplecalculator;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorGUI extends JFrame{
    
    public  CalculatorGUI() {
        super("feature-and-abstract");
        Calculator calc = new Calculator();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 2, 5, 5));
        
        
        mainPanel.add(new JLabel("×èñëî 1:"));
        JTextField atxt = new JTextField(4);
        mainPanel.add(atxt);
        mainPanel.add(new JLabel("×èñëî 2:"));
        JTextField btxt = new JTextField(4);
        mainPanel.add(btxt);

        //ñóììà
        JButton buttonSum = new JButton("Ñóììà");
        mainPanel.add(buttonSum);
        JButton buttonSub = new JButton("Ðàçíîñòü");
        mainPanel.add(buttonSub);
        JButton button1 = new JButton("Óìíîæèòü");
        JButton button2 = new JButton("Ðàçäåëèòü");
        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(new JLabel("Ðåçóëüòàò"));
        JLabel res = new JLabel("");
        mainPanel.add(res);
        buttonSum.addActionListener(e -> {
            double a = Double.parseDouble(atxt.getText());
            double b = Double.parseDouble(btxt.getText());
            double c =  calc.add(a, b);
            res.setText(Double.toString(c));
        }); 
        buttonSub.addActionListener(e -> {
            double a = Double.parseDouble(atxt.getText());
            double b = Double.parseDouble(btxt.getText());
            double c =  calc.subtract(a, b);
            res.setText(Double.toString(c));
        });
              button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String b = atxt.getText();
                double realb = Double.parseDouble(b);
                String a = btxt.getText();
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
                String b = atxt.getText();
                double realb = Double.parseDouble(b);
                String a = btxt.getText();
                double reala = Double.parseDouble(a);
                Calculator calc = new Calculator();
                double answer = calc.divide(realb, reala);
                String finalanswer = Double.toString(answer);
                JOptionPane.showMessageDialog(CalculatorGUI.this, finalanswer, "",  JOptionPane.INFORMATION_MESSAGE);
               
            }
            
        });
        
        add(mainPanel);
        pack();//àâòîìàòè÷åñêè óñòàíàâëèâàåò ðàçìåð îêíà
        setLocationRelativeTo(null);
        setVisible(true);

    }
    

}
