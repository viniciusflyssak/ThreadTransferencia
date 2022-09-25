package br.edu.utfpr.transferencia;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Transferencia implements Runnable{
    private double valor;
    private Conta conta_origem;
    private Conta conta_destino;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Transferencia(double valor, Conta conta_origem, Conta conta_destino) {
        this.valor = valor;
        this.conta_origem = conta_origem;
        this.conta_destino = conta_destino;
    }
    
    public void transferir(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            System.err.println("Erro: " + ex.getMessage());
        }
        synchronized(conta_origem){
            if (conta_origem.getSaldo() >= valor){
                conta_origem.setSaldo(conta_origem.getSaldo() - valor);
                conta_destino.setSaldo(conta_destino.getSaldo() + valor);
                System.out.println(Thread.currentThread().getName() + " transferiu " + valor + " da conta " + conta_origem + " para " + conta_destino);
            }else{
                System.out.println(Thread.currentThread().getName() + " tentou transferir " + valor + " da conta " + conta_origem + " para " + conta_destino);
            }      
        }
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++){
            transferir();
        }
    }
    
    
}
