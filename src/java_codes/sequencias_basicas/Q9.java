package java_codes.sequencias_basicas;
import javax.swing.*;
import java.text.*;
import java.util.*;
public class Q9 {
    static double dollar(double m){
        return (m/3.45);
    }
    public static void main(String[] args) {
        double money = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a quantidade de dinheiro disponível : "));
        JOptionPane.showMessageDialog(null,"" +
                "Com "+NumberFormat.getCurrencyInstance().format(money)+
                " você pode comprar "+
                NumberFormat.getCurrencyInstance().format(dollar(money))+" dólares.");
    }
}
