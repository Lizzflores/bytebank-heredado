
public class ControlBonificacion {	
	private double suma;
	
	public double registrarSalario(Funcionario funcionario) {
		this.suma= funcionario.getBonificacion() + this.suma;
		return this.suma;
	}
}
