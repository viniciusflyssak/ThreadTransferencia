package br.edu.utfpr.transferencia;

public class Main {
    
    public static void main(String[] args) {
        Conta conta_origem = new Conta(1212121, 5000);
        Conta conta_destino = new Conta (323232, 2000);
       
        Transferencia transf1 = new Transferencia(100, conta_origem, conta_destino);
        Transferencia transf2 = new Transferencia(10, conta_origem, conta_destino);
        
        Thread th1 = new Thread(transf1, "Th1");
        Thread th2 = new Thread(transf2, "Th2");
        th1.start();
        th2.start();
    }
    
}
