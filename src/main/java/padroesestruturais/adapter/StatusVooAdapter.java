package padroesestruturais.adapter;

public class StatusVooAdapter extends StatusVooCodigo {

    private IStatusVoo statusVooTexto;

    public StatusVooAdapter(IStatusVoo statusVooTexto) {
        this.statusVooTexto = statusVooTexto;
    }

    public String recuperarStatus() {
        if (this.getCodigo() == 1)
            statusVooTexto.setStatus("No Horário");
        else
            if (this.getCodigo() == 2)
                statusVooTexto.setStatus("Atrasado");
            else
                if (this.getCodigo() == 3)
                    statusVooTexto.setStatus("Cancelado");
                else
                    if (this.getCodigo() == 4)
                        statusVooTexto.setStatus("Embarcando");
                    else
                        statusVooTexto.setStatus("Desconhecido");
        return statusVooTexto.getStatus();
    }

    public void salvarStatus() {
        if (statusVooTexto.getStatus().equals("No Horário"))
            this.setCodigo(1);
        else
            if (statusVooTexto.getStatus().equals("Atrasado"))
                this.setCodigo(2);
            else
                if (statusVooTexto.getStatus().equals("Cancelado"))
                    this.setCodigo(3);
                else
                    if (statusVooTexto.getStatus().equals("Embarcando"))
                        this.setCodigo(4);
                    else
                        this.setCodigo(0);
    }
}
