class Cuenta{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    //No retorna valor
    private static int total = 0; // la palabra static indica
    //que la variable no sera alterada 
    //por la instancia si no por la cuenta
   
    public Cuenta(int agencia, int numero) {
    	this.agencia=agencia;
    	this.numero=numero;
    	System.out.println("");
    	
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
    public void depositar(
        double valor
    ){
        this.saldo+=valor;
    }
    //Retorna valor
    public boolean retirar(
        double valor
    ){
        if(this.saldo>=valor){
            this.saldo-=valor;
            return true;
         }
        return false;
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
