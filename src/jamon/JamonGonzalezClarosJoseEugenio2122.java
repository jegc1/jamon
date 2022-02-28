/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jamon;

/**
 *
 * @author GonzalezClarosJoseEugenio
 */
public class JamonGonzalezClarosJoseEugenio2122 {
    
    private String categoria;
    private double precio;
    private int mesesCuracion;
    private int stock;
        
    /* Constructor sin argumentos */
    public JamonGonzalezClarosJoseEugenio2122 ()
    {
    }
    /** Constructor con parámetro para iniciar todas las propiedades de la clase
    * jamon
    * @param cat recibe una cadena como la categoría del jamón
    * @param precio recibe un número real como precio
    * @param stock un entero para fijar el stock del jamón
    */
      
    public JamonGonzalezClarosJoseEugenio2122 (String cat, double precio, int stock)
    {
        this.categoria =cat;
        this.precio=precio;
        this.stock=stock;
    }
   /** 
    * @param cat categoría para asignar al jamón
   */
    public void asignarCategoria(String cat)
    {
        setCategoria(cat);
    }
    /** Método que me devuelve la categoría del jamón
     * 
     * @return devuelve la categoría del jamón
     */
    public String obtenerCategoria()
    {
        return getCategoria();
    }

    /** Método que me devuelve el stock de jamones disponible en cada momento
     * 
     * @return devuelve el stock de jamones disponibles
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /** Método para comprar jamones. Modifica el stock.
     * Este método va a ser probado con Junit
     * @param cantidad recibe el numero de jamones a comprar
     * @throws Exception lanza una excepción en caso de número negativo de jamones
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de jamones");
        setStock(getStock() + cantidad);
    }
    /**
     * Método para vender jamones
     * @param cantidad recibe la cantidad de jamones a vender como un número entero
     * @param paisGonzalezClarosJoseEugenio2122 recibe una cadena como país de venta, por defecto es "España"
     * @throws Exception lanza una excepción si la cantidad de jamones a vender es negativa
     * @throws Exception lanza una excepción si el stock es insuficiente para la venta
     */
    public void vender (int cantidad, String paisGonzalezClarosJoseEugenio2122) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de jamones");
        if (obtenerStock()< cantidad)
            throw new Exception ("No  hay suficientes jamones para vender");
        setStock(getStock() - cantidad);
    }

    /**
     * @return la categoria del jamon
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria la categoria a asignarle al jamón
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return devuelve el precio del jamón
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio el precio para asignarle al jamón
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return mesesCuracion los meses de curación del jamón
     */
    public int getMesesCuracion() {
        return mesesCuracion;
    }

    /**
     * @param mesesCuracion los meses de curación a asignar al jamón
     */
    public void setMesesCuracion(int mesesCuracion) {
        this.mesesCuracion = mesesCuracion;
    }

    /**
     * @return stock el stock del jamón
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock recibe el stock de jamones para establecerlo
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
