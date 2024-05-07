package almintaro.com.aluracursos.conversordemonedas.modelos;

import com.google.gson.annotations.SerializedName;

public class Divisas extends Moneda {

    private String paisDeOrigen;

    // No se si estas estaran
    private int cantidadParaCambiar;
    private double valorCambiado;


    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public int getCantidadParaCambiar() {
        return cantidadParaCambiar;
    }

    public void setCantidadParaCambiar(int cantidadParaCambiar) {
        this.cantidadParaCambiar = cantidadParaCambiar;
    }

    public double getValorCambiado() {
        return valorCambiado;
    }

    public void setValorCambiado(double valorCambiado) {
        this.valorCambiado = valorCambiado;
    }
}
