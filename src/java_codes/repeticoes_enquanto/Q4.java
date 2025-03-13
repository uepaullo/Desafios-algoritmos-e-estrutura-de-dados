package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q4 {
    static void count(){
        int i = 100;
        String s = "";
        while(i > 0){
            s+=" "+(i-5);
            i-=5;
        }
        s+=" Acabou!";
        JOptionPane.showMessageDialog(null, s,"Contagem",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        count();
    }
}
