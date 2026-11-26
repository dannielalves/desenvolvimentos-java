package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Livro {

    private int id;
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        emprestado = true;
    }

    public void devolver() {
        emprestado = false;
    }

    public void exibirDados() {
        System.out.println("------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Status: " +
            (emprestado ? "Emprestado" : "Disponível"));
    }
}

class Biblioteca {

    private List<Livro> livros = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrarLivro(String titulo, String autor) {

        Livro livro = new Livro(proximoId++, titulo, autor);

        livros.add(livro);

        System.out.println("\nLivro cadastrado com sucesso!");
    }

    public void listarLivros() {

        if (livros.isEmpty()) {
            System.out.println("\nNenhum livro cadastrado.");
            return;
        }

        for (Livro livro : livros) {
            livro.exibirDados();
        }
    }

    public void pesquisarLivro(String titulo) {

        boolean encontrado = false;

        for (Livro livro : livros) {

            if (livro.getTitulo().toLowerCase()
                    .contains(titulo.toLowerCase())) {

                livro.exibirDados();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("\nLivro não encontrado.");
        }
    }

    public void emprestarLivro(int id) {

        Livro livro = buscarPorId(id);

        if (livro == null) {
            System.out.println("\nLivro não encontrado.");
            return;
        }

        if (livro.isEmprestado()) {
            System.out.println("\nEste livro já está emprestado.");
            return;
        }

        livro.emprestar();

        System.out.println("\nEmpréstimo realizado com sucesso!");
    }

    public void devolverLivro(int id) {

        Livro livro = buscarPorId(id);

        if (livro == null) {
            System.out.println("\nLivro não encontrado.");
            return;
        }

        if (!livro.isEmprestado()) {
            System.out.println("\nEste livro já está disponível.");
            return;
        }

        livro.devolver();

        System.out.println("\nDevolução realizada com sucesso!");
    }

    public void excluirLivro(int id) {

        Livro livro = buscarPorId(id);

        if (livro == null) {
            System.out.println("\nLivro não encontrado.");
            return;
        }

        if (livro.isEmprestado()) {
            System.out.println(
                "\nNão é possível excluir um livro emprestado."
            );
            return;
        }

        livros.remove(livro);

        System.out.println("\nLivro removido com sucesso!");
    }

    private Livro buscarPorId(int id) {

        for (Livro livro : livros) {

            if (livro.getId() == id) {
                return livro;
            }
        }

        return null;
    }

    public void exibirEstatisticas() {

        int disponiveis = 0;
        int emprestados = 0;

        for (Livro livro : livros) {

            if (livro.isEmprestado()) {
                emprestados++;
            } else {
                disponiveis++;
            }
        }

        System.out.println("\n===== ESTATÍSTICAS =====");
        System.out.println("Total de livros: " + livros.size());
        System.out.println("Disponíveis: " + disponiveis);
        System.out.println("Emprestados: " + emprestados);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        int opcao = -1;

        do {

            System.out.println("\n================================");
            System.out.println("       SISTEMA DE BIBLIOTECA");
            System.out.println("================================");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Pesquisar livro");
            System.out.println("4 - Emprestar livro");
            System.out.println("5 - Devolver livro");
            System.out.println("6 - Excluir livro");
            System.out.println("7 - Estatísticas");
            System.out.println("0 - Sair");
            System.out.println("================================");

            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {

                    case 1:

                        System.out.print("Título: ");
                        String titulo = scanner.nextLine().trim();

                        System.out.print("Autor: ");
                        String autor = scanner.nextLine().trim();

                        if (titulo.isEmpty() || autor.isEmpty()) {
                            System.out.println(
                                "Título e autor são obrigatórios."
                            );
                            break;
                        }

                        biblioteca.cadastrarLivro(titulo, autor);
                        break;

                    case 2:

                        biblioteca.listarLivros();
                        break;

                    case 3:

                        System.out.print("Digite o título: ");
                        String pesquisa = scanner.nextLine();

                        biblioteca.pesquisarLivro(pesquisa);
                        break;

                    case 4:

                        System.out.print("ID do livro: ");
                        int idEmprestimo =
                            Integer.parseInt(scanner.nextLine());

                        biblioteca.emprestarLivro(idEmprestimo);
                        break;

                    case 5:

                        System.out.print("ID do livro: ");
                        int idDevolucao =
                            Integer.parseInt(scanner.nextLine());

                        biblioteca.devolverLivro(idDevolucao);
                        break;

                    case 6:

                        System.out.print("ID do livro: ");
                        int idExclusao =
                            Integer.parseInt(scanner.nextLine());

                        biblioteca.excluirLivro(idExclusao);
                        break;

                    case 7:

                        biblioteca.exibirEstatisticas();
                        break;

                    case 0:

                        System.out.println("\nEncerrando sistema...");
                        break;

                    default:

                        System.out.println("\nOpção inválida!");
                }

            } catch (NumberFormatException e) {

                System.out.println(
                    "\nErro: digite um número válido."
                );

            }

        } while (opcao != 0);

        scanner.close();
    }
}
