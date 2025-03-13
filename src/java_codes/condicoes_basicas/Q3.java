package java_codes.condicoes_basicas;
import javax.swing.JOptionPane;
public class Q3 {
    static void avarage(){
        String name = JOptionPane.showInputDialog("Digite o nome do aluno");
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Insira a nota 1 "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Insira a nota 2 "));
        String result = ((n1+n2)/2>=7) ? "Teve bom aproveitamento":"";
        JOptionPane.showMessageDialog(null,
                "Aluno:\n"+name+"\nMédia:\n"+String.format("%.2f",(n1+n2)/2)+"\n"+result);

        }
        public static void main(String[] args) {
        avarage();
    }

}
