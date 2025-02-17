
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
        mainPanel.setLayout(new GridLayout(4, 2, 5, 5));
        
        
        mainPanel.add(new JLabel("Число 1:"));
        JTextField atxt = new JTextField(4);
        mainPanel.add(atxt);
        mainPanel.add(new JLabel("Число 2:"));
        JTextField btxt = new JTextField(4);
        mainPanel.add(btxt);

        //сумма
        JButton buttonSum = new JButton("Сумма");
        mainPanel.add(buttonSum);
        JButton buttonSub = new JButton("Разность");
        mainPanel.add(buttonSub);
        mainPanel.add(new JLabel("Результат"));
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
        
        add(mainPanel);
        pack();//автоматически устанавливает размер окна
        setLocationRelativeTo(null);
        setVisible(true);

    }
    
}
