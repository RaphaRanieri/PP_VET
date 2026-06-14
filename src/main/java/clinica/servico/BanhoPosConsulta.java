package clinica.servico;
public class BanhoPosConsulta extends ServicoDecorator {

    private static final double VALOR_BANHO = 30.00;

    public BanhoPosConsulta(ServicoVeterinario servico) {
        super(servico);
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + " + Banho Pós-Consulta (R$ 30,00)";
    }

    @Override
    public double getValor() {
        return servico.getValor() + VALOR_BANHO;
    }
}
