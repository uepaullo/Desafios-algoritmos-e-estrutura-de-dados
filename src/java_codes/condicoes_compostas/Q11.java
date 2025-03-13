package java_codes.condicoes_compostas;
import javax.swing.JOptionPane;
import java.util.*;
import java.text.*;
public class Q11 {
    static double hours(int horas){
        if (horas<=10){
            return (horas*2)*0.05;
        }else if(horas>10&horas<=20){
            return (horas*5)*0.5;
        }else{
            return (horas*10)*0.5;
        }
    }
    public static void main(String[] args) {
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas em exercícios"));
        JOptionPane.showMessageDialog(null,
                "Parabéns!\nVocê faturou "+NumberFormat.getCurrencyInstance().format(hours(horas))+" em atividade físicas"
        ,"Total de horas",JOptionPane.INFORMATION_MESSAGE);
    }
}
