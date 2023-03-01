package Partida;

public class CheckGame {

    public int checkGame(int position){


        switch (position){

            case 2:
                position+=36;
                break;
            case 7:
                position+=7;
                break;
            case 8:
                position+=23;
                break;
            case 15:
                position+=11;
                break;
            case 16:
                position-=10;
                break;
            case 28:
                position+=56;
                break;
            case 21:
                position+=21;
                break;
            case 36:
                position+=8;
                break;
            case 46:
                position-=21;
                break;
            case 49:
                position-=38;
                break;
            case 51:
                position+=16;
                break;
            case 62:
                position-=43;
                break;
            case 64:
                position-=4;
                break;
            case 74:
                position-=21;
                break;
            case 78:
                position+=20;
                break;
            case 87:
                position+=7;
                break;
            case 92:
                position-=4;
                break;
            case 95:
                position-=20;
                break;
            case 99:
                position-=19;
                break;
            default:
                position=position;
                break;
        }
        return position;
    }

}
