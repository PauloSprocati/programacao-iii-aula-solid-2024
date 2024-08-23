package br.edu.umfg.dip.refatorado;
public class UsuarioServiceRefatorado {

    private final String EMAIL_PADRAO = "minha.empresa@gmail.com";

    private IEmailService emailService;

    public UsuarioServiceRefatorado(IEmailService emailService) {
        this.emailService = emailService;
    }

    public void registrarUsuario(String email) {
        String mensagem = "Bem-Vindo! Você foi registrado.";
        this.emailService.enviarEmail(EMAIL_PADRAO, email, mensagem);
    }
}
