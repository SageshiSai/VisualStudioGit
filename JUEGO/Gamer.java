package  JUEGO;

import java.util.ArrayList;

public class Gamer extends Usuario {
    String nickname;

    //Constructor
    public Gamer(String nickname){
        this.nickname = nickname;
    }

    ArrayList<partida> partida = new ArrayList<>();

    @Override
    public void setEdad(int edad) {
        if(edad < 18){
            super.setEdad(0);
        }else{
            super.setEdad(edad);
        }
        //super.setEdad(edad < 18 ? 0 : edad);
    }
}