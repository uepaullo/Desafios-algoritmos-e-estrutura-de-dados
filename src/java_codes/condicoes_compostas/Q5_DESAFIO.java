package java_codes.condicoes_compostas;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Q5_DESAFIO {
    static boolean tri(String x){
        String[] values = x.split(" ");
        double[] v = new double[values.length];
        for (int i = 0; i < values.length; i++){
            v[i] = Double.parseDouble(values[i]);
        }
        Arrays.sort(v);
        if(v[0]+v[1]<v[2]){
            return true;
        }else{
            return false;
        }
    }
    static String type(String x){
        String[] values = x.split(" ");
        double[] v = new double[values.length];
        for (int i = 0; i < values.length; i++){
            v[i] = Double.parseDouble(values[i]);
        }
        if (v[0]!=v[1]&v[0]!=v[2]&v[1]!=v[2]){
            return "escaleno";
        } else if (v[0]==v[1]&v[0]==v[2]&v[1]==v[2]) {
            return "equilátero";
        }else{
            return "isósceles";
        }
    }
    public static void main(String[] args) {
        String sides = JOptionPane.showInputDialog("Digite três segmentos de reta: ");
        if (tri(sides)){
            JOptionPane.showMessageDialog(null,
                    "Os segmentos não formam um triângulo","Alerta",0);
        }else{
            JOptionPane.showMessageDialog(null,
                    "Os segmentos formam um triângulo "+type(sides));
        }
    }
}
