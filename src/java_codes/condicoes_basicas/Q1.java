package java_codes.condicoes_basicas;
import javax.swing.*;
import java.text.*;
import java.util.*;
public class Q1 {
     static  void penalty(){
        int km = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a velocidade do carro"));
        if (km>80){
            JOptionPane.showMessageDialog(null,
                    "Velocidade acima da permitida.\n" +
                            "Você recebeu uma multa de "+
                            NumberFormat.getCurrencyInstance().format((km-80)*5));
        }
    }
    public static void main(String[] args) {
         penalty();
    }
}
