public class PalavrasApp {

    public static void main(String[] args) {

        // Criando o observável
        Observavel observavel = new Observavel();

        // Criando observadores
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        // Registrando os observadores
        observavel.adicionarObservador(obs1);
        observavel.adicionarObservador(obs2);
        observavel.adicionarObservador(obs3);

        // Processando frases
        observavel.processarFrase("Eu gosto muito dessa aula");
        observavel.processarFrase("Palavras com quantidade par de caracteres");
        observavel.processarFrase("Contar palavras começadas com maiúsculas");

        // Removendo um observador
        observavel.removerObservador(obs3);

        // Processando mais frases
        observavel.processarFrase("Nova frase para teste");
        observavel.processarFrase("Observadores funcionando");

        // Notificando todos os observadores
        System.out.println("\nNotificando todos os observadores:");
        observavel.notificarObservadores();
    }
}
