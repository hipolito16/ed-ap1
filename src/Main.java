import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner para ler os valores da matriz

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = input.nextInt(); // Leitura do número de linhas da matriz

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = input.nextInt(); // Leitura do número de colunas da matriz

        long inicio = System.currentTimeMillis(); // Função para pegar horário de inicio de execução

        int[][] matriz = new int[linhas][colunas]; // Matriz com o tamanho lido anteriormente

        int contador = 0; // Contador para contar quantas vezes o padrão foi encontrado

        // Gera a matriz com os valores digitados anteriormente e mostra ela no terminal
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = (int) (Math.random() * 2);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Busca o padrão dentro da matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] == 1) {
                    if (i + 2 < linhas && j + 2 < colunas) {
                        if (matriz[i][j + 1] == 1 && matriz[i + 1][j] == 1 && matriz[i + 1][j + 1] == 0 && matriz[i + 2][j] == 0 && matriz[i + 2][j + 1] == 1) {
                            contador++;
                        }
                    }
                }
            }
        }

        System.out.println("O padrão foi encontrado " + contador + " vezes.");
        long fim = System.currentTimeMillis(); // Função para pegar horário de fim de execução
        double tempoTotal = (fim - inicio) / 1000.0; // Usado para transformar o tempo de execução em segundos com casas decimais
        System.out.println("Tempo: " + tempoTotal);

    }
}