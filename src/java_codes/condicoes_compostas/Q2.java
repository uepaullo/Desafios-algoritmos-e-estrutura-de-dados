package java_codes.condicoes_compostas;
import javax.swing.JOptionPane;
public class Q2 {
    static double avarage(double x,double y){
        return ((x+y)/2);
    }
    static double[] conver(String c){
        double[] result=new double[(c.split(" ")).length];
        for(int i=0;i<result.length;i++){
            result[i]=Double.parseDouble((c.split(" "))[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        double[] v;
        while(true){
            String x = JOptionPane.showInputDialog("Digite suas notas");
            if(x.split(" ").length<2){
                JOptionPane.showMessageDialog(null,
                        "Você deve digitar duas notas!","Alerta",JOptionPane.ERROR_MESSAGE);
            }else{
                v = conver(x);
                break;
            }
        }
        if (avarage(v[0],v[1])<=4.9){
            JOptionPane.showMessageDialog(null,
                    "Reprovado!","Situaçõao",JOptionPane.ERROR_MESSAGE);
        }else if (avarage(v[0],v[1])>4.9 & avarage(v[0],v[1])<=6.9){
            JOptionPane.showMessageDialog(null,
                    "Recuperação","Situação",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,
                    "Aprovado!","Situação",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
