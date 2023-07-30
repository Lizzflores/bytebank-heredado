
public class Gerente extends Funcionario implements Autenticable {
	
	public AutenticacionUtil util;
   //Sobreescritura de metodo
	public Gerente() {
		this.util=new AutenticacionUtil();
	}
	   @Override
	   public double getBonificacion() {
		   System.out.println("EJECUTANDO DESDE GERENTE");
		   return 2000;
	   }

	   @Override
		public void setClave(String clave) {
			this.util.setClave(clave);
			
		}

		@Override
		public boolean iniciarSesion(String clave) {
			
			return this.util.iniciarSesion(clave);
		}
}
