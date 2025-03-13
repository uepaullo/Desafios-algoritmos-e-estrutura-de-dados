package java_codes.condicoes_compostas;
import javax.swing.JOptionPane;
public class Q1 {
    static void maior(String x) {
        try {
            String[] aux = x.split(" ");
            int[] v = new int[aux.length];
            for (int i = 0; i < aux.length; i++) {
                v[i] = Integer.parseInt(aux[i]);
            }
            if (v[0] > v[1]) {
                JOptionPane.showMessageDialog(null,
                        v[0] + " é o maior");
            } else if (v[0] == v[1]) {
                JOptionPane.showMessageDialog(null,
                        "São iguais");
            } else {
                JOptionPane.showMessageDialog(null,
                        v[1] + " é o maior");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null,
                    "Você deve digitar dois números!", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        String z = JOptionPane.showInputDialog("Digite dois valores inteiros: ");
        maior(z);
        }
    }


