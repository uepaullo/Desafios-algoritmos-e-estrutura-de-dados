package java_codes.enquanto_com_flag;
import javax.swing.JOptionPane;
public class Q4 {
    public static void salaries(){
        int Qh = 0,Mh = 0,Mj = 0, Mi = 0, mmm = 0;
        while(true){
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite a idade de uma pessoa","Informações",1));
            String sex = JOptionPane.showInputDialog(null,
                    "Digite o sexo dessa pessoa (F/M)").toUpperCase();
            if(idade>Mi){
                Mi = idade;
            }
            if(sex.equals("F")){
                Mj=idade;
                if(Mj<idade){
                    Mj = idade;
                }
            }else{
                Qh++;
                Mh+=idade;
            }
            if(Mh==0){
                mmm=0;
            }else{
                mmm=Mh/Qh;
            }
            int confirm = JOptionPane.showConfirmDialog(null,"Deseja continuar?");
            if(confirm==1){
                JOptionPane.showMessageDialog(null,
                        "Maior idade: "+Mi+"\nHomens cadastrados: "+Qh+"\nMulher mais jovem: "+Mj+
                "\nMédia entre os homens: "+mmm,"Totalizando",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
    public static void main(String[] args){
            salaries();
    }
}
