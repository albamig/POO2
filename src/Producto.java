/**
 * La calse <code>Producto</code> implementa el nombre
 * y la descripcion de los productos.
 *
 * @author Alberto Amigo
 * @author Sergio Delgado
 */
public abstract class Producto {
    private String nombre;
    private String descripcion;

    /**
     * Devuelve el nombre del <code>Producto</code>
     *
     * @return Nombre del <code>Producto</code>
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la descripcion del <code>Producto</code>
     *
     * @return Descripcion del <code>Producto</code>
     */
    public String getDescripcion() {
        return descripcion;
    }

    public abstract double getPrecio();

    public abstract int getNumeroCalorias();

    /**
     * Constructor que recibe dos parametros: nombre y descripcion
     * e inicializa el <code>Producto</code>
     *
     * @param nombre nombre del <code>Producto</code> que ha de cumplir la
     * precondicion de nombre != null
     * @param descripcion descripcion del <code>Producto</code> que ha de cumplir la
     * precondicion de descripcion != null
     */
    public Producto(String nombre, String descripcion) {
        super();
        assert (nombre != null);
        this.nombre = nombre;
        assert (descripcion != null);
        this.descripcion = descripcion;
    }
}
