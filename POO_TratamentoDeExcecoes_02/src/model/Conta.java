package model;

public class Conta {
	
	private int agencia;
	private int codigo;
	private int saldo;
	private float limite;

	public Conta() {
		super();
	}
	
	public void depositar(float valor) {
		saldo = (int)valor + saldo;
	}
	
	public void sacar(float valor) throws ArithmeticException {
		if(valor >((limite + saldo))) {
			throw new ArithmeticException("Valor de saque superior ao saldo somado ao limite.");
		}else {
			saldo = saldo - (int)valor;
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	

}
