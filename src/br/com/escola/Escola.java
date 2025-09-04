package br.com.escola;

import java.util.ArrayList;
import java.util.List;

    public class Escola {
        private List<Pessoa> pessoas;

        public Escola() {
            pessoas = new ArrayList<>();
        }

        public void adicionarPessoas(Pessoa pessoa) {
            pessoas.add(pessoa);
        }

        public void exibirTodasPessoas() {
            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa);
            }
        }

        public void buscarPorNome(String nome) {
            for (Pessoa pessoa : pessoas) {
                if (pessoa.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(pessoa);
                    return;
                }
            }

            System.out.println("br.com.escola.Pessoa não encontrada");
        }

        public void removerPorNome(String nome) {
            for (Pessoa pessoa : pessoas) {
                if (pessoa.getNome().equals(nome)) {
                    pessoas.remove(pessoa);
                    System.out.println("br.com.escola.Pessoa removida com sucesso");
                    return;
                }
            }

            System.out.println("br.com.escola.Pessoa não encontrada para remoção");
        }


        public void mediaNotasAlunos() {
            double soma = 0;
            int count = 0;
            for (Pessoa pessoa : pessoas) {
                if (pessoa instanceof Aluno) {
                    soma += ((Aluno) pessoa).getNotaFinal();
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Nenhum aluno cadastrado");
            } else {
                System.out.println("Média das notas dos alunos: " + (soma / count));
            }
        }
    }

