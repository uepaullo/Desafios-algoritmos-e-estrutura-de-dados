package java_codes.sequencias_basicas;
import javax.swing.*;
public class Q11 {
    static void delta(){
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o valor de B: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o valor de C: "));
        double delta = Math.pow(b, 2)-(4*a*c);
        JOptionPane.showMessageDialog(null,
                b+"² - 4 x "+a+" x "+c+" = "+delta);
    }
    public static void main(String[] args) {
        delta();
    }
}
