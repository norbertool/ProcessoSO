package com.projeto;
import java.util.Scanner;

public class GerenciaProcesso {
    //Vetor de Processos
    int size = 10;
    int p;
    int tempo = 10000;
    boolean finalizar;
    boolean prioridade;
    Processo processo[] = new Processo[size];
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Criando as variaveis e objetos
        GerenciaProcesso gerenciar = new GerenciaProcesso();
        int opt;

        do{
            gerenciar.menu();
            opt = gerenciar.sc.nextInt();

            switch (opt){

                case 1:
                    gerenciar.circular();
                    break;

                case 2:
                    gerenciar.circularPrioridade();
                    break;

                case 3:
                    gerenciar.sair();
                    break;

                default:
                    gerenciar.Default();
                    break;
            }
        }while(opt!=3);

    }
    public void menu(){
        //Exibe o menu
        System.out.print("\nEscolha o processo que deseja executar:");
        System.out.print("\n1. Circular");
        System.out.print("\n2. Circular por Prioridade");
        System.out.print("\n3. Sair");
        System.out.print("\n\n> ");
    }

    public void circular(){
        p = 0;
        prioridade = false;
        do{
            criar(prioridade, p);
            finalizar = encerrar();
            p++;
        }while(finalizar != true);
        exibir(prioridade);
        pause(tempo);
    }

    public void circularPrioridade(){
        p = 0;
        prioridade = true;
        do{
            criar(prioridade, p);
            finalizar = encerrar();
            p++;
        }while(finalizar != true);
        exibir(prioridade);
        pause(tempo);
    }

    public void sair(){
        System.out.print("\nPrograma Finalizado");
    }

    public void Default(){
        System.out.print("\nInsira um valor válido\n.");
        pause(1500);
    }


    public void pause(int tempo){
        //Pausa o código
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void criar(boolean prioridade, int p){
        processo[p] = new Processo();

        //Inicializando o quantum
        if(p == 0){
            System.out.print("\nDigite o valor do quantum: ");
            processo[p].setQuantum(sc.nextInt());
        }

        //Inserindo os valores
        System.out.print("Digite um caractere para o processo: ");
        processo[p].setNome(sc.next().charAt(0));
        System.out.print("Digite o tempo de execução: ");
        processo[p].setTempoExec(sc.nextInt());

        //Inserindo "Prioridade" caso tenha
        if(prioridade){
            System.out.print("Digite a prioridade do processo: ");
            processo[p].setPrioridade(sc.nextInt());
        }
    }

    public void exibir(boolean prioridade){
        //Varrendo o array de objeto
        p = 0;
        for(Processo processo : processo){
            if(processo!=null){
                processo.imprimir(prioridade, p);
            }
            p++;
        }
    }

    public boolean encerrar(){
        String continuar;

        //Pergunta ao usuário se deseja inserir outro processo
        System.out.print("\nDeseja inserir outro processo? S/N\n");
        System.out.print("\n> ");
        continuar = sc.next().toLowerCase();

        finalizar = continuar.contains("n");
        System.out.println();
        return finalizar;
    }
}
