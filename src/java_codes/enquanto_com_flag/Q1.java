package java_codes.enquanto_com_flag;
import javax.swing.JOptionPane;
public class Q1 {
    static void count(){
        int soma=0;
        while(true){
            int num=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite um número inteiro. Digite 1111 para parar","Valores",1));
            if(num==1111){
                JOptionPane.showMessageDialog(null,
                        "O somatório dos números digitados é: "+soma);
                break;
            }else{
                soma+=num;
            }
        }
    }
    public static void main(String[] args) {
        count();
    }
}
