
public class Gerente extends Funcionario implements Autenticable {
	
 
   //Sobreescritura de metodo
	   @Override
	   public double getBonificacion() {
		   System.out.println("EJECUTANDO DESDE GERENTE");
		   return 2000;
	   }

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
