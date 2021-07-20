import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicioList1 {

    /*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Double> temp = new ArrayList<>();
        double soma = 0;
        double media;
        DecimalFormat format = new DecimalFormat("#.##");

        for (int i=0; i < 6; i++){
            System.out.println("Digite uma temperatura para o mês "+ (i+1)+":");
            temp.add(ler.nextDouble());
            soma += temp.get(i);
        }
        media = soma/temp.size();

        for (int i=0; i<6; i++){
            if (i==0) {System.out.println((i+1)+" - JANEIRO: "+temp.get(i));}
            else if (i==1) {System.out.println((i+1)+" - FEVEREIRO: "+temp.get(i));}
            else if (i==2) {System.out.println((i+1)+" - MARÇO: "+temp.get(i));}
            else if (i==3) {System.out.println((i+1)+" - ABRIL: "+temp.get(i));}
            else if (i==4) {System.out.println((i+1)+" - MAIO: "+temp.get(i));}
            else {System.out.println((i+1)+" - JUNHO: "+temp.get(i));}
        }
        System.out.println("MEDIA DESTE SEMESTRE:  "+ format.format(media));
        System.out.println("-------------------------------");
        System.out.println("MÊS COM TEMPERATURAS MAIORES QUE A MÉDIA");
        for (int i=0; i<6; i++){
            if (temp.get(i) > media && i==0 ){System.out.println((i+1)+" - JANEIRO: "+temp.get(i));}
            else if (temp.get(i) > media && i==1 ){System.out.println((i+1)+" - FEVEREIRO: "+temp.get(i));}
            else if (temp.get(i) > media && i==2 ){System.out.println((i+1)+" - MARÇO: "+temp.get(i));}
            else if (temp.get(i) > media && i==3 ){System.out.println((i+1)+" - ABRIL: "+temp.get(i));}
            else if (temp.get(i) > media && i==4 ){System.out.println((i+1)+" - MAIO: "+temp.get(i));}
            else if (temp.get(i) > media && i==5 ){System.out.println((i+1)+" - JUNHO: "+temp.get(i));}
        }


    }
}
