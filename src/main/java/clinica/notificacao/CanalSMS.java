package clinica.notificacao;
public class CanalSMS implements CanalNotificacao {

    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.printf("[SMS    ] %-20s → %s%n", destinatario, mensagem);
    }
}
