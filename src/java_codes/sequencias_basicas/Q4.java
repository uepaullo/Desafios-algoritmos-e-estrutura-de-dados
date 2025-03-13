package java_codes.sequencias_basicas;
import javax.swing.*;
public class Q4 {
    static void sum(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro: "));
        JOptionPane.showMessageDialog(null,
                "A soma entre "+a+" e "+b+" = " + (a+b));
    }
    public static void main(String[] args) {
        sum();
    }
}
