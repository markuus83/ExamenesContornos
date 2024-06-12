package marcos;

/**
 * Establecemos la clase CuentaBancaria
 */

public class CuentaBancaria {

    /**
     * Atributos de la clase Cuentabancaria: titular y saldo
     */

    private String titular; 
    private double saldo; 

    
    /**
     * Metodo constructor de la clase CuentaBancaria
     * 
     * @param titular de la cuenta bancaria
     * @param saldoInicial de la cuenta bancaria
     */
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    /**
     * Metodo que devuelve el titular de la cuenta bancaria
     * 
     * @return titular de la cuenta bancaria
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Metodo que devuelve el saldo de la cuenta bancaria
     * 
     * @return saldo de la cuenta bancaria
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo que establece la cantidad aceptable a DEPOSITAR en la cuenta bancaria
     * 
     * @param cantidad a depositar en la cuenta bancaria
     * @throws IllegalArgumentException cuando la cantidad a depositar es menor que 0.
     */
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    /**
     * Metodo que establece la cantidad aceptable a RETIRAR de la cuenta bancaria
     * 
     * @param cantidad a retirar de la cuenta bancaria
     * @throws IllegalArgumentException cuando la cantidad a retirar es menor que 0, o cuando dicha cantidad es mayor o igual al saldo total de la cuenta.
     */
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            throw new IllegalArgumentException("No se puede retirar la cantidad especificada.");
        }
    }
}