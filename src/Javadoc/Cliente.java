package Javadoc;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase clientes
 * Hace referencia a los clientes de la CuentaBancaria
 *@author Alejandro Santos Villabona
 *@version 1.0 2024/03/12
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String id;
    private List<CuentaBancaria> cuentas;

    /**
     * Constructor principal de la clase clientes
     * @param nombre, el nombre de cada cliente
     * @param apellido, el apellido de cada cliente
     * @param id, el id de cada cliente
     */
    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }

    /**
     * Método para obtener el nombre del cliente
     * @return devuelve un String con el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre al cliente
     * @param nombre, el nuevo nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el apellido del cliente
     * @return devuelve un String con el apellido del cliente
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Asigna el apellido al cliente
     * @param apellido, el nuevo apellido del cliente
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método para obtener el id del cliente
     * @return un String con el apellido del cliente
     */
    public String getId() {
        return id;
    }

    /**
     * Asigna el id al cliente
     * @param id, el nuevo id del cliente
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Lista de todas la cuentas
     * @return nos devuelve un ArrayList con las cuentas de cada cliente
     */
    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    }

    /**
     * Agregar una cuenta bancaria nueva al cliente
     * @param cuenta, la nueva cuenta de cada cliente
     */
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    /**
     * Método que nos cierra una cuenta existente.
     * @param numeroCuenta, numero de cuenta
     * @return devuelve un boolean que nos indica si ya existe, en caso de tenerla se borra
     */
    public boolean cerrarCuenta(String numeroCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
