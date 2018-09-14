# triangulo
Projeto - Aula 31/09 - Integração contínua, repositórios, complexidade ciclomática.

> COMPLEXIDADE CICLOMÁTICA
É uma métrica existente na engenharia de software que mede quão complexo está algum código (classe, método, entre outros).
A metrica possui como base quantos caminhos o programa pode tomar até o fim de sua execução. Um novo caminho pode ser entendido como um novo fluxo, um desvio do fluxo principal.

O resultado da complexidade ciclomática indica quantos testes seriam necessários para cobrir todas as posibilidades de execução do código, verificando todos os fluxos possíveis.

As três formas de calcular a complexidade ciclomática são:

• Usando a notação de um grafo de fluxo.

• Usando fluxograma;

• Análise estática do código (usando uma ferramenta para automatizar essa tarefa).

Os valores de referência são:

1-10 = Método simples. Baixo risco. // 
11-20 = 	Método razoavelmente complexo. Moderado risco. // 
21-50	= Método muito complexo. Elevado risco. // 
51-N =	Método de ==altíssimo risco== e bastante instável.

Algumas formas de diminuir a complexidade são:

• Reduzir os métodos recursivos (substituindo por iteração)

• Decompor estruturas de condição muito grandes

• Substituir estruturas de condição por variaveis boleanas ou polimorfismo.
