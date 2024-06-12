package marcos;

/**
 * Establecemos la clase App
 *
 */
public class App {

    /**
     * Metodo main que sirve para validar el proyecto Maven
     * 
     * @param args
     */
    public static void main( String[] args ){

        CuentaBancaria cuentaBancaria = new CuentaBancaria("marcos", 0);

        cuentaBancaria.depositar(100);

        System.out.println("El saldo total de la nueva cuenta bancaria es: " + cuentaBancaria);

    }
}
