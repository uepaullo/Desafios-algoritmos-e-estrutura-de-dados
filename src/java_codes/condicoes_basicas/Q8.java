package java_codes.condicoes_basicas;
import javax.swing.JOptionPane;
import java.util.*;
import java.text.*;
public class Q8 {
    static double amount(double x){
        double value = (x<=200) ? (x*0.50) : (x*0.45);
        return value;
    }
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a distância a ser percorrida em quilometros: "));
        JOptionPane.showMessageDialog(null,
                "A viagem de "+String.format("%,.0f",x)+"km totaliza "+
                        NumberFormat.getCurrencyInstance().format(amount(x)));

    }
}
