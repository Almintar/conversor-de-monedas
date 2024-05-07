package almintaro.com.aluracursos.conversordemonedas.modelos;

import com.google.gson.annotations.SerializedName;

public class Moneda {

    private String nombre;
    @SerializedName("base_code")
    private String codigoOrigen;
    @SerializedName("target_code")
    private String codigoSalida;
    @SerializedName("conversion_rate")
    private double tasaDeCambio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoOrigen() {
        return codigoOrigen;
    }

    public void setCodigoOrigen(String codigoOrigen) {
        this.codigoOrigen = codigoOrigen;
    }

    public String getCodigoSalida() {
        return codigoSalida;
    }

    public void setCodigoSalida(String codigoSalida) {
        this.codigoSalida = codigoSalida;
    }

    public double getTasaDeCambio() {
        return tasaDeCambio;
    }

    public void setTasaDeCambio(double tasaDeCambio) {
        this.tasaDeCambio = tasaDeCambio;
    }

    @Override
    public String toString() {
        return "codigoOrigen='" + codigoOrigen + '\''+
        "codigoSalida='" + codigoSalida + '\''+
                "tasaDeCambio='" + tasaDeCambio + '\'';
    }

}




