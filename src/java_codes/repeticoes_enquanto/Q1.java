package java_codes.repeticoes_enquanto;
import javax.swing.*;
public class Q1 {
    public static void main(String[] args) {
        int i=6;
        String x="";
        while(i<=11){
            x+=" "+(i++);
        }
        x+=" Acabou!";
        JOptionPane.showMessageDialog(null, x,"Contagem",JOptionPane.INFORMATION_MESSAGE);
    }
}
