package java_codes.repeticoes_enquanto;
import java_codes.condicoes_compostas.Q7_DESAFIO;
import static java_codes.condicoes_compostas.Q7_DESAFIO.match;
import javax.swing.JOptionPane;
public class Q18_DESAFIO {
    static void rdm(){
        Q7_DESAFIO match = new Q7_DESAFIO();
        int i=4;
        while(i>0) {
            if (match(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite um numero de 0 a 5", "Chute", 1)))) {
                JOptionPane.showMessageDialog(null,
                        "Acertou!");
                break;
            }else{
                i--;
                if(i==0){
                    JOptionPane.showMessageDialog(null,
                            "Acabaram suas tentativas!","Aviso",0);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Errou! Ainda restam "+i+" Tentativas!","Aviso",1);
                }
            }
        }
    }
    public static void main(String[] args) {
        rdm();
    }
}
