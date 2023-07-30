
public class Gerente extends FuncionarioAutenticable {
	
 
   //Sobreescritura de metodo
   public double getBonificacion() {
	   System.out.println("EJECUTANDO DESDE GERENTE");
	   return 2000;
   }
}
