package java_codes.repeticoes_enquanto;
import static java_codes.condicoes_compostas.Q7_DESAFIO.match;
import javax.swing.JOptionPane;
public class Q18_DESAFIO {
    static void rdm(){
        int i=4;
        while(i>=0) {
            if (match(Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 a 10","Chute")),11)) {
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
