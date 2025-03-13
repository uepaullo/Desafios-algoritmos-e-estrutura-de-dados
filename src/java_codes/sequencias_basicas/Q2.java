package java_codes.sequencias_basicas;
import javax.swing.*;
public class Q2 {
    static void welcome(){
        String name = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null,"Bem vindo "+name);
    }
    public static void main(String[] args) {
        welcome();
    }
}
