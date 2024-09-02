//execercicio 1

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[5]; // Array para armazenar os 5 valores
        double soma = 0; // Variável para armazenar a soma dos valores

        // Loop para ler os 5 valores
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble(); // Lê o valor digitado pelo usuário
            soma += valores[i]; // Adiciona o valor à soma
        }

        // Calcula a média aritmética
        double media = soma / 5;

        // Exibe os valores digitados
        System.out.println("Valores digitados: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(valores[i]);
        }

        // Exibe a média aritmética
        System.out.println("Média aritmética: " + media);
        
        scanner.close(); // Fecha o objeto Scanner para evitar vazamento de recursos
    }
}

//exercicio 2 

import javax.swing.JOptionPane;

public class AreaCirculo {
    public static void main(String[] args) {
        // Solicita ao usuário o valor do raio do círculo
        String raioString = JOptionPane.showInputDialog("Digite o valor do raio do círculo:");
        
        // Converte a string para double
        double raio = Double.parseDouble(raioString);
        
        // Calcula a área do círculo
        double area = Math.PI * Math.pow(raio, 2);
        
        // Formata a área com quatro casas decimais
        String areaFormatada = String.format("%.4f", area);
        
        // Exibe a área do círculo
        JOptionPane.showMessageDialog(null, "A área do círculo é: " + areaFormatada);
    }
}

//exercicio 3

import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê o número de horas trabalhadas do funcionário
        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        // Lê o valor recebido por hora
        System.out.print("Digite o valor recebido por hora: ");
        double valorPorHora = scanner.nextDouble();
        
        // Calcula o salário
        double salario = horasTrabalhadas * valorPorHora;
        
        // Exibe o salário formatado com duas casas decimais
        System.out.printf("O salário do funcionário é: R$ %.2f%n", salario);
        
        scanner.close();
    }
}

//exercicio 4

import javax.swing.JOptionPane;
import java.time.Year;

public class NomeIdade {
    public static void main(String[] args) {
        // Solicita o nome do usuário
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        
        // Solicita o ano de nascimento do usuário
        String anoNascimentoString = JOptionPane.showInputDialog("Digite o seu ano de nascimento:");
        
        // Converte o ano de nascimento de String para inteiro
        int anoNascimento = Integer.parseInt(anoNascimentoString);
        
        // Obtém o ano atual
        int anoAtual = Year.now().getValue();
        
        // Calcula a idade
        int idade = anoAtual - anoNascimento;
        
        // Exibe a mensagem com o nome e a idade calculada
        String mensagem = String.format("Você se chama %s e possui %d anos de idade!", nome, idade);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

//exercicio 5

import java.util.Scanner;

public class DescontoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o nome do produto
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        // Lê o valor original do produto
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        // Lê a porcentagem de desconto
        System.out.print("Digite a porcentagem de desconto: ");
        double porcentagemDesconto = scanner.nextDouble();

        // Calcula o valor do desconto
        double desconto = (valorProduto * porcentagemDesconto) / 100;

        // Calcula o valor final com desconto
        double valorComDesconto = valorProduto - desconto;

        // Exibe o resultado formatado com três casas decimais
        System.out.printf("Produto: %s%n", nomeProduto);
        System.out.printf("Valor original: R$ %.2f%n", valorProduto);
        System.out.printf("Valor com desconto: R$ %.3f%n", valorComDesconto);

        scanner.close();
    }
}

//exercicio 6

import javax.swing.JOptionPane;

public class ReajusteSalarial {
    public static void main(String[] args) {
        // Solicita ao usuário o valor do salário
        String salarioString = JOptionPane.showInputDialog("Digite o salário do funcionário:");
        
        // Converte o salário de String para double
        double salarioAntigo = Double.parseDouble(salarioString);
        
        // Calcula o aumento de 15%
        double aumento = salarioAntigo * 0.15;
        
        // Calcula o novo salário com o aumento
        double salarioReajustado = salarioAntigo + aumento;
        
        // Formata o salário antigo e o reajustado com duas casas decimais
        String mensagem = String.format(
            "Salário antigo: R$ %.2f\nSalário reajustado: R$ %.2f", 
            salarioAntigo, 
            salarioReajustado
        );
        
        // Exibe a mensagem com os valores
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
