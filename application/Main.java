package application;

import entities.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        FiladePessoas fila = new FiladePessoas();

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Cadastramento ");
        char cha;

        do {
            System.out.println("digite seu nome:");
            String nome = sc.next();
            System.out.println("digite sua idade:");
            int idade = sc.nextInt();
            System.out.println("digite qual sexo:");
            String sexo = sc.next();

            System.out.println("Você tem alguma prioridade ? S/N");
            char escolha1 = sc.next().toLowerCase().charAt(0);

            if (escolha1 == 's') {
                System.out.println("Qual prioridade você possui : \n" +
                        "1-Pessoa Gestante \n" +
                        "2-Pessoa PCD \n" +
                        "3-Pessoa Idosa");
                int escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                        Pessoa gestante = new PessoaGestante(nome, idade);
                        fila.addPessoa(gestante);
                        break;
                    case 2:
                        Pessoa pcd = new PessoaPCD(nome, idade, sexo);
                        fila.addPessoa(pcd);
                        break;
                    case 3:
                        Pessoa idosa = new PessoaIdosa(nome, idade, sexo);
                        fila.addPessoa(idosa);
                        break;
                    default:
                        System.out.println("Opção invalida");
                }
            } else {
                Pessoa pcomum = new PessoaComum(nome, idade, sexo);
                fila.addPessoa(pcomum);
            }

            System.out.println("Quer cadastrar outro paciente ? S/N");
            cha = sc.next().toLowerCase().charAt(0);

        } while (cha == 's');

        int i = 0;
        for (Pessoa p : fila.getFilaPrioridade()) {
            System.out.println(p);
            System.out.println(fila.getFilaComum().get(i));
            i++;
        }
        int qnt = fila.getFilaPrioridade().size();
        int qnt1 = fila.getFilaComum().size();

        for (Pessoa p : fila.getFilaComum()) {
            if (qnt1>qnt) {
                System.out.println(fila.getFilaComum().get(i));
                qnt++;
            }
        }

    }
}
