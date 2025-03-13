package java_codes.procedimentos;
import java_codes.condicoes_basicas.Q7;
import static java_codes.repeticao_com_para.Q7_DESAFIO.fibonacci;
import javax.swing.JOptionPane;
public class Q9_DESAFIO {
    public  static String sequence(int a ){
        String awnser = "";
        for (int i = 0; i <= a; i++) {
            awnser+=" >> "+fibonacci(i);
        }
        return awnser+=" FIM";
    }
    public static void main(String[] args) {
        int r = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a quantidade da sequência:"));
        JOptionPane.showMessageDialog(null,
                sequence(r),"Fibonacci",1);
    }
}
