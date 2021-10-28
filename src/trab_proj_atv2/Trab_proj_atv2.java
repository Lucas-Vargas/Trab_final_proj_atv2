package trab_proj_atv2;

import java.util.Scanner;

public class Trab_proj_atv2 {
    public static void main(String[] args) {
        int num_conta;
     double saldo, cred, deb, sald_at;
     Scanner ler = new Scanner(System.in);
            num_conta = ler.nextInt();
        System.out.println("Insira seu saldo");
        saldo = ler.nextDouble();
        System.out.println("Insira quanto tens de crédito");
        cred = ler.nextDouble();
        System.out.println("Insira quanto gastaste no débito");
        deb = ler.nextDouble();
        sald_at = saldo-deb+cred;
        System.out.println("----------------------------------------------------");
        System.out.println("|                  Saldo Atual                      |");
        System.out.println("|                                                   |");
        System.out.println("|Seu saldo atual é de  R$"+sald_at+"                ");
        if(sald_at <=0){
        System.out.println("|Seu saldo foi negativo, mais cuidado nas compras!  |");
        }else{
        System.out.println("|Seu saldo foi positivo, cuidado para não ficar no\n| vermelho!                                        |");   
        }
        System.out.println("----------------------------------------------------");
           System.out.println("Insira o número de sua conta");
        num_conta = ler.nextInt();
        System.out.println("Insira seu saldo");
        saldo = ler.nextDouble();
        System.out.println("Insira quanto tens de crédito");
        cred = ler.nextDouble();
        System.out.println("Insira quanto gastaste no débito");
        deb = ler.nextDouble();
        sald_at = saldo-deb+cred;
        System.out.println("----------------------------------------------------");
        System.out.println("|                  Saldo Atual                      |");
        System.out.println("|                                                   |");
        System.out.println("|Seu saldo atual é de  R$"+sald_at+"                ");
        if(sald_at <=0){
        System.out.println("|Seu saldo foi negativo, mais cuidado nas compras!  |");
        }else{
        System.out.println("|Seu saldo foi positivo, cuidado para não ficar no\n| vermelho!                                        |");   
        }
        System.out.println("----------------------------------------------------");
        
    }
    
}
