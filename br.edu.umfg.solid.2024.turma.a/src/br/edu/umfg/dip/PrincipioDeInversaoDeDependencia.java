package br.edu.umfg.dip;

import br.edu.umfg.dip.legado.EmailService;
import br.edu.umfg.dip.legado.UsuarioService;
import br.edu.umfg.dip.refatorado.EmailServiceRefatorado;
import br.edu.umfg.dip.refatorado.IEmailService;
import br.edu.umfg.dip.refatorado.UsuarioServiceRefatorado;

public class PrincipioDeInversaoDeDependencia {
    public static void executarLegado() {
        UsuarioService usuarioService = new UsuarioService();
        usuarioService.registrarUsuario("teste1@email.com");
    }

    public static void executarRefatorado() {
        IEmailService emailService = new EmailServiceRefatorado();
        UsuarioServiceRefatorado usuarioServiceRefatorado = new UsuarioServiceRefatorado(emailService);

        usuarioServiceRefatorado.registrarUsuario("teste1@email.com");
    }
}
