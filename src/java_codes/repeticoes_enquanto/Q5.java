package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q5 {
    static String count(int i){
        int x = i-(i-1);
        String s = "";
        while(x<=i){
            s+=" "+(x++);
        }
        return s+" Acabou!";
    }
    public static void main(String[] args) {
        int i = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite um número","Menu",JOptionPane.PLAIN_MESSAGE));
        JOptionPane.showMessageDialog(null, count(i),"Contagem",JOptionPane.PLAIN_MESSAGE);
    }
}
