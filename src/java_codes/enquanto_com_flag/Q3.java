package java_codes.enquanto_com_flag;
import javax.swing.JOptionPane;
public class Q3 {
    static void classmates(){
        int qa = 0, ac=0;
        while(true) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite a idade de um aluno\nDigite 999 para parar a contagem", "Idades", 1));
            if (idade == 999) {
                JOptionPane.showMessageDialog(null,
                        "Quantidade de alunos: " + qa+"\nMédia de idades: "+ac/qa,"Total",1);
                break;
            }else{
                qa++;
                ac += idade;
            }
        }
    }
    public static void main(String[] args){
        classmates();
    }
}
