package java_codes.condicoes_basicas;
import javax.swing.JOptionPane;
import java.text.*;
import java.util.*;
public class Q7 {
    static double discount(double x, String s){
        double value = (s.equals("M")) ? (x-x*0.05) : (x-x*0.13);
        return value;
    }
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        String sex = JOptionPane.showInputDialog(null,
                "Digite seu sexo (M ou F) : ");
        Double value = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite valor de sua compra"));
        JOptionPane.showMessageDialog(null,
                "Parabéns! o valor da sua compra com disconto fica: "+
                NumberFormat.getCurrencyInstance().format(discount(value, sex.toUpperCase())));
    }
}
