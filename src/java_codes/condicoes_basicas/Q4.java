package java_codes.condicoes_basicas;
import javax.swing.JOptionPane;
public class Q4 {
    static boolean even(int n) {
        if (n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite um número"));
        String odd = even(num) ? "Par" : "Ímpar";
        JOptionPane.showMessageDialog(null,
                "O numero "+num+" é "+odd);
    }
}
