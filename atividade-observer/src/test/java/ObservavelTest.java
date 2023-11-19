import static org.junit.Assert.*;
import org.junit.Test;

public class ObservavelTest {

    @Test
    public void testGetTotalPalavras() {
        Observavel observavel = new Observavel();
        observavel.processarFrase("Isso é um teste de palavras");
        assertEquals(6, observavel.getTotalPalavras());
    }

    @Test
    public void testGetPalavrasPar() {
        Observavel observavel = new Observavel();
        observavel.processarFrase("Palavras com tamanho par são legais");
        assertEquals(2, observavel.getPalavrasPar());
    }

    @Test
    public void testGetPalavrasMaiusculas() {
        Observavel observavel = new Observavel();
        observavel.processarFrase("AlGumas palavras COM maiúsculas");
        assertEquals(2, observavel.getPalavrasMaiusculas());
    }

    @Test
    public void testNotificarObservadores() {
        Observavel observavel = new Observavel();

        boolean[] notificado = {false};
        observavel.adicionarObservador((Observavel o) -> notificado[0] = true);

        observavel.processarFrase("Teste de notificação");
        
        assertTrue(notificado[0]);
    }
}