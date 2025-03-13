package java_codes.condicoes_basicas;
import javax.swing.JOptionPane;
public class Q5 {
    static boolean bi(int i){
       if (i%4==0){
           return true;
       }else if (i%100==0 & i%400!=0){
           return true;
       }else if (i%400==0){
           return true;
       }else {
           return false;
       }

    }
    public static void main(String[] args) {
        int y = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite um ano do calendário"));
        String result = (bi(y)) ? "ano bissexto" : "ano não bissexto";
        JOptionPane.showMessageDialog(null,
                y+" é um "+result);
    }

}
