public class Cancha {
    private int numero;
    private String tipo;
    private int capacidadMaxima;
    private double costoPorHora;

    public Cancha(int numero, String tipo, int capacidadMaxima, double costoPorHora) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidadMaxima = capacidadMaxima;
        this.costoPorHora = costoPorHora;
    }

    public int getNumero() { return numero; }
    public String getTipo() { return tipo; }
    public int getCapacidadMaxima() { return capacidadMaxima; }
    public double getCostoPorHora() { return costoPorHora; }
    public void setCostoPorHora(double costoPorHora) { this.costoPorHora = costoPorHora; }

    @Override
    public String toString() {
        return "Cancha #" + numero + " (" + tipo + "), Capacidad: " + capacidadMaxima +
                ", Costo/hora: Q" + costoPorHora;
    }
}
