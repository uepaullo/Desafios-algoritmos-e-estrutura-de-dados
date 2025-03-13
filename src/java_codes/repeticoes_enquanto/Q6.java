package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q6 {
    static void count(){
        String x = "";
        int y = 30;
        while(y > 1){
            if(y%4==0){
                x+=" "+"["+(y--)+"]";
            }else{
                x+=" "+(y--);
            }
        }
        x+=" Acabou!";
        JOptionPane.showMessageDialog(null, x,"Contagem",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        count();
    }
}
