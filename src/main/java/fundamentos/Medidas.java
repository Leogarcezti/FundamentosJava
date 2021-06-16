// 1 - Nome do pacote

package fundamentos;

// 2 - Referência as bibliotecas

import java.util.Scanner;

// 3 - Classe (local de escrita do código)
public class Medidas {

    // 3.1 - Atributos - Características
    static Scanner entrada = new Scanner(System.in); // Declara e Instancia o objeto de leitura do console

    // 3.2 - Métodos e Funções - Metódo NÃO dá retorno - Função dá retorno

    public static void main(String[] args) {
        //void = Método que não retorna valor
        String opcao = " ";
        int area = 0; // Receber o resultado dos cálculos de área
        //TODO implementar o cáculo das demais áreas
        //TODO resolver problema do while
        while(!opcao.toUpperCase().equals("S")) {

            System.out.println("Escolha o Cálculo Desejado");
            System.out.println("(1) - Area do Quadrado");
            System.out.println("(2) - Area do Retângulo");
            System.out.println("(3) - Area do Triângulo");
            System.out.println("(4) - Area do Circulo");
            System.out.println("(5) - Tabuada");
            System.out.println("(6) - Sequencia de Fibonacci");
            System.out.println("(7) - Contagem Regressiva");
            System.out.println("(S) - Sair");

            opcao = entrada.nextLine(); // Leitura da opção
            switch (opcao) {
                case "1":
                    area = calcularAreadoQuadrado();
                    break;
                case "2":
                    // ToDo: calcular área do retângulo
                    break;
                case "5":
                    tabuada();
                    break;
                case "6":
                    fibonacci();
                    break;
                case "7":
                    contagemRegressiva();
                    break;
                case "s":
                case "S":
                    System.out.println("Agradecemos pela preferência! Fui!!");
                    break;
                default:
                    System.out.println("Valor inválido: " + opcao);
            }
            if (area > 0) {
                System.out.println("A área do quadradado é de " + area + "m²");
            }
        }

        }


    public static int calcularAreadoQuadrado() {
        int lado; // Tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // Leitura do tamanho do lado
        // Desenhar o quadrado

        for (int linha = 1; linha <= lado; linha += 2) {
            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("#");
            }
            System.out.println(""); //pular de linha
        }
        System.out.println(""); // pular de linha
        return lado * lado; // Retorna a área do lado - Return: Ultima linha de uma função
    }

    public static void tabuada() {
        System.out.print("Você quer calcula a tabuada de qual número? ");
        byte numero = entrada.nextByte();

        for (byte i = 0; i <= 10; i++) {
            System.out.print(numero * i + "-");
        }
    }

    public static void fibonacci() {
        System.out.print("Quantos números deseja calcular na sequencia? ");
        byte numero = entrada.nextByte();

        switch (numero){
            case 0:
                System.out.println("A sequencia está vazia!!!");
                break;
            case 1:
                System.out.println("Sequencia de Fibonnaci: 1");
                break;
            default:
                int num1 = 0;
                int num2 = 1;
                System.out.print("Sequencia de Fibonnaci: 1 ");
                for (byte i= 2; i <= numero; i++){
                    int fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;
                }
        }

    }
    public static void contagemRegressiva(){
        System.out.print("Começar a contagem a partir de qual número? ");
        int numero = entrada.nextInt();

        System.out.print("Diminuindo de quantos em quantos números por vez? ");
        int decrescimo = entrada.nextInt();

        for (int i= numero; i>= 1; i-= decrescimo){
             System.out.println(i);
        }
    }
}