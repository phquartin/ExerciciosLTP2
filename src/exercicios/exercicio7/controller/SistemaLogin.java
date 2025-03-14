package exercicios.exercicio7.controller;

import static exercicios.Main.sc;

public class SistemaLogin {
    private final String usuarioCorreto = "admin";
    private final String senhaCorreta = "1234";

    public void login() {
        System.out.print("Digite o usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if(usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)){
            System.out.println("Acesso concedido");
            return;
        }
        System.out.println("Acesso negado!");

    }

}
