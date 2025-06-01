public class Condicional {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("O filme To0p gun ");

        int ano = 2020;
        boolean incluirPlano = false;

        String tipoPlano = "pobre";
        System.out.println("Ano de lancamento" + ano);

        if (ano >= 2021){
            System.out.println("lançamento bacana");
        } else {
            System.out.println("filme velho");
        }
        if (incluirPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("pague o filme");
        }
}
}
