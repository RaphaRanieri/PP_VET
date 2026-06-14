package clinica.servico;

public class TaxaDomiciliar extends ServicoDecorator {

    private static final double TAXA = 50.00;

    public TaxaDomiciliar(ServicoVeterinario servico) {
        super(servico);
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + " + Taxa Domiciliar (R$ 50,00)";
    }

    @Override
    public double getValor() {
        return servico.getValor() + TAXA;
    }
}
