package java_codes.sequencias_basicas;
import javax.swing.*;
public class Q6 {
    static void num(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        JOptionPane.showMessageDialog(null,
                "O antecessor de "+a+" é: "+(a-1)+"\n" +
                        "O sucessor de "+a+" é: "+(a+1));
    }
    public static void main(String[] args) {
        num();
    }
}

