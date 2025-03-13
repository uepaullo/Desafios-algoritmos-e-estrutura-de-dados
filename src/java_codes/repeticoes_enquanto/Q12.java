package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q12 {
    static void count() {
        int even=0, odd=0;
        while(true) {
            String[] inputs = JOptionPane.showInputDialog(null,
                    "Digite seis números", "Contagem",
                    JOptionPane.INFORMATION_MESSAGE).split(" ");
            if (inputs.length < 6) {
                JOptionPane.showMessageDialog(null,
                        "Você deve digitar ao menos seis números!",
                        "Alerta",JOptionPane.ERROR_MESSAGE);
            }else{
                for (int i = 0; i < inputs.length; i++) {
                    if((Integer.parseInt(inputs[i]))%2==0){
                        even++;
                    }else{
                        odd++;
                    }
                }
                JOptionPane.showMessageDialog(null,
                        "Na sequência de inteiros, temos :\nPares : "+even+"\nÍmpares : "+odd,
                        "Contagem",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
    public static void main(String[] args) {
        count();
    }
}
