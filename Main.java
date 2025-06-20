import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número.

        /*
        var scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        var numero2 = scanner.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.printf("%s x %s = %s\n", numero2, i, (i * numero2));
        }
        */

        // Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC (IMC = peso/(altura*altura)) e seja exibida a mensagem de acordo com o resultado:
            // Se for menor ou igual a 18,5: "abaixo do peso".
            // Se for entre 18,6 e 24,9: "peso ideal".
            // Se for entre 25,0 e 29,9: "Levemente acima do peso".
            // Se for entre 30,0 e 39,9: "obesidade grau I".
            // Se for entre 35,5 e 39,9: "Obesidade grau II (severa)".
            // Se for maior que 40,0: "obesidade III (mórbida)".
        
        /*
        var scanner = new Scanner(System.in);
        System.out.println("Digite a sua altura: ");
        var altura = scanner.nextFloat();
        System.out.println("Digite o seu peso: ");
        var peso = scanner.nextFloat();
        var imc = (peso / (altura * altura));
        System.out.printf("O seu IMC é: %.2f ", imc);

        if (imc <= 18.5){
            System.out.println("Você está abaixo do peso.");
        } else if ((imc >= 18.6) && (imc <= 24.9)){
            System.out.println("Você está no peso ideal.");
        } else if ((imc >= 25) && (imc <= 29.9)){
            System.out.println("Levemente acima do peso.");
        } else if ((imc >= 30) && (imc <= 39.9)){
            System.out.println("Obesidade grau I");
        } else if ((imc >= 35.5) && (imc <= 39.9)){
            System.out.println("Obesidade grau II (severa)");
        } else if (imc >= 40){
            System.out.println("Obesidade grau III (mórbida)");
        }
        */

        // Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados em ordem decrescente.

        /*
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        var numero1 = scanner.nextInt();
        System.out.println("Digite outro número (precisa ser maior que o primeiro): ");
        var numero2 = scanner.nextInt();

        if (numero2 <= numero1){
            System.out.println("Erro: o segundo número deve ser maior que o primeiro.");
            return;
        }

        System.out.println("Ímpar ou par? (i/p)");
        var escolha = scanner.next();

        System.out.printf("\nNúmeros %s no intervalo de %s a %s:\n", escolha, numero2, numero1);
        for (int i = numero2; i >= numero1; i--) {
            if (escolha.equalsIgnoreCase("p") && i % 2 == 0){
                System.out.println(i);
            } else if (escolha.equalsIgnoreCase("i") && i % 2 != 0){
                System.out.println(i);
            }
        }
        */

        // Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados.

        var scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = scanner.nextInt();

        while (true) {
            System.out.print("Digite outro número: ");
            int numero2 = scanner.nextInt();

            if (numero2 < numero1) {
                System.out.println("Número ignorado. Digite um número maior.");
                continue;
            }
            if (numero2 % numero1 != 0) {
                System.out.println("Número não divisível pelo número inicial. Encerrando.");
                break;
            }
        }
        scanner.close();
    }
}
