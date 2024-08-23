package br.edu.umfg.dip.legado;

public class UsuarioService {
    //Classe de alto nível
    private final String EMAIL_PADRAO = "minha.empresa@gmail.com";
    private EmailService emailService; //dependencia direta

    /*
    * A class de alto nível UsuarioService depende diretamente da classe de baixo nível EmailService
    * Isso cria um acoplamente rígido e dificulta a substituição de EmailService por outra implementação
    * */
    public UsuarioService() {
        this.emailService = new EmailService(); //alto acoplamento
    }

    public void registrarUsuario(String email) {
        String mensagem = "Bem-Vindo! Você foi registrado.";
        this.emailService.enviarEmail(EMAIL_PADRAO, email, mensagem);
    }
}
