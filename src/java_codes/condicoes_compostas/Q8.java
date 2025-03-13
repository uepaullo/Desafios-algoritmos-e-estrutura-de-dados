package java_codes.condicoes_compostas;
import javax.swing.JOptionPane;
public class Q8 {
    static boolean house(double house, double salary,int years){
        double parcela = house/(years*12);
        if (parcela > salary*0.3){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Bem vindo ao menu de empréstimos!","Menu",JOptionPane.INFORMATION_MESSAGE);
        double house = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite o valor da casa a ser comprada","Informações",JOptionPane.INFORMATION_MESSAGE));
        double salary = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite o valor de seu salário atual","Informações",JOptionPane.INFORMATION_MESSAGE));
        int years = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Em quantos anos deseja pagar a casa?","Informaçes",JOptionPane.INFORMATION_MESSAGE));
        if (house(house,salary,years)){
            JOptionPane.showMessageDialog(null,
                    "Seu empréstimo foi aprovado!","Resultado",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,
                    "Infelizmente não conseguimos aprovar seu empréstimo.","Resultado",JOptionPane.ERROR_MESSAGE);
        }
    }
}
