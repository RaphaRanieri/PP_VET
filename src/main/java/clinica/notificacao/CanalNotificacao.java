package clinica.notificacao;

public interface CanalNotificacao {
    @param destinatario 
    @param mensagem     
    void enviar(String destinatario, String mensagem);
}
