import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
       // leituradenotas();
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua nota");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }


        System.out.println("media de avaliacao " + mediaAvaliacao / 3);
    }
public static void leituradenotas(){
            Scanner leitura1 = new Scanner(System.in);

            System.out.println("Digit3e seu filme");
            String filme  = leitura1.nextLine();

            System.out.println("qual ano de lancamento");
            int anoDeLancamento  = leitura1.nextInt();
            System.out.println("avaliacao");
            double avaliacao = leitura1.nextDouble();

            System.out.println(filme);
            System.out.println(anoDeLancamento);
            System.out.println(avaliacao);
    }
}
