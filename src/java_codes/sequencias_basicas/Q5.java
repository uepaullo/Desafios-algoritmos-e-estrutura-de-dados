package java_codes.sequencias_basicas;
import javax.swing.*;
public class Q5 {
    static double avarage(double a, double b){
        double av = (a+b)/2;
        return av;
    }
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
        JOptionPane.showMessageDialog(null,
                "Média: \n"+String.format("%.2f", avarage(a,b)));
    }
}

