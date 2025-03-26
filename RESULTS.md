# Resultados 

### MergeSort

| Array Size | Algorithm | Duration (ms) | Comparisons   |
|------------|-----------|---------------|---------------|
| 32         | mergeSort | 0.026125      | 123           |
| 2,048      | mergeSort | 0.698458      | 19,943        |
| 1,048,576  | mergeSort | 160.88525     | 19,644,634    |

### Conclusão

A divisão e conquista é uma abordagem eficiente para ordenar vetores. O algoritmo MergeSort é capaz de ordenar vetores de 1.048.576 elementos em menos de 200ms.


### MaxVal

| Array Size | Algorithm | Duration (ms) | Comparisons |
|------------|-----------|---------------|------------|
| 32         | maxVal1   | 0.001833      | 31         |
| 32         | maxVal2   | 0.005959      | 31         |
| 2,048      | maxVal1   | 0.0335        | 2,047      |
| 2,048      | maxVal2   | 0.2015        | 2,047      |
| 1,048,576  | maxVal1   | 5.055167      | 1,048,575  |
| 1,048,576  | maxVal2   | 4.059417      | 1,048,575  |

#### Conclusão

A divisão e conquista nem sempre é a melhor abordagem para resolver um problema. No caso de encontrar o maior valor em um vetor, por exemplo, sempre será necessário percorrer o vetor inteiro. Nesse caso, a abordagem iterativa é mais simples de implementar e mais eficiente.

### Multiplicação de BigInts

| Tamanho (bits) | Algoritmo  | Duration (ms) | Chamadas Recursivas | Resultado              |
|----------------|------------|---------------|---------------------|------------------------|
| 4              | Multiply   | 0.014792      | 21                  | 195                    |
| 16             | Multiply   | 0.0295        | 341                 | 2,600,000,000          |
| 32             | Multiply   | 0.118916      | 1,365               | 3,000,000,000,000,000,000 |
