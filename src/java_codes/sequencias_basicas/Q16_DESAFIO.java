package java_codes.sequencias_basicas;
import javax.swing.JOptionPane;
public class Q16_DESAFIO {
    static void days(){
        double cigarros = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a quantidade de cigarros fumados por dia"));
        double anos = Integer.parseInt(JOptionPane.showInputDialog(null,
                "A quantos anos você fuma?"));
        JOptionPane.showMessageDialog(null,
                "Quantidade de dias de vida perdidos:\n"+
                String.format("%,.1f",((cigarros*10)/60/24)*365));
    }
    public static void main(String[] args) {
        days();
    }
}
