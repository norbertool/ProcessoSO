<h1 align="center">
    Simulação de Processo SO
</h1>

## Tecnologias

- Java

## Objetivo do Projeto

A aplicação feita em Java tem como objetivo demonstrar algumas execuções de processos em um sistema operacional de forma didática, de forma que o usuário consiga visualizar as etapas de forma intuitiva.
A aplicação consiste em mostrar as seguintes formas de execução:

### Escalonamento Circular (Round Robin)
É o tipo de escalonamento preemptivo mais simples e consiste em repartir uniformemente o tempo da CPU entre todos os processos prontos para a execução. Os processos são organizados numa fila circular, alocando-se a cada um uma fatia de tempo da CPU, igual a um número inteiro de quanta. Caso um processo não termine dentro de sua fatia de tempo, ele é colocado no fim da fila e uma nova fatia de tempo é alocada para o processo no começo da fila.

### Escalonamento Circular Prioritário
Se alguém da fila de pronto estiver com prioridade maior que o processo em execução, o S.O. realiza a preempção*.

> _*Preempção: Em computação, preemptividade é o ato de interromper temporariamente uma tarefa sendo executada por um sistema computacional, sem exigir sua cooperação, e com a intenção de retomar à tarefa posteriormente._
### _Conforme a evolução do projeto adicionaremos mais exemplos de escalonamentos/execuções._

Tendo em vista que o software tem como objetivo simular os escalonamentos de forma visual e de fácil entendimento para o usuário, permitindo que ele interaja com a aplicação, definindo as propriedades dos processos e a quantidade dos mesmos.
