package java_codes.enquanto_com_flag;
import javax.swing.JOptionPane;
public class Q2 {
    static void salaries(){
        double somaM=0, somaF=0;
        while(true){
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite o salário do funcionário","Informações",1));
            String sexo = JOptionPane.showInputDialog(null, "Digite sexo: M/F").toUpperCase();
                if (sexo.equals("M")){somaM += salario;}else{somaF += salario;}
            String anwser = JOptionPane.showInputDialog(null,
                    "Deseja continuar (S/N)?","Continuar",1).toUpperCase();
            if(anwser.equals("N")) {
                JOptionPane.showMessageDialog(null,
                        "Total de salário das mulheres: "+somaF+"\nTotal de salários dos homens: "+somaM,"Total",1);
                break;
            }
        }
    }
    public static void main(String[] args) {
        salaries();
    }
}
