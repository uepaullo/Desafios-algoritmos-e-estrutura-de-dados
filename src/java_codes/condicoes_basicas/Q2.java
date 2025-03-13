package java_codes.condicoes_basicas;
import javax.swing.JOptionPane;
public class Q2 {
    static boolean vote(int y){
        if ((2024-y)>=16){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int birthYear = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o ano de nascimento"));
        if(vote(birthYear)){
            JOptionPane.showMessageDialog(null, "Você já pode votar");
        }
    }
}