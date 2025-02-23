package simplecalculator;

import java.lang.Math;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
        
public class Calculator {
    
    public double power(double a, double b){      
        double ans = Math.pow(a, b);
        return ans;
    }  
    
    public double multiply(double a, double b){
        return a * b;
    }
    
    public double divide(double a, double b){
        return a/b;
    }
    public double add(double a, double b) {
        return a+b;
    }
    
    public double subtract(double a, double b) {
        return a-b;
    }
    
    
}
