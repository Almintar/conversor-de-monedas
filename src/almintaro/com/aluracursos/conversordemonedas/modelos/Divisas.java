package almintaro.com.aluracursos.conversordemonedas.modelos;

public class Divisas extends Moneda {
    private double tasaDeCambio =2;
    private String paisDeOrigen;

    // No se si estas estaran
    private int cantidadParaCambiar = 2;
    //private double valorCambiado = 0;

    public double getTasaDeCambio() {
        return tasaDeCambio;
    }

    // quitar
    public void setTasaDeCambio(double tasaDeCambio) {
        this.tasaDeCambio = tasaDeCambio;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    //quitar
    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public int getCantidadParaCambiar() {
        return cantidadParaCambiar;
    }

    public void setCantidadParaCambiar(int cantidadParaCambiar) {
        this.cantidadParaCambiar = cantidadParaCambiar;
    }

}
