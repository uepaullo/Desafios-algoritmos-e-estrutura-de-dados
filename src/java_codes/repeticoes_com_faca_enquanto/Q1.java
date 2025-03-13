package java_codes.repeticoes_com_faca_enquanto;
import javax.swing.JOptionPane;
public class Q1 {
    static String count(){
        String ex = "";
        int i=0;
        do{
            ex+=" "+i;
            i+=3;
        }while(i<=30);
        ex+=" Acabou!";
        return ex;
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, count());
    }
}
