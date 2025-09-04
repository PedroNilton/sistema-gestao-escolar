package br.com.escola;

public class SalarioInvalidoException extends Exception {
    public SalarioInvalidoException(String mensagem) {
        super(mensagem);
    }
}
