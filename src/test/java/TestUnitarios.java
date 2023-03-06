import Board.LadderAndSnake;
import Game.CheckGame;
import StartGame.StartGame;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestUnitarios {
    @Test
    public void Test1(){

        StartGame startGame=new StartGame();
        Assertions.assertEquals(3,startGame.numberPlayers());
    }
    @DisplayName("Check position")
    @Test
    public void Test2(){

        CheckGame checkGame =new CheckGame();
        Assertions.assertEquals(38,checkGame.checkGame(2));
        Assertions.assertEquals(14,checkGame.checkGame(7));
        Assertions.assertEquals(31,checkGame.checkGame(8));
        Assertions.assertEquals(26,checkGame.checkGame(15));
        Assertions.assertEquals(84,checkGame.checkGame(28));
        Assertions.assertEquals(6,checkGame.checkGame(16));
        Assertions.assertEquals(44,checkGame.checkGame(36));
        Assertions.assertEquals(11,checkGame.checkGame(49));
        Assertions.assertEquals(67,checkGame.checkGame(51));
        Assertions.assertEquals(60,checkGame.checkGame(64));
        Assertions.assertEquals(91,checkGame.checkGame(71));
        Assertions.assertEquals(98,checkGame.checkGame(78));
        Assertions.assertEquals(68,checkGame.checkGame(89));
        Assertions.assertEquals(88,checkGame.checkGame(92));
        Assertions.assertEquals(75,checkGame.checkGame(95));
        Assertions.assertEquals(80,checkGame.checkGame(99));

    }
    @DisplayName("Check Ladder And Snakes")
    @Test
    public void Test3(){

        LadderAndSnake ladderAndSnake=new LadderAndSnake();
        Assertions.assertEquals("# ",ladderAndSnake.Check(2));
        Assertions.assertEquals("# ",ladderAndSnake.Check(7));
        Assertions.assertEquals("# ",ladderAndSnake.Check(8));
        Assertions.assertEquals("# ",ladderAndSnake.Check(15));
        Assertions.assertEquals("# ",ladderAndSnake.Check(28));
        Assertions.assertEquals("g ",ladderAndSnake.Check(16));
        Assertions.assertEquals("# ",ladderAndSnake.Check(36));
        Assertions.assertEquals("g ",ladderAndSnake.Check(49));
        Assertions.assertEquals("# ",ladderAndSnake.Check(51));
        Assertions.assertEquals("g ",ladderAndSnake.Check(64));
        Assertions.assertEquals("# ",ladderAndSnake.Check(71));
        Assertions.assertEquals("# ",ladderAndSnake.Check(78));
        Assertions.assertEquals("g ",ladderAndSnake.Check(89));
        Assertions.assertEquals("g ",ladderAndSnake.Check(92));
        Assertions.assertEquals("g ",ladderAndSnake.Check(95));
        Assertions.assertEquals("g ",ladderAndSnake.Check(99));

    }
}
