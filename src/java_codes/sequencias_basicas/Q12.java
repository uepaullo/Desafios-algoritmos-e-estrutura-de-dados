package java_codes.sequencias_basicas;
import javax.swing.*;
import java.util.*;
import java.text.*;
public class Q12 {
    static double prom(double salary){
        return salary-salary*0.05;
    }
    public static void main(String[] args) {
        double item = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite o valor do produto: :"));
        JOptionPane.showMessageDialog(null,
                "O novo valor do produto será:\n " +
                        NumberFormat.getCurrencyInstance().format(prom(item)));

    }
}
