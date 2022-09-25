package br.edu.utfpr.transferencia;

public class Conta {
    private int numero;
    private double saldo;        

    public Conta(int numero_conta, double saldo) {
        this.numero = numero_conta;
        this.saldo = saldo;
    }
    
    public int getNumero_conta() {
        return numero;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero = numero_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString() {
        return numero + " " + saldo;
    }
}