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
        String opcao;
        int area = 0; // Receber o resultado dos cálculos de área

        System.out.println("Escolha o Cálculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retângulo");
        System.out.println("(3) - Area do Triângulo");
        System.out.println("(4) - Area do Circulo");

        opcao = entrada.nextLine(); // Leitura da opção
        switch (opcao) {
            case "1":
                calcularAreadoQuadrado();
                area = calcularAreadoQuadrado();
                break;
            case "2":
                // ToDo: calcular área do retângulo
                break;
            default:
                System.out.println("Valor inválido: " + opcao);
        }
        if (area > 0) {
            System.out.println("A área do quadradado é de " + area + "m²");
        }
    }
    public static int calcularAreadoQuadrado() {
        int lado; // Tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // Leitura do tamanho do lado
        return lado * lado; // Retorna a área do lado

    }
}