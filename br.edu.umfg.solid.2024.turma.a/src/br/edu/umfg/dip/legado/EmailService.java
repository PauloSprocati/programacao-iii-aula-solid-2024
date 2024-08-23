package br.edu.umfg.dip.legado;

public class EmailService {
    //Classe de baixo nível
    public void enviarEmail(String remetente, String destinatario, String mensagem) {
        System.out.println("De: " + remetente + "\n" + "Para: " + destinatario + "\n" + "Mensagem:" + mensagem);
    }
}
