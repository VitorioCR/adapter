package padroesestruturais.adapter;

public class StatusVooTexto implements IStatusVoo {

    private String status;

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
}
