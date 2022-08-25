public class Veiculo {
    protected String marca;
    protected String motor;

    public Veiculo(String marca, String motor) {        
        this.marca = marca;
        this.motor = motor;        
    }
    
    public String getMarca() {
        return marca;
    }

    public String getMotor() {
        return motor;
    }
    
    public String imprimir() {  // M�todo imprimir() acrescentado
        return "Marca: " + getMarca() + ", Motor: " + getMotor(); 		    
    }
}