package java_codes.condicoes_compostas;
import javax.swing.JOptionPane;
public class Q3 {
    static double area(String i){
        double[] a = new double[(i.split(" ")).length];
        for (int p=0;p<a.length;p++){
            a[p]=Integer.parseInt((i.split(" "))[p]);
        }
        return a[0]*a[1];
    }
    public static  void main(String[] args){
        while(true){
            String x = JOptionPane.showInputDialog(null,
                    "Digite as dimensoes do terreno");
            if (x.split(" ").length<2){
                JOptionPane.showMessageDialog(null,
                        "Você deve inserir as duas dimensões do terreno!",
                        "Alerta",JOptionPane.ERROR_MESSAGE
                );
            }else{
                if(area(x)<100){
                    JOptionPane.showMessageDialog(null,
                            "O terreno de "+area(x)+"m² é um terreno popular","Terreno",
                            JOptionPane.INFORMATION_MESSAGE);
                }else if(area(x)>=100&area(x)<=500){
                    JOptionPane.showMessageDialog(null,
                            "O terreno de "+area(x)+"m² é um terreno MASTER","Terreno",
                            JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,
                            "O terreno de "+area(x)+"m² é um terreno terreno VIP","Terreno",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            }
        }

    }
}
