public class Evento {
    private String responsable;
    private String nombreEvento;
    private String tipoEvento;
    private String fecha;      
    private int horaInicio;     
    private int horaFin;        
    private int numeroJugadores;
    private boolean depositoPagado; 

    public Evento(String responsable, String nombreEvento, String tipoEvento,
                  String fecha, int horaInicio, int horaFin,
                  int numeroJugadores, boolean depositoPagado) {
        this.responsable = responsable;
        this.nombreEvento = nombreEvento;
        this.tipoEvento = tipoEvento;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.numeroJugadores = numeroJugadores;
        this.depositoPagado = depositoPagado;
    }

    public String getResponsable() { return responsable; }
    public String getNombreEvento() { return nombreEvento; }
    public String getTipoEvento() { return tipoEvento; }
    public String getFecha() { return fecha; }
    public int getHoraInicio() { return horaInicio; }
    public int getHoraFin() { return horaFin; }
    public int getNumeroJugadores() { return numeroJugadores; }
    public boolean isDepositoPagado() { return depositoPagado; }
    public void setDepositoPagado(boolean depositoPagado) { this.depositoPagado = depositoPagado; }
}


