package Javadoc;
/**
 * La clase CuentaBancaria
 * Hace referencia a la CuentaBancaria de los clientes
 * @author Alejandro Santos Villabona
 * @version 1.0 2024/03/12
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private Cliente propietario;

    /**
     * Constuctor principal que crea una CuentaBancaria
     * @param numeroCuenta, numero de cuenta de cada cliente
     * @param saldo, dinero que dispone cada cuenta
     * @param propietario, nombre del cliente y propietario de la cuenta
     */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    /**
     * Método para obtener el número de cuenta
     * @return devuelve un String que contiene el nuevo número de cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Asigna el número de cuenta
     * @param numeroCuenta, el nuevo nuemero de cuenta del cliente
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Método para obtener el saldo
     * @return devuelve un double con el saldo disponible
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Asigna un saldo a la cuenta
     * @param saldo, el nuevo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para obtener el propietario de una cuenta
     * @return devuelve al nuevo propietario
     */
    public Cliente getPropietario() {
        return propietario;
    }

    /**
     * Asigna un propietario a una cuenta
     * @param propietario, el nuevo propietario de la cuenta
     */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    /**
     * Método para ingresar dinero de una cuenta
     * @param cantidad, canitdad a ingresar en una cuenta
     */
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    /**
     * Método para retirar dinero de una cuenta
     * @param cantidad, canitdad a retirar de una cuenta
     * @return devuelve un boolean, true o false, que indica si podemos retirar dinero
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }
}
