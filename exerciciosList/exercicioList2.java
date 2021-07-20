import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicioList2 {
    /*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
    public static void main(String[] args) {
        List<Boolean> questionario = new ArrayList<Boolean>();
        Scanner ler = new Scanner(System.in);
        int resposta;
        int menu = 0;
        int flag = 0;
        boolean certo = false;
        int contador = 0;

        System.out.println("VOCÊ ESTÁ SENDO INTERROGADO!!");
        System.out.println("RESPONDA AS PERGUNTAS COM 1 PARA SIM E 0 PARA NÃO");


        while (menu != 1){
            while (flag != 1) {
                System.out.println("TELEFONOU PARA VITIMA ?: ");
                resposta = ler.nextInt();
                if (resposta == 1) {
                    questionario.add(true);
                    flag = 1;
                }
                else if (resposta == 0)
                {
                    questionario.add(false);
                    flag = 1;
                }
                else{
                    System.out.println("RESPOSTA ERRADA, DIGITE 1 PARA SIM OU 0 PARA NÃO");
                    flag = 0;
                }
            }
            flag = 0;
            while (flag != 1) {
                System.out.println("Esteve no local do crime?: ");
                resposta = ler.nextInt();
                if (resposta == 1) {
                    questionario.add(true);
                    flag = 1;
                }
                else if (resposta == 0)
                {
                    questionario.add(false);
                    flag = 1;
                }
                else{
                    System.out.println("RESPOSTA ERRADA, DIGITE 1 PARA SIM OU 0 PARA NÃO");
                    flag = 0;
                }
            }
            flag = 0;
            while (flag != 1) {
                System.out.println("Mora perto da vítima?: ");
                resposta = ler.nextInt();
                if (resposta == 1) {
                    questionario.add(true);
                    flag = 1;
                }
                else if (resposta == 0)
                {
                    questionario.add(false);
                    flag = 1;
                }
                else{
                    System.out.println("RESPOSTA ERRADA, DIGITE 1 PARA SIM OU 0 PARA NÃO");
                    flag = 0;
                }
            } flag = 0;
            while (flag != 1) {
                System.out.println("Devia para a vítima?: ");
                resposta = ler.nextInt();
                if (resposta == 1) {
                    questionario.add(true);
                    flag = 1;
                }
                else if (resposta == 0)
                {
                    questionario.add(false);
                    flag = 1;
                }
                else{
                    System.out.println("RESPOSTA ERRADA, DIGITE 1 PARA SIM OU 0 PARA NÃO");
                    flag = 0;
                }
            }flag = 0;
            while (flag != 1) {
                System.out.println("Já trabalhou com a vítima?: ");
                resposta = ler.nextInt();
                if (resposta == 1) {
                    questionario.add(true);
                    flag = 1;
                }
                else if (resposta == 0)
                {
                    questionario.add(false);
                    flag = 1;
                }
                else{
                    System.out.println("RESPOSTA ERRADA, DIGITE 1 PARA SIM OU 0 PARA NÃO");
                    flag = 0;
                }

            }
            menu = 1;
        }
        for (int i=0; i<5; i++){
            if (questionario.get(i) == true){ contador++;}
        }
        if (contador == 2){
            System.out.println("VOCÊ É SUSPEITA");
        }
        else if (contador ==3 || contador == 4) {
            System.out.println("VOCÊ É CÚMPLICE");
        }
        else if (contador == 5){
            System.out.println("VOCÊ É ASSASSINO");
        }
        else
            System.out.println("VOCÊ É INOCENTE");
    }
}
