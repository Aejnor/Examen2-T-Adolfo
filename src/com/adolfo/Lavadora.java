package com.adolfo;

/**
 * Created by Javier on 30/03/2017.
 */
public class Lavadora extends Electrodomestico{
    /**
     * Atributos de clase
     */
    private String carga;
    private String velocidadCentrifugado;
    private String secadora;

    // Constructores

    /**
     * Constructor sin atributos
     */
    public Lavadora() {
    }

    /**
     * Constructor con todos los atributos
     * @param marca
     * @param modelo
     * @param precioBase
     * @param consumoEnergetico
     * @param altura
     * @param anchura
     * @param peso
     * @param carga
     * @param velocidadCentrifugado
     * @param secadora
     */
    public Lavadora(String marca,
                    String modelo,
                    double precioBase,
                    String consumoEnergetico,
                    double altura,
                    double anchura,
                    double peso, String carga,
                    String velocidadCentrifugado,
                    String secadora) {
        super(marca, modelo, precioBase, consumoEnergetico, altura, anchura, peso);
        this.carga = carga;
        this.velocidadCentrifugado = velocidadCentrifugado;
        this.secadora = secadora;
    }


    @Override
    public String toString() {
        return "Lavadora{" +
                "carga='" + carga + '\'' +
                ", velocidadCentrifugado='" + velocidadCentrifugado + '\'' +
                ", secadora='" + secadora + '\'' +
                 super.toString();
    }

    // Accesores
    /**
     *  Getter de carga
     */
    public String getCarga() {
        return carga;
    }
    /**
     *  Setter de carga
     */
    public void setCarga(String carga) {
        this.carga = carga;
    }
    /**
     *  Getter de velocidadCentrifugado
     */
    public String getVelocidadCentrifugado() {
        return velocidadCentrifugado;
    }
    /**
     *  Setter de velocidadCentrifugado
     */
    public void setVelocidadCentrifugado(String velocidadCentrifugado) {
        this.velocidadCentrifugado = velocidadCentrifugado;
    }
    /**
     *  Getter de secadora
     */
    public String getSecadora() {
        return secadora;
    }
    /**
     *  Setter de secadora
     */
    public void setSecadora(String secadora) {
        this.secadora = secadora;
    }


    @Override
    public double precioBruto() {
        return super.precioBruto(precioBase);
    }

    @Override
    public double precioTransporte(double peso) {
        return super.precioTransporte(peso);
    }

    @Override
    public double pvp() {
        return super.pvp();
    }
}
