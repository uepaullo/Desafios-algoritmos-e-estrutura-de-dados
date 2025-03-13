package java_codes.sequencias_basicas;
import javax.swing.*;
public class Q10 {
    static void baldes(){
        double h = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da parede"));
        double w = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura da parede"));
        JOptionPane.showMessageDialog(null,
                "Você precisará de "+String.format("%,.0f",((w*h)/2))+" baldes");
    }
    public static void main(String[] args) {
        baldes();
    }
}

