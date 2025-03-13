package java_codes.condicoes_compostas;
import javax.swing.JOptionPane;
public class   Q7_DESAFIO {
    public static boolean match(int a) {
          int num = (int)(Math.random()*6);
            if (a == num) {
                return true;
            } else {
                return false;
        }
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 0 a 5:"));
        String result = (match(a)) ? "Você acertou!":"Você errou!";
        JOptionPane.showMessageDialog(null, result,"Resultado",0);
    }
}
