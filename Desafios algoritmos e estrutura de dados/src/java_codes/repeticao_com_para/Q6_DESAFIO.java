package java_codes.repeticao_com_para;
import javax.swing.JOptionPane;
public class Q6_DESAFIO {
    static void counting() {
        String[] TR = JOptionPane.showInputDialog(null,
                "Digite o primeiro termo e sua razão", "Progressão aritmética", 1).split(" ");
        String PR="";
        int sum = 0;
        int PT = Integer.parseInt(TR[0]);
        int q = 10;
        while (q > 0) {
            PR+=(PT)+" ";
            sum+=PT;
            PT+=Integer.parseInt(TR[1]);
            q--;
        }
        JOptionPane.showMessageDialog(null,PR+"\nSoma dos termos: "+sum,"Progressão aritmética", 1);
    }
    public static void main(String[] args) {
        counting();
    }
}
