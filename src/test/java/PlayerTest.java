import Game.CheckGame;
import Player.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @DisplayName("Check Name Player")
    @Test
    public void CheckNamePlayer(){

        Player player =new Player();

        player.setName("Victor");
        String esperado="Victor";
        Assertions.assertEquals(esperado,player.getName());
        Assertions.assertTrue(player.getName().equals("Victor"));

    }
    @DisplayName("Check Age Player")
    @Test
    public void CheckAgePlayer(){

        Player player =new Player();

        player.setAge(18);
        int esperado=18;
        Assertions.assertEquals(esperado,player.getAge());
        Assertions.assertTrue(player.getAge()==esperado);

    }
    @DisplayName("Check Board Player")
    @Test
    public void CheckBoardPlayer(){

        Player player =new Player();

        player.setBoard(new String[2][2]);
        String[][] esperado= new String[2][2];
        Assertions.assertArrayEquals(esperado,player.getBoard());

    }
}
