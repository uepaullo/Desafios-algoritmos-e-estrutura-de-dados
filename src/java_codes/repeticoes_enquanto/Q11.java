package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q11 {
    static int soma(int[] ints){
        int soma=0;
        for(int i : ints){
            soma+=i;
        }
        return soma;
    }
    public static void main(String[] args) {
        while(true){
        String[] values = JOptionPane.showInputDialog(null,
                "Digite 7 números inteiros na mesma linha").split(" ");
        if(values.length < 7){
            JOptionPane.showMessageDialog(null,
                    "Você deve digitar ao meno sete números!",
                    "Alerta",JOptionPane.ERROR_MESSAGE);
        }else{
        int[] v = new int[values.length];
        for(int i = 0; i < values.length; i++){
            v[i] = Integer.parseInt(values[i]);
        }
        JOptionPane.showMessageDialog(null,
                "A soma dos números digitados é : " + soma(v));
        break;
        }
        }
    }
}
