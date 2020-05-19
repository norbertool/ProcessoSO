package com.projeto;

public class Processo {
    private char nome;
    private  int tempoExec;
    private int prioridade;
    public static int quantum;
    GerenciaProcesso gp = new GerenciaProcesso();
    int tempo = 1000;

    public char getNome() {
        return nome;
    }

    public void setNome(char nome) {
        this.nome = nome;
    }

    public int getTempoExec() {
        return tempoExec;
    }

    public void setTempoExec(int tempoExec) {
        this.tempoExec = tempoExec;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;

    }

    public int getQuantum() {
        return quantum;
    }
    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }
    public void imprimir(boolean prioridade, int p){
        //Exibir o quantum apenas no início
        if(p==0){
            System.out.print("\nQuantum = " + getQuantum() + "");
            System.out.print("\n------------------------------------------\n");

        }
        System.out.print("Nome = " + getNome() + "\n");
        System.out.print("Tempo de Execução = " + getTempoExec() + "\n");
        if(prioridade){
            System.out.print("Prioridade = " + getPrioridade() + "\n");
        }
        System.out.print("------------------------------------------" + "\n");
        gp.pause(tempo);
    }

    public void execucao(){
        gp.pause(5000);
    }
}
