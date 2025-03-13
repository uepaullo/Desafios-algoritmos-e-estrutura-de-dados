package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q13 {
    static void count(){
        int five=0;
        int three=0;
        String numbers ="";
        int[] num = new int[20];
        for(int i=0; i<num.length; i++){
            num[i] = (int)(Math.random()*11);
            numbers += num[i]+" ";
            if(num[i]>5){
                five++;
            }else if(num[i]%3==0){
                three++;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Números sorteados: "+numbers+"\nMaiores que 5: "+five+"\nDivisives por 3: "+three,
                "Contagem",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        count();
    }
}
