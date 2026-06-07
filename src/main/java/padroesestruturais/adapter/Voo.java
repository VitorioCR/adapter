package padroesestruturais.adapter;

public class Voo {

    IStatusVoo statusVoo;
    StatusVooAdapter persistencia;

    public Voo() {
        statusVoo = new StatusVooTexto();
        persistencia = new StatusVooAdapter(statusVoo);
    }

    public void setStatus(String status) {
        statusVoo.setStatus(status);
        persistencia.salvarStatus();
    }

    public String getStatus() {
        return persistencia.recuperarStatus();
    }

    // Método apenas para mostrar que está convertendo texto para código através do adaptador
    public int getCodigo() {
        return persistencia.getCodigo();
    }
}
