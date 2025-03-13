package java_codes.condicoes_basicas;
import javax.swing.JOptionPane;
import java.security.PublicKey;

public class Q6 {
    static void alis(){
        int y = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite sua idade"));
        if (y>18){
            JOptionPane.showMessageDialog(null,
                    "Já se passaram "+(y-18)+" anos do alistamento");
            }else{
            JOptionPane.showMessageDialog(null,
                    "Ainda faltam "+(18-y)+" anos para seu alistamento");
        }
    }
    public static void main(String[] args) {
        alis();
    }
}

