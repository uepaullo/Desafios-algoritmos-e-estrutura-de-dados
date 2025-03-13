package java_codes.sequencias_basicas;
import javax.swing.*;
import java.util.*;
import java.text.*;
public class Q15 {
    static int salary(int days){
        return days * 25 * 8;
    }
    public static void main(String[] args) {
        int Salary = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a quantidade de dias trabalhados:"));
        JOptionPane.showMessageDialog(null,
                "Você deve receber\n"+
                        NumberFormat.getCurrencyInstance().format(salary(Salary)));
    }
}
