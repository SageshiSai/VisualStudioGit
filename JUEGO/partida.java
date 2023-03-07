package JUEGO;

import java.util.ArrayList;
import java.util.Date;

public class partida {
    private Date fecha = new Date();
    private String nombreJuego;
    private boolean online;

    ArrayList<Gamer> Gamer = new ArrayList<>(2);

    public Date getFecha() {
	return this.fecha;
    }
    public void setDate(Date Date) {
	this.fecha = Date;
    }

    public String getNombreJuego() {
    return this.nombreJuego;
    }
    public void setNombreJuego(String nombreJuego) {
    this.nombreJuego = nombreJuego;
    }

    public boolean getOnline() {
    return this.online;
    }
    public void setOnline(boolean online) {
    this.online = online;
    }

}
