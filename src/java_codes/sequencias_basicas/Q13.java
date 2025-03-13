package java_codes.sequencias_basicas;
import javax.swing.*;
import java.util.*;
import java.text.*;
public class Q13 {
    static double raise(double salary){
        return salary+salary*0.15;
    }
    public static void main(String[] args) {
        double salary = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Insira o salário"));
        JOptionPane.showMessageDialog(null,
                "O novo valor do salário será:\n"+
                        NumberFormat.getCurrencyInstance().format(raise(salary)));
    }
}
