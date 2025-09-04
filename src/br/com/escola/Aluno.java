package br.com.escola;

public class Aluno extends Pessoa {
    private String matricula;
    private double notaFinal;

    public Aluno(String nome, int idade, String matricula, double notaFinal) throws NotaInvalidaException {
        super(nome, idade);
        if (notaFinal < 0 || notaFinal > 10) {
            throw new NotaInvalidaException("Nota final deve estar entre 0 a 10");
        }
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void notaFinal(double notaFinal) throws NotaInvalidaException {
        if (notaFinal < 0 || notaFinal > 10) {
            throw new NotaInvalidaException("Nota final deve estar entre 0 a 10");
        }
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matricula: " + matricula + ", Nota Final: " + notaFinal;
    }
}
