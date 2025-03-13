package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q3 {
    static void count(){
        int i = -3;
        String s="";
        while(i<18){
            s+=" "+(i+3);
            i+=3;
        }
        s+=" Acabou!";
        JOptionPane.showMessageDialog(null, s,"Contagem",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        count();
    }
}
