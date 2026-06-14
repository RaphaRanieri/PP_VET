package clinica.servico;
public class DescontoAdotado extends ServicoDecorator {

    private static final double PERCENTUAL = 0.10;

    public DescontoAdotado(ServicoVeterinario servico) {
        super(servico);
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + " + Desconto Animal Adotado (10%)";
    }

    @Override
    public double getValor() {
        return servico.getValor() * (1 - PERCENTUAL);
    }
}
