package br.com.escola;

public class Professor extends Pessoa {
    private double salario;
    private String disciplina;

    public Professor(String nome, int idade, double salario, String disciplina) throws SalarioInvalidoException {
        super(nome, idade);
        if (salario > 15000) {
            throw new SalarioInvalidoException("Salário excede o limite de R$15.000,00");
        }
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws SalarioInvalidoException {
        if (salario > 15000) {
            throw new SalarioInvalidoException("Salário excede o limite de R$15.000,00");
        }
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return super.toString() + ", br.com.escola.Professor de: " + disciplina + ", Salário: R$ " + salario;
    }
}
