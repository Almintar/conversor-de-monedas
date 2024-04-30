package almintaro.com.aluracursos.conversordemonedas.calculos;

import almintaro.com.aluracursos.conversordemonedas.modelos.Divisas;

public class Conversor {
    private double valorCambiado = 0;

    public double getValorCambiado() {
        return valorCambiado;
    }

    public void convertir(Divisas cambio){
        this.valorCambiado = cambio.getTasaDeCambio()*cambio.getCantidadParaCambiar();
    }

}
