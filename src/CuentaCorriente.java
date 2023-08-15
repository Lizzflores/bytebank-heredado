
public class CuentaCorriente extends Cuenta {
 
	public CuentaCorriente(int agencia, int numero) {
		super(agencia,numero);
	}
	@Override
	public void retirar(double valor) {
		double comision=0.2;
		super.retirar(valor+comision);
	}
	@Override
	public void depositar(double valor) {
		this.saldo+=valor;
		
	}  
} 
