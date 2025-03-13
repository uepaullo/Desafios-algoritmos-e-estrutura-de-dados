package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q9 {
    static void count(){
        int soma = 0;
        int in = 6;
        while(in<100){
            soma+=in;
            in+=2;
        }
        JOptionPane.showMessageDialog(null,
                "A soma entre 6 + 8 + 10 + 12 ... +100 = " +soma,"Contagem",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        count();
    }
}
