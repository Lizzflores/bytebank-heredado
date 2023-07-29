
public class Gerente extends Funcionario {
	
   private String clave;
   
   public void setClave(String clave) {
	   this.clave=clave;
   }
   
   public boolean iniciarSesion(String clave) {
	   return clave=="AluraCursosOnLine";
   }
   //Sobreescritura de metodo
   public double getBonificacion() {
	   return super.getSalario() +
			   super.getBonificacion();
   }
}
