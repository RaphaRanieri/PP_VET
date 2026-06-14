package clinica.notificacao;

public class CanalConsole implements CanalNotificacao {

    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.printf("[CONSOLE] %-20s → %s%n", destinatario, mensagem);
    }
}
