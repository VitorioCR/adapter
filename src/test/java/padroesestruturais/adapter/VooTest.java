package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VooTest {

    @Test
    public void testStatusNoHorario() {
        Voo voo = new Voo();
        voo.setStatus("No Horário");
        assertEquals("No Horário", voo.getStatus());
        assertEquals(1, voo.getCodigo());
    }

    @Test
    public void testStatusAtrasado() {
        Voo voo = new Voo();
        voo.setStatus("Atrasado");
        assertEquals("Atrasado", voo.getStatus());
        assertEquals(2, voo.getCodigo());
    }

    @Test
    public void testStatusCancelado() {
        Voo voo = new Voo();
        voo.setStatus("Cancelado");
        assertEquals("Cancelado", voo.getStatus());
        assertEquals(3, voo.getCodigo());
    }

    @Test
    public void testStatusEmbarcando() {
        Voo voo = new Voo();
        voo.setStatus("Embarcando");
        assertEquals("Embarcando", voo.getStatus());
        assertEquals(4, voo.getCodigo());
    }

    @Test
    public void testStatusDesconhecido() {
        Voo voo = new Voo();
        voo.setStatus("Outro");
        assertEquals(0, voo.getCodigo());
        assertEquals("Desconhecido", voo.getStatus());
    }

    @Test
    public void testAlteracaoDeStatus() {
        Voo voo = new Voo();
        voo.setStatus("No Horário");
        assertEquals(1, voo.getCodigo());

        voo.setStatus("Atrasado");
        assertEquals(2, voo.getCodigo());
        assertEquals("Atrasado", voo.getStatus());
    }
}
