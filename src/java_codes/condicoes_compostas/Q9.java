package java_codes.condicoes_compostas;
import javax.swing.JOptionPane;
public class Q9 {
    static String IMC(double h,double w){
        double imc = w/Math.pow(h,2);
        if(imc<18.5){
            return "abaixo do peso";
        }else if(imc>=18.5&&imc<=25){
            return "no peso ideal";
        }else if(imc>=25&&imc<=30){
            return "em sobrepeso";
        }else if(imc>=30&&imc<=40){
            return "em obesidade";
        }else{
            return "em obesidade mórbida";
        }
    }
    public static void main(String[] args) {
        double h = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite o seu altura","informações",JOptionPane.INFORMATION_MESSAGE));
        double w = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite o seu peso","Informações",JOptionPane.INFORMATION_MESSAGE));
        if(IMC(h,w).equals("no peso ideal")){
            JOptionPane.showMessageDialog(null,
                    "Você está "+IMC(h,w));
        }else{
            JOptionPane.showMessageDialog(null,
                    "Você está "+IMC(h,w),"Alerta",JOptionPane.ERROR_MESSAGE);
        }
    }

}
