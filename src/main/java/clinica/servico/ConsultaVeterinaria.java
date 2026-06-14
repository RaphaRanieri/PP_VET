package clinica.servico;
public class ConsultaVeterinaria implements ServicoVeterinario {

    private final double valorBase;

    public ConsultaVeterinaria(double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public String getDescricao() { return "Consulta Veterinária"; }

    @Override
    public double getValor() { return valorBase; }
}
