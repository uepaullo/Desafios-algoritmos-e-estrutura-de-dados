package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Currency;
public class Q14 {
    static void count(){
        int maior =0;
        int menor =0;
        while(true) {
            String[] pro = JOptionPane.showInputDialog("Digite o preco de oito produtos").split(" ");
            if(pro.length<8){
                JOptionPane.showMessageDialog(null,
                        "Você deve digitar ao menos oito preços!","Alerta",
                        JOptionPane.ERROR_MESSAGE);
            }else{
                    for (int i = 0; i < (pro.length)-1; i++) {
                        if (Double.parseDouble(pro[i]) > Double.parseDouble(pro[i + 1])) {
                           pro[i] = pro[i + 1];
                           pro[i + 1] = pro[i];
                        }
                    }
                    JOptionPane.showMessageDialog(null,
                            "Maior valor: " + NumberFormat.getCurrencyInstance().format(Double.parseDouble(pro[pro.length-1]))
                                    + "\nMenor valor: " + NumberFormat.getCurrencyInstance().format(Double.parseDouble(pro[0])), "Mensagem",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }
    }
    public static void main(String[] args) {count();}
}

