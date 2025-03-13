package java_codes.repeticao_com_para;
import javax.swing.JOptionPane;
public class Q7_DESAFIO {
    public static int fibonacci(int t ){
        if (t<=0){
            return 0;
        } else if (t==1) {
            return 1;
        }else{
            return fibonacci(t-1) + fibonacci(t-2);
        }
    }
    public static void main(String[] args) {
        String anwser = "";
        for(int i=1; i<=10; i++){
            anwser += fibonacci(i)+" ";
        }
        anwser+=" ...";
        JOptionPane.showMessageDialog(null, anwser,"Fibonacci", JOptionPane.INFORMATION_MESSAGE);
    }
}
