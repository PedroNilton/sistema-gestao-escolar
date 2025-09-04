package br.com.escola;

public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola();

        try {
            Professor p1 = new Professor("João", 23, 12000, "Matemática");
            Aluno a1 = new Aluno("Gustavo", 12, "2323242", 8.5);
            Aluno a2 = new Aluno("Carla", 13, "6565656", 0.0);
            Professor p2 = new Professor("Maria", 31, 11000, "Português");

            escola.adicionarPessoas(p1);
            escola.adicionarPessoas(p2);
            escola.adicionarPessoas(a1);
            escola.adicionarPessoas(a2);
        } catch (SalarioInvalidoException | NotaInvalidaException e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }

        System.out.println("\n--- Todos na escola ---");
        escola.exibirTodasPessoas();

        System.out.println("\n--- Buscar por nome ---");
        escola.buscarPorNome("Maria");

        System.out.println("\n--- Média das notas ---");
        escola.mediaNotasAlunos();

        System.out.println("\n--- Remover por nome ---");
        escola.buscarPorNome("Carla");

        System.out.println("\n--- Atualização da lista ---");
        escola.exibirTodasPessoas();
    }
}