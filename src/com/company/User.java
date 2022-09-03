package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class User {

    static void metodoLogin() {
        int id = 1234;
        int senha = 123456;

        while (true) {
            System.out.println("Digite seu usuário: ");
            Scanner scannerId = new Scanner(System.in);
            int idDoUsuario = scannerId.nextInt();
            System.out.println("Digita sua senha: ");
            Scanner scannerSenha = new Scanner(System.in);
            int senhaDeAcesso = scannerSenha.nextInt();

            if (id == idDoUsuario) {
                if (senha == senhaDeAcesso) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("Você Logou com sucesso, bem vindo a LibrarySystem.");
                    System.out.println("--------------------------------------------------");
                    break;
                }
            }
            {
                System.out.println("NÃO ACHAMOS SUA CONTA!");
                System.out.println("TENTE NOVAMENTE!");


            }

        }
    }
}






