package Tablero;

public class EscalerasYSerpientes {

    public static String Check(int j, int k){

        String retorno="";
        switch (j){

            case 0:
                if(k==4){
                    retorno="$  ";
                }else{retorno="*  ";}
                break;
            case 1:
                if(k==2){
                    retorno="$  ";
                }else{retorno="*  ";}
                break;
            case 2:
                if(k==4){
                    retorno="#  ";
                }else if(k==7){
                    retorno="$  ";
            }else{retorno="*  ";}
                break;
            case 4:
                if(k==1){
                    retorno="$  ";
                }else{retorno="*  ";}
                break;
            case 6:
                if(k==4){
                    retorno="#  ";
                }else{retorno="*  ";}
                break;
            case 7:
                if(k==7){
                    retorno="#  ";
                }else{retorno="*  ";}
                break;
            default:
                retorno="*  ";
                break;

        }
        return retorno;
    }


}
