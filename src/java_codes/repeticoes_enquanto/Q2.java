package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q2 {
    static void count(){
        int i = 10;
        String s = "";
        while(i>=3){
            s+=" "+(i--);
        }
        s+=" Acabou!";
        JOptionPane.showMessageDialog(null, s,"Contagem",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args){
        count();
    }
}
