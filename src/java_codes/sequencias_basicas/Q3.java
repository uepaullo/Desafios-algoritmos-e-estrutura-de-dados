package java_codes.sequencias_basicas;
import javax.swing.*;
import java.text.*;
import java.util.Locale;
public class Q3 {
    static void func(){
        String name = JOptionPane.showInputDialog("Digite o nome do funcionário");
        double salary = Double.parseDouble(JOptionPane.showInputDialog
                (null,"Agora o salário do funcionário "));
        JOptionPane.showMessageDialog(null,
                "Funcionário: "+name+"\n" +
                        "Salário: "+
                        NumberFormat.getCurrencyInstance(Locale.US).format(salary));
    }
    public static void main(String[] args) {
        func();
    }

    public static class Q5 {
    }
}
