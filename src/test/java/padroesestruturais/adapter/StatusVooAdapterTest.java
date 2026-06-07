package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatusVooAdapterTest {

    @Test
    public void testSalvarStatusNoHorario() {
        IStatusVoo statusTexto = new StatusVooTexto();
        StatusVooAdapter adapter = new StatusVooAdapter(statusTexto);

        statusTexto.setStatus("No Horário");
        adapter.salvarStatus();

        assertEquals(1, adapter.getCodigo());
    }

    @Test
    public void testSalvarStatusAtrasado() {
        IStatusVoo statusTexto = new StatusVooTexto();
        StatusVooAdapter adapter = new StatusVooAdapter(statusTexto);

        statusTexto.setStatus("Atrasado");
        adapter.salvarStatus();

        assertEquals(2, adapter.getCodigo());
    }

    @Test
    public void testSalvarStatusCancelado() {
        IStatusVoo statusTexto = new StatusVooTexto();
        StatusVooAdapter adapter = new StatusVooAdapter(statusTexto);

        statusTexto.setStatus("Cancelado");
        adapter.salvarStatus();

        assertEquals(3, adapter.getCodigo());
    }

    @Test
    public void testSalvarStatusEmbarcando() {
        IStatusVoo statusTexto = new StatusVooTexto();
        StatusVooAdapter adapter = new StatusVooAdapter(statusTexto);

        statusTexto.setStatus("Embarcando");
        adapter.salvarStatus();

        assertEquals(4, adapter.getCodigo());
    }

    @Test
    public void testRecuperarStatusCodigo1() {
        IStatusVoo statusTexto = new StatusVooTexto();
        StatusVooAdapter adapter = new StatusVooAdapter(statusTexto);

        adapter.setCodigo(1);
        assertEquals("No Horário", adapter.recuperarStatus());
    }

    @Test
    public void testRecuperarStatusCodigo2() {
        IStatusVoo statusTexto = new StatusVooTexto();
        StatusVooAdapter adapter = new StatusVooAdapter(statusTexto);

        adapter.setCodigo(2);
        assertEquals("Atrasado", adapter.recuperarStatus());
    }

    @Test
    public void testRecuperarStatusCodigo3() {
        IStatusVoo statusTexto = new StatusVooTexto();
        StatusVooAdapter adapter = new StatusVooAdapter(statusTexto);

        adapter.setCodigo(3);
        assertEquals("Cancelado", adapter.recuperarStatus());
    }

    @Test
    public void testRecuperarStatusCodigo4() {
        IStatusVoo statusTexto = new StatusVooTexto();
        StatusVooAdapter adapter = new StatusVooAdapter(statusTexto);

        adapter.setCodigo(4);
        assertEquals("Embarcando", adapter.recuperarStatus());
    }

    @Test
    public void testRecuperarStatusCodigoInvalido() {
        IStatusVoo statusTexto = new StatusVooTexto();
        StatusVooAdapter adapter = new StatusVooAdapter(statusTexto);

        adapter.setCodigo(99);
        assertEquals("Desconhecido", adapter.recuperarStatus());
    }

    @Test
    public void testSalvarStatusInvalido() {
        IStatusVoo statusTexto = new StatusVooTexto();
        StatusVooAdapter adapter = new StatusVooAdapter(statusTexto);

        statusTexto.setStatus("Invalido");
        adapter.salvarStatus();

        assertEquals(0, adapter.getCodigo());
    }
}
