public class PalavrasApp {

    public static void main(String[] args) {

        Observavel observavel = new Observavel();

        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        observavel.adicionarObservador(obs1);
        observavel.adicionarObservador(obs2);
        observavel.adicionarObservador(obs3);

        observavel.processarFrase("Eu gosto muito dessa aula");
        observavel.processarFrase("Palavras com quantidade par de caracteres");
        observavel.processarFrase("Contar palavras começadas com maiúsculas");

        observavel.removerObservador(obs3);

        observavel.processarFrase("Nova frase para teste");
        observavel.processarFrase("Observadores funcionando");

        System.out.println("\nNotificando todos os observadores:");
        observavel.notificarObservadores();
    }
}
