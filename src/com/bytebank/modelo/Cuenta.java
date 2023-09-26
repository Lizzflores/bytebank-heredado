package com.bytebank.modelo;
public abstract class Cuenta implements Comparable<Cuenta>{
	//public: accesible desde cualquier parte
	//default : accesible dentro del paquete
	// rotected default + clase mimsa
	//private : solo desde la clase misma
	
	
    protected double saldo;
    private int agencia=1;
    private int numero;
    private Cliente titular = new Cliente();
    //No retorna valor
    private static int total; // la palabra static indica
    //que la variable no sera alterada 
    //por la instancia si no por la cuenta
    
    /**
     * Clase que Representa a una cuenta en ByteBank
     * 
     * @auto Lizzflores
     * @version 0.1
     */
   public Cuenta() {
	   
   }
   /**
   * Constructor para inicializar el objeto Cuenta a partir da agencia y numero
   * @param agencia
   * @param numero
   */

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
    ) throws SaldoInsuficienteException{
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
            try {
				this.retirar(valor);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
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
    
    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Titular: " + this.titular.getNombre();
    }
    
    //public boolean esIgual(Cuenta cuenta) {
    //	return this.agencia == cuenta.getAgencia()&&
    //			this.numero == cuenta.getNumero();
    //}
    
    @Override
    public boolean equals (Object obj) {
    	//basada en valores, no en referencias
    	Cuenta cuenta = (Cuenta) obj;
    	return this.agencia == cuenta.getAgencia()&&
    			this.numero == cuenta.getNumero();
    }
    
    @Override
    public int compareTo(Cuenta o) {
    	//orden natural: numero de agencia
    	//return Integer.compare(this.agencia, o.getAgencia());
    	//orden natural:saldo
    	return Double.compare(this.getSaldo(), o.getSaldo());
    }
}
