package com.adolfo;

/**
 * Created by Javier on 30/03/2017.
 */
public abstract class Electrodomestico {
    protected String marca;
    protected String modelo;
    protected double precioBase;
    protected String consumoEnergetico;
    protected double altura;
    protected double anchura;
    protected double peso;


    // Constructores

    public Electrodomestico() {
    }

    public Electrodomestico(String marca,
                            String modelo,
                            double precioBase,
                            String consumoEnergetico,
                            double altura,
                            double anchura,
                            double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.consumoEnergetico = consumoEnergetico;
        this.altura = altura;
        this.anchura = anchura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return  ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioBase=" + precioBase +
                ", consumoEnergetico='" + consumoEnergetico + '\'' +
                ", altura=" + altura +
                ", anchura=" + anchura +
                ", peso=" + peso +
                '}';
    }

    // Accesores

    /**
     * Getter de marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Setter de marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Getter de modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Setter de modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Getter de precioBase
     */
    public double getPrecioBase() {
        return precioBase;
    }

    /**
     * Setter de precioBase
     */
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    /**
     * Getter de consumoEnergetico
     */
    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    /**
     * Setter de consumoEnergetico
     */
    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    /**
     * Getter de altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Setter de altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Getter de anchura
     */
    public double getAnchura() {
        return anchura;
    }

    /**
     * Setter de anchura
     */
    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    /**
     * Getter de peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Setter de peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Methods

    /**
     * Metodo que calcula el precio base segun el consumo energetico del aparato
     * @return el precioBase + el plus de la etiqueta de consumo.
     */

    public double precioBruto(double precioBase) {
        double plusConsumo = 0;
        double precioPlus;
        switch (consumoEnergetico) {
            case "A":
            case "a": {
                plusConsumo = 100;
            }
            case "B":
            case "b": {
                plusConsumo = 80;
            }
            case "C":
            case "c": {
                plusConsumo = 60;
            }
            case "D":
            case "d": {
                plusConsumo = 50;
            }
            case "E":
            case "e": {
                plusConsumo = 30;
            }
            case "F":
            case "f": {
                plusConsumo = 10;
            }
        }
        precioPlus = precioBase + plusConsumo;
        return precioPlus;
    }

    public abstract double precioBruto();

    /**
     * Metodo que calcula el plus que habra que sumarle en el
     * siguiente metodo al precio base por el peso del
     * electrodomestico.
     * @return
     */

    public double precioTransporte(double peso) {
        double transporte = 0;

        if (this.peso > 0 && this.peso < 20) {
            transporte = 10;
        } else if (this.peso >= 20 && this.peso < 50) {
            transporte = 50;
        } else if (this.peso >= 50 && this.peso < 80) {
            transporte = 80;
        } else if (this.peso >= 80) {
            transporte = 100;
        }

        return transporte;
    }

    /**
     * Hace el calculo del precio total del aparato.
     * @return
     */

    public double pvp() {
        double pvp;
        pvp = precioBase + precioTransporte(peso);
        return pvp;
    }

}


