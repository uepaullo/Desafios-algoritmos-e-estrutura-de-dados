package java_codes.condicoes_compostas;
import javax.swing.JOptionPane;
import java.util.*;
import java.text.*;
public class Q12 {
    static double salary(double sal,int years,String sex){
        if (sex.equals("F")){
            if(years<15){
                return sal+sal*0.05;
            } else if (years>=15&years<=20){
                return sal+sal*0.12;
            }else{
                return sal+sal*0.23;
            }
        }else{
            if(years<20){
                return sal+sal*0.03;
            } else if (years>=20&years<=30){
                return sal+sal*0.13;
            }else{
                return sal+sal*0.25;
            }
        }
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Bem vindo ao reajustador de salários!","Menu",JOptionPane.INFORMATION_MESSAGE);
        try{
            String sex = JOptionPane.showInputDialog(null,
                    "Digite seu sexo:\n" +
                            "F/M","Informações",JOptionPane.QUESTION_MESSAGE).toUpperCase();
            double sal = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Digite seu atual salário","Informações",JOptionPane.INFORMATION_MESSAGE));
            int years = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Há quantos anos trabalaha na empresa?","Informações",JOptionPane.QUESTION_MESSAGE));
            JOptionPane.showMessageDialog(null,
                    "Seu novo salário reajustado é: "+NumberFormat.getCurrencyInstance().format(salary(sal,years,sex)),
                    "Reajuste",JOptionPane.INFORMATION_MESSAGE);
        }catch (InputMismatchException e){
            JOptionPane.showMessageDialog(null,
                    "Apenas numeros!","Erro",JOptionPane.ERROR_MESSAGE);
        }

    }
}
