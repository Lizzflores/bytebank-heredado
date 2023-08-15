public abstract class Cuenta{
	
    protected double saldo;
    private int agencia=1;
    private int numero;
    private Cliente titular = new Cliente();
    //No retorna valor
    private static int total; // la palabra static indica
    //que la variable no sera alterada 
    //por la instancia si no por la cuenta
   public Cuenta() {
	   
   }
    public Cuenta(int agencia, int numero) {
    	this.agencia=agencia;
    	this.numero=numero;
    	System.out.println("Estoy creando una cuenta "+this.numero);
    	
    	Cuenta.total ++;
    }
    public Cuenta(int agencia){

        if (agencia<=0){
            System.out.println("No se permite 0");
            this.agencia=1;
        } else {
            this.agencia=agencia;
        }
        total++;
        System.out.println("Se van creando: "+ total+" cuentas.");
    }
    public abstract void depositar(double valor);
    
    //Retorna valor
    public void retirar(
        double valor
    ){
    	if(this.saldo<valor) {
    		//buena practica primero validar excepciones
    	throw new SaldoInsuficienteException("No tienes saldo");
    	}	
    	this.saldo-=valor;
    	
    }

    public boolean transferir(
        double valor,
        Cuenta cuenta
    ){
        if(this.saldo>=valor){
            this.retirar(valor);
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia(){
        return agencia;
    }
    
    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }


    public void setTitular(Cliente titular){
        this.titular=titular;
    }

    public Cliente getTitular(){
        return titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
}
