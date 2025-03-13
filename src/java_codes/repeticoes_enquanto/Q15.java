package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q15 {
    static void count(){
        int maior=0, menor=0, soma=0;
        while(true) {
            String[] idades = JOptionPane.showInputDialog("Digite a idade de 10 pessoas").split(" ");
            if(idades.length<10) {
                JOptionPane.showMessageDialog(null,
                        "Você deve digitar a idade de 10 pessoas!","Alerta",JOptionPane.ERROR_MESSAGE);
            }else{
                for(int i=0;i<idades.length-1;i++) {
                    soma+=Integer.parseInt(idades[i]);
                    if(Integer.parseInt(idades[i])>Integer.parseInt(idades[i+1])) {
                        idades[i]=idades[i+1];
                        idades[i+1]=idades[i];
                    }
                    if(Integer.parseInt(idades[i])>18){
                        maior++;
                    }else if(Integer.parseInt(idades[i])<5){
                        menor++;
                    }
                }
                JOptionPane.showMessageDialog(null,
                        "Maior idade: "+idades[idades.length-1]+"\nMaiores de 18: "+maior+"\nMenores de 5: "+menor+"\nMédia: "+soma/ idades.length,
                        "Contagem",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
    public static void main(String[] args) {
        count();
    }
}
