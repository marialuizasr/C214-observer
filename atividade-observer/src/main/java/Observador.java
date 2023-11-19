public class Observador implements Observer {

    private int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel observavel) {
        System.out.println("Observador " + id + " - Resultados:");
        System.out.println("Total de palavras: " + observavel.getTotalPalavras());
        System.out.println("Palavras com quantidade par de caracteres: " + observavel.getPalavrasPar());
        System.out.println("Palavras começadas com maiúsculas: " + observavel.getPalavrasMaiusculas());
        System.out.println();
    }
}
