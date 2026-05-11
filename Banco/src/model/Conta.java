package model;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	private double limite;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double Limite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void Worker() {
		System.out.println("=== Conta ===");
		System.out.println("O numero da conta: " + numero);
		System.out.println("O titular da conta: " + titular);
		System.out.println("O saldo está: " + saldo);
		System.out.println("O limite está " + limite);
	}
}
