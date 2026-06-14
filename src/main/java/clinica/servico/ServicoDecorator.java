package clinica.servico;

public abstract class ServicoDecorator implements ServicoVeterinario {

    protected final ServicoVeterinario servico;

    protected ServicoDecorator(ServicoVeterinario servico) {
        this.servico = servico;
    }

    @Override
    public String getDescricao() { return servico.getDescricao(); }

    @Override
    public double getValor() { return servico.getValor(); }
}
