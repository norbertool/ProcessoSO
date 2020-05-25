package com.projeto;

public class Processo {
    private char nome;
    private  int tempoExec;
    private int prioridade;
    private static int quantum;
    private int tempoEspera;

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

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

    public void imprimirQuantum(){
        //Exibir o quantum apenas no início
        System.out.print("Quantum = " + getQuantum() + "");
        System.out.print("\n------------------------------------------\n");
    }
    public void imprimir(boolean prioridade, int p){
        System.out.print("Nome = " + getNome() + "\n");
        System.out.print("Tempo de Execução = " + getTempoExec() + "\n");
        if(prioridade){
            System.out.print("Prioridade = " + getPrioridade() + "\n");
        }
        System.out.print("------------------------------------------" + "\n");
    }

    public void execucao(){
        int novoTempo = this.getTempoExec();
        for(int i = 1; i <= getQuantum(); i++ ){
            if(novoTempo == 0){
                this.setTempoExec(novoTempo);
                return;
            }
            novoTempo--;
        }
        this.setTempoExec(novoTempo);
        return;
    }
    public void turnAround(){

    }
}
