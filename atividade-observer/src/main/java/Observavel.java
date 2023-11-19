import java.util.ArrayList;
import java.util.List;

public class Observavel implements Observable {

    private List<Observer> observadores;
    private List<String> palavras;

    public Observavel() {
        this.observadores = new ArrayList<>();
        this.palavras = new ArrayList<>();
    }

    @Override
    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.update(this);
        }
    }

    public void processarFrase(String frase) {
        // Divide a frase em palavras
        String[] palavraArray = frase.split("\\s+");

        // Adiciona palavras à lista
        for (String palavra : palavraArray) {
            palavras.add(palavra);
        }

        // Notifica os observadores
        notificarObservadores();
    }

    public int getTotalPalavras() {
        return palavras.size();
    }

    public int getPalavrasPar() {
        return (int) palavras.stream().filter(palavra -> palavra.length() % 2 == 0).count();
    }

    public int getPalavrasMaiusculas() {
        return (int) palavras.stream().filter(palavra -> Character.isUpperCase(palavra.charAt(0))).count();
    }
}
