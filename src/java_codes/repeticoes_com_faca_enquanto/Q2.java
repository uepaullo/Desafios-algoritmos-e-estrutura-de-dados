package java_codes.repeticoes_com_faca_enquanto;
import javax.swing.JOptionPane;
public class Q2 {
    static void counting(){
        int soma =0, media=0,i21=0;
        String s;
        do{
            int num = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite a idade de uma pessoa"));
            soma++;
            media+=num;
            if(num>21){i21++;}
            String r = JOptionPane.showInputDialog(null,
                    "Deseja continuar? (S/N)").toUpperCase();
            s=r;
        }while(s.equals("S"));
        JOptionPane.showMessageDialog(null,"Idades digitadas: "+soma+"\nMédia de idades: "+media/soma+
                "\nPessoas com mais de 21 anos: "+i21);
    }
    public static void main(String[] args) {
        counting();
    }
}
