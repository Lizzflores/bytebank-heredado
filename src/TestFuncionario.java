
public class TestFuncionario {
 
	public static void main(String[] args) {
		Funcionario diego = new Funcionario();
		diego.setDocumento("Diego");
		diego.setDocumento("123123");
		diego.setSalario(2000);
		
		 System.out.println(diego.getSalario());
	}
}
