package Board;


public class LadderAndSnake {

    public static String Check(int position){

        String returned="";



        if (position==2||position==7||position==8||position==15||position==21||
                position==28||position==36||position==51||position==71||position==78||position==87) {

            returned = "# ";
        }
        if (position==16||position==46||position==49||position==62||position==64||position==74||
                position==89||position==92||position==95||position==99) {

            returned = "g ";
        }

        return returned;
    }



}
