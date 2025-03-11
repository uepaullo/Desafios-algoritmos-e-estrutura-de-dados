package java_codes.condicoes_compostas;

import javax.swing.*;
import java.util.Locale;

public class Q6_DESAFIO {
    static boolean match(String j1, String j2) {
        if(j1.equals(j2)){
            JOptionPane.showMessageDialog(null,
                    "Empate!","JokenPo",JOptionPane.INFORMATION_MESSAGE);}
        if(j1.equals("pedra")&j2.equals("tesoura")||j1.equals("tesoura")&j2.equals("papel")||
            j1.equals("papel")&j2.equals("pedra")){
                return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String j1 = JOptionPane.showInputDialog(null,"J1 Faça sua jogada!",
                "JokenPo",JOptionPane.INFORMATION_MESSAGE).toLowerCase(Locale.ROOT);
        String j2 = JOptionPane.showInputDialog(null,"J2 Faça sua jogada!",
                "JokenPo",JOptionPane.INFORMATION_MESSAGE).toLowerCase(Locale.ROOT);
        JOptionPane.showMessageDialog(null,
                (match(j1,j2)) ? "J1 Ganhou!" : "J2 Ganhou!","JokenPo",JOptionPane.INFORMATION_MESSAGE);
    }
}
