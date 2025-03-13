package java_codes.sequencias_basicas;
import javax.swing.*;
public class Q7 {
    static void num(){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite um número"));
        JOptionPane.showMessageDialog(null,
                "O dobro de "+String.format("%,.0f",a)+" é: "+(a*2)+"\n" +
                        "A terça parte de "+String.format("%,.0f",a)+" é: "
                        +String.format("%.2f",a/3));
    }
    public static void main(String[] args) {
        num();
    }
}
