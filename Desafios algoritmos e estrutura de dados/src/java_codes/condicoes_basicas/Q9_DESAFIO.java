package java_codes.condicoes_basicas;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class Q9_DESAFIO {
    static boolean tri(String x){
        String[] values = x.split(" ");
        double[] v = new double[values.length];
        for (int i = 0; i < values.length; i++){
            v[i] = Double.parseDouble(values[i]);
        }
        Arrays.sort(v);
        if(v[0]+v[1]<v[2]){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String values = JOptionPane.showInputDialog(null,
                "Digite três segmentos de retas");
        String result = (tri(values)) ? "formam um triângulo":"não formam um triângulo";
        JOptionPane.showMessageDialog(null,
                "Os segmentos "+result);
    }
}
