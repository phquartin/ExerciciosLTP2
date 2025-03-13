# Linguagem e Técnicas de Programação
## Exercício 1. Criando uma Classe Pessoa
Crie uma classe Pessoa com os atributos:
- nome (String)
- idade (int)
- altura (double)

Implemente um construtor que receba esses valores e um método exibirDados()
que imprime os atributos no console.
No main, crie dois objetos Pessoa e exiba seus dados.

## Exercício 2. Criando uma Classe Produto com Modificadores de Acesso
Crie a classe Produto com:
- nome (String) (privado)
- preco (double) (privado)


Crie um construtor e métodos get e set para acessar e modificar os atributos.
No main, crie um produto, defina valores e exiba os detalhes.
## Exercício 3. Criando uma Classe Calculadora
Crie uma classe Calculadora com os métodos:
- soma(int a, int b) → int
- multiplicacao(double a, double b) → double
- parOuImpar(int num) → boolean (retorna true se for par, false se for ímpar)

No main, teste cada método imprimindo os resultados.


## Exercício 4. Criando uma Classe ContaBancaria com Saque e Depósito
Crie a classe Telefone com:
- numero (String)
- operadora (String)

Métodos:
- discar(String numero) → ligar para o número informado
- enviar_mensagem(String mensagem, String numero) → envia mensagem
para o número informado

No main, crie um telefone, realize uma ligação e um envio de mensagem. Imprima
os resultados no console.
## Exercício 5. Estrutura de Loop: Contagem Regessiva
Crie um programa que solicite um número inteiro positivo do usuário e faça uma
contagem regressiva até zero usando um loop while.


## Exercício 6. Criando uma Classe Aluno e Verificando Aprovação
Crie a classe Aluno com:
- nome (String)
- nota1, nota2 (double)

Método:
- calcularMedia() → retorna a média
- verificarAprovacao() → imprime "Aprovado" se a média for ≥ 7.0, senão
imprime "Reprovado".

No main, crie um aluno, atribua notas e exiba a situação.

## Exercício 7. Utilizando Operadores Lógicos em um Sistema de Login
Crie um programa que:
1. Define um usuário e senha corretos (String usuarioCorreto = "admin" e String
   senhaCorreta = "1234")
2. Solicita ao usuário que insira login e senha
3. Utiliza um operador lógico (&&) para verificar se as credenciais estão
   corretas
4. Exibe "Acesso concedido" ou "Acesso negado"

   ## Exercício 8. Criando uma Classe Esfera com Métodos para Área e Volume
   Crie a classe Esfera com:
   - raio (double)
   Métodos:
   - calcularArea()
   - calcularVolume()
   
   No main, crie uma esfera, defina valores e exiba os cálculos.
   ## Exercício 9. Estrutura de Repetição: Tabuada
   Crie um programa que recebe um número inteiro e exibe sua tabuada de 1 a 10
   usando um loop for.
   Exemplo:
   ## Exercício 10. Criando uma Classe Carro com Construtores e Método para Dirigir
   Crie a classe Carro com:
   - marca, modelo (String)
   - velocidade (int, inicia em 0)
   
   Construtores:
    1. Um que recebe marca e modelo
    2. Um sem parâmetros, definindo "Desconhecido" como padrão
   Método:
   • acelerar(int incremento), que aumenta a velocidade e exibe o novo valor.
   No main, crie carros e teste a aceleração