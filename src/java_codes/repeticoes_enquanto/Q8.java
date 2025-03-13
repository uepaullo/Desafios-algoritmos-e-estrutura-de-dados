package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q8 {
    static void count(int[] i){
        String x = "";
        while(i[0] <= i[1]){
            x+=" "+(i[0]);
            i[0]+=i[2];
        }
        x+=" Acabou!";
        JOptionPane.showMessageDialog(null,
                x,"Contagem",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        while(true) {
            String[] values = JOptionPane.showInputDialog(null,
                    "Digite os valores do começo, fim e incremento da contagem.",
                    "Contagem", JOptionPane.INFORMATION_MESSAGE).split(" ");
            if (Integer.parseInt(values[0]) > Integer.parseInt(values[1])) {
                JOptionPane.showMessageDialog(null,
                        "O valor inicial deve ser menor do que o valor final!",
                        "Alerta",JOptionPane.ERROR_MESSAGE);
            }else{
            int[] i = new int[values.length];
            for (int x = 0; x < values.length; x++) {
                i[x] = Integer.parseInt(values[x]);
            }
            count(i);
            break;
        }
        }
    }
}
