package Partida;

public class CheckPartida {

    public int checkPartida(int posicion){

        switch (posicion){

            case 8:
                posicion+=8;
                break;
            case 12:
                posicion+=12;
                break;
            case 31:
                posicion-=11;
                break;
            case 41:
                posicion-=20;
                break;
            case 43:
                posicion+=8;
                break;
            case 50:
                posicion-=9;
                break;
            case 59:
                posicion-=16;
                break;
            default:
                posicion=posicion;
                break;
        }
        return posicion;
    }

}
