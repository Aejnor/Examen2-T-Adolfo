package com.adolfo;


public class Frigorifico extends Electrodomestico{

    /**
     * Atributos de clase
     */
    private String capacidadTotal;
    private String capacidadCongelador;

    // Constructores

    /**
     * Constructor sin atributos.
     */
    public Frigorifico() {
    }

    /**
     * Constructor con todos los atributos.
     * @param marca
     * @param modelo
     * @param precioBase
     * @param consumoEnergetico
     * @param altura
     * @param anchura
     * @param peso
     * @param capacidadTotal
     * @param capacidadCongelador
     */

    public Frigorifico(String marca,
                       String modelo,
                       double precioBase,
                       String consumoEnergetico,
                       double altura,
                       double anchura,
                       double peso,
                       String capacidadTotal,
                       String capacidadCongelador) {
        super(marca, modelo, precioBase, consumoEnergetico, altura, anchura, peso);
        this.capacidadTotal = capacidadTotal;
        this.capacidadCongelador = capacidadCongelador;
    }

    @Override
    public String toString() {
        return "Frigorifico{" +
                "capacidadTotal='" + capacidadTotal + '\'' +
                ", capacidadCongelador='" + capacidadCongelador + '\'' +
                super.toString();
    }

    // Accesores
    /**
     *  Getter de capacidadTotal
     */
    public String getCapacidadTotal() {
        return capacidadTotal;
    }
    /**
     *  Setter de capacidadTotal
     */
    public void setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }
    /**
     *  Getter de capacidadCongelador
     */
    public String getCapacidadCongelador() {
        return capacidadCongelador;
    }
    /**
     *  Setter de capacidadCongelador
     */
    public void setCapacidadCongelador(String capacidadCongelador) {
        this.capacidadCongelador = capacidadCongelador;
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
