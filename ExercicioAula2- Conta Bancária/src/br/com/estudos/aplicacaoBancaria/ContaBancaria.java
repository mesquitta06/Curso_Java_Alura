package br.com.estudos.aplicacaoBancaria;

//Crie uma classe com.br.contabancaria.ContaBancaria com os seguintes atributos:
// numeroConta (privado), saldo (privado) e titular (publico).
// Implemente métodos getters e setters para os atributos privados.

public class ContaBancaria {

    //**DECLARAÇÃO DE VARIÁVEIS**//
    private int numeroConta;
    private double saldo;
    public String titular;


    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //metodos para acessar dados;




}
