package java_codes.condicoes_compostas;
import javax.swing.JOptionPane;
import java.text.*;
import java.util.*;
public class Q10 {
    static double total(String type,int days,double km){
        if(type.equals("luxo")){
            if(km<=100){
                return (90*days)+(km*0.2);
            }else{
                return (90*days)+(km*0.1);
            }
        }else{
            if(km<=200){
                return (150*days)+(km*0.3);
            }else{
                return (150*days)+(km*0.25);
            }
        }
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Bem vindo ao menu de pagamentos!","menu",JOptionPane.INFORMATION_MESSAGE);
        String type = JOptionPane.showInputDialog(null,
                "Digite qual o tipo de carro escolhido\nLuxo ou Popular",
                "Informações",JOptionPane.INFORMATION_MESSAGE).toLowerCase(Locale.ROOT);
        int days = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Por quantos dias o carro foi alugado?","Informações",JOptionPane.INFORMATION_MESSAGE));
        double km = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Quantos km foram percorridos com o carro","Informações",JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null,
                "Sua conta totalizou: "+
                        NumberFormat.getCurrencyInstance().format(total(type,days,km)),
                "Total",JOptionPane.INFORMATION_MESSAGE);

    }
}
