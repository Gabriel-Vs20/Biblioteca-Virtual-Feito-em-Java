package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    static void service() {
        List<Book> listBook = new ArrayList<>();
        User user = new User();
        user.metodoLogin();
            while (true) {
                System.out.println("Digite quantos livros você deseja adicionar na biblioteca:");
                Scanner scanner = new Scanner(System.in);
                int scannerLivro = scanner.nextInt();

                for (int i = 0; i < scannerLivro; i++) {
                    Book book = new Book();
                    Scanner scannerUsuario = new Scanner(System.in);
                    Scanner scannerUsuarioDois = new Scanner(System.in);
                    System.out.println("Qual o isnb do seu livro: ");
                    book.isbn = scannerUsuarioDois.nextInt();
                    System.out.println("Qual o titúlo do seu livro: ");
                    book.title = scannerUsuario.nextLine();
                    System.out.println("Qual o autor(s) do seu livro, se possuir mais que um, separe por vírgulas. ");
                    book.author = scannerUsuario.nextLine();
                    System.out.println("Qual o ano que seu livro foi lançado: ");
                    book.year = scannerUsuarioDois.nextInt();
                    System.out.println("Qual a editora do seu livro: ");
                    book.publisher = scannerUsuario.nextLine();

                    listBook.add(book);

                }
                for (Book f : listBook) {
                    System.out.println("********************");
                    System.out.println("ISBN: " + f.isbn);
                    System.out.println("Título: " + f.title);
                    System.out.println("Autor(s): " + f.author);
                    System.out.println("Lançamento: " + f.year);
                    System.out.println("Editora: " + f.publisher);
                    System.out.println("********************");
                    System.out.println("\n");
                }


                System.out.println("(1)Deseja editar ou deletar algum dos livros?  (2) Ou deseja salvar e encerrar o sistema.");
                Scanner scannerOpcaoFinal = new Scanner(System.in);
                int opcaoFinal = scannerOpcaoFinal.nextInt();

                if (opcaoFinal == 1) {
                    System.out.println("Você deseja '(1) editar ou (2) deletar', digite o número correspondente: ");
                    int editarouDel = scannerOpcaoFinal.nextInt();
                    if (editarouDel == 1) {
                        System.out.println("Digite o isbn do seu livro: ");
                        int isbn = scannerOpcaoFinal.nextInt();
                        for (int a = 0; a < listBook.size(); a++){
                            if (listBook.get(a).isbn.equals(isbn)){
                                System.out.println("Agora digite o nome do atribruto que você deseja mudar: (1)Título - (2)Autor - (3)Lançamento - (4)Editora ");
                                Scanner scannerAtributo = new Scanner(System.in);
                                int nomeMudado = scannerAtributo.nextInt();
                                Scanner scannerAltrado = new Scanner(System.in);
                                Scanner scannerInteiro = new Scanner(System.in);
                                if (nomeMudado == 1) {
                                    System.out.println("Digite o novo titulo do livro: ");
                                    String tituloNovo = scannerAltrado.nextLine();
                                    listBook.get(a).title = tituloNovo;
                                }
                                if (nomeMudado == 2) {
                                    System.out.println("Digite o nome do autor que você deseja alterar: ");
                                    String autorNovo = scannerAltrado.nextLine();
                                    listBook.get(a).author = autorNovo;
                                }
                                if (nomeMudado == 3) {
                                    System.out.println("Digite o ano de lançamento que você deseja alterar: ");
                                    int anoDeLan = scannerInteiro.nextInt();
                                    listBook.get(a).year = anoDeLan;
                                }
                                if (nomeMudado == 4) {
                                    System.out.println("Digite o novo nome da editora: ");
                                    String editoraNova = scannerAltrado.nextLine();
                                    listBook.get(a).publisher = editoraNova;
                                }
                            }
                        }
                    }
                    else{
                        System.out.println("Digite o isbn do seu livro para deletar: ");
                        int isbn = scannerOpcaoFinal.nextInt();
                        for (int a = 0; a < listBook.size(); a++) {
                            if (listBook.get(a).isbn.equals(isbn)) {
                                listBook.remove(a);
                            }
                        }
                    }
                }
                System.out.println("***************************");
                System.out.printf("Sua biblioteca esta Salva e Atualizada!\n");
                System.out.println("****************************");
                System.out.println("\n");
                    for (Book c : listBook) {
                        System.out.println("ISBN: " + c.isbn);
                        System.out.println("Título: " + c.title);
                        System.out.println("Autor(s): " + c.author);
                        System.out.println("Lançamento: " + c.year);
                        System.out.println("Editora: " + c.publisher);
                        System.out.println("\n");
                }
                System.out.println("(1) Encerrar o sistema. (2) Você deseja continuar adicionando mais livros?");
                    Scanner scannerFinal= new Scanner(System.in);
                    int encerrarPrograma = scannerFinal.nextInt();

                    if (encerrarPrograma == 2){
                        continue;
                    }else{
                        System.out.println("Sistema Encerrado!");
                        break;
                    }
            }
        }
    }
