package java_codes.vetores;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class Q13_DESAFIO {
    public static int[] vetor(){
        int[] vetor = new int[20];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random()*100);
        }
        return vetor;
    }
    public static void main(String[] args){
        int[] vetor = vetor();
        JOptionPane.showMessageDialog(null,
                "Vetor aleatório:\n"+Arrays.toString(vetor));
        Arrays.sort(vetor);
        JOptionPane.showMessageDialog(null,
                "Vetor ordenado:\n"+Arrays.toString(vetor));
    }
}
