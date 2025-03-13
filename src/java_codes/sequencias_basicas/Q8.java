package java_codes.sequencias_basicas;
import javax.swing.*;
public class Q8 {
    static void metros(){
        String[] M ={"Km","Hm","Dam","Dm","Cm","Mm"};
        double km = Double.parseDouble(JOptionPane.showInputDialog
                ("Digite um valor em metros:"));
        double KM = km/1000;
        String ex = "";
        for ( String i : M ){
            ex += KM+" "+i+"\n";
            KM*=100;
        }
        JTextArea call = new JTextArea(ex);
        JOptionPane.showMessageDialog(null, call);
    }
    public static void main(String[] args) {
        metros();
    }
}
