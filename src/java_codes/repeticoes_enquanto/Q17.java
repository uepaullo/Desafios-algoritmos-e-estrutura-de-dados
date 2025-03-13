package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q17 {
    static void count(){
        while(true) {
            int mh = 0, p90 = 0, m50m160 = 0, m190m100 = 0;
            String[] alturas = JOptionPane.showInputDialog(null,
                    "Digite a altura (cm) de sete pessoas", "Alturas", 1).split(" ");
            String[] peso = JOptionPane.showInputDialog(null,
                    "Digite o peso (kg) das respectivas sete pessoas", "Peso", 1).split(" ");
            if(alturas.length < 7|peso.length < 7){
                JOptionPane.showMessageDialog(null,
                        "Você deve digitar ao menos 7 (sete) valores!","Erro",0);
            }else{
                for(int i = 0; i < alturas.length; i++){
                    mh += Integer.parseInt(alturas[i]);
                    if(Integer.parseInt(alturas[i]) < 160&&Integer.parseInt(peso[i]) < 50){m50m160++;}
                    if(Integer.parseInt(alturas[i])>190&&Integer.parseInt(peso[i]) > 100){m190m100++;}
                    if(Integer.parseInt(peso[i])>90){p90++;}
                }
                JOptionPane.showMessageDialog(null,
                        "Média de altura: "+mh/alturas.length+"cm\nPessoas com mais de 90Kg: "+p90+"\nPessoas com menos de 50Kg e menos de 160cm: "+
                        m50m160+"\nPessoas com mais de 100Kg e mais de 190cm: "+m190m100,"Contagem",1);
                break;
            }
        }
    }
        public static void main(String[] args) {count();}
}
