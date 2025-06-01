import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digit3e seu filme");
        String filme  = leitura.nextLine();

        System.out.println("qual ano de lancamento");
        int anoDeLancamento  = leitura.nextInt();
        System.out.println("avaliacao");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);


    }
}
