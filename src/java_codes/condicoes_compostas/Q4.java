package java_codes.condicoes_compostas;
import javax.swing.JOptionPane;
import java.util.*;
import java.text.*;
public class Q4 {
    static double sal(int y, double s){
        if (y<3){
            return s+s*0.03;
        } else if (y>=3 & y<10) {
            return s+s*0.125;
        }else{
            return s+s*0.2;
        }
    }
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Digite o nome do funcionário: ");
        double salary = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Insira o salário do usuário"));
        int year = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Há quantos anos trabalha na empresa"));
        JOptionPane.showMessageDialog(null,"Funcionário: "+name+
                "\nSalário: "+salary+"\nSalário após reajuste: "+NumberFormat.getCurrencyInstance().format(sal(year,salary)));
    }
}
