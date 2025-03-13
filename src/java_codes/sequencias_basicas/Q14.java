package java_codes.sequencias_basicas;
import javax.swing.*;
import java.util.*;
import java.text.*;
public class Q14 {
    static double value(double day, double km){
        return (day*90)+(km*0.20);
    }
    public static void main(String[] args) {
        double days = Double.parseDouble(JOptionPane.showInputDialog(null,
                "insira a quantidade de dias de aluguel: "));
        double km = Double.parseDouble(JOptionPane.showInputDialog(null,
                "insira a quantidade de km's percorridos: "));
        JOptionPane.showMessageDialog(null,
                "Você deve:\n"+
                        NumberFormat.getCurrencyInstance().format(value(days, km)));
    }
}
