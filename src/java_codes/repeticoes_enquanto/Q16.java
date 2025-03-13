package java_codes.repeticoes_enquanto;
import javax.swing.JOptionPane;
public class Q16 {
    static void count() {
        int f=0,m=0,soma=0,mm=0,f20=0,mmm=0;
        while(true) {
            String[] idades = JOptionPane.showInputDialog("Digite a idade de cinco pessoas").split(" ");
            String[] sexo = JOptionPane.showInputDialog("Digite o sexo das cinco pessoas respectivamente.\n(F/M)").toUpperCase().split(" ");
            if(idades.length<5|sexo.length<5){
                JOptionPane.showMessageDialog(null,
                        "Você deve informar ao menos cinco valores!","Alerta",0);
            }else{
                for(int i=0;i<idades.length;i++){
                    if(sexo[i].equals("F")){
                        f++;
                        if(Integer.parseInt(idades[i])>20){
                            f20++;
                        }
                    }else{
                        m++;
                        mm+=Integer.parseInt(idades[i]);
                    }
                }
                if(m==0){mmm=0;}else{mmm=mm/m;}
                for(int i=0;i<idades.length;i++){
                    soma+=Integer.parseInt(idades[i]);
                }
                    JOptionPane.showMessageDialog(null,
                            "Média de idades: " + soma / idades.length +
                                    "\nMédia de idades dos homens: " + mmm + "\nMulheres acima dos 20 anos: " + f20 +
                                    "\nQuantidade de homens: " + m + "\nQuantidades de mulheres: " + f, "Contagem", 1);
                break;
            }
        }
    }
    public static void main(String[] args) {
        count();
    }
}