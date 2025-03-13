package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q10 {
    static void count(){
        int soma=0;
        int in = 500;
        while(in>0){
            soma+=in;
            in-=50;
        }
        JOptionPane.showMessageDialog(null,
                "A soma da sequência a seguir 500 + 450 + 300 + ... + 0 = "+
                        soma,"Contagem",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        count();
    }
}
