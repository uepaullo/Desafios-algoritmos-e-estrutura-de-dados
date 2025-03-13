package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q7 {
    static void count(int[] i){
        String x = "";
        while(i[0] <= i[1]){
            x+=" "+(i[0]);
            i[0]+=i[2];
        }
        x+=" Acabou!";
        JOptionPane.showMessageDialog(null, x,"Contagem",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        String[] values = JOptionPane.showInputDialog(null,
                "Digite os valores do começo, fim e incremento da contagem.","Contagem",JOptionPane.INFORMATION_MESSAGE).split(" ");
        int[] i = new int[values.length];
        for(int x = 0; x < values.length; x++){
            i[x] = Integer.parseInt(values[x]);
        }
        count(i);
    }
}
