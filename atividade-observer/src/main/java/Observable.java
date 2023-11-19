public interface Observable {

    void adicionarObservador(Observer observador);

    void removerObservador(Observer observador);

    void notificarObservadores();
}
