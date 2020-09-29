package BT5;

public class Ex20 {
    public static void main(String[] args) {
        var player = new Ex20Method1();
        var game = new Ex20Method();

        var turnPlayer1 = player.getPlayer();
        var turn1 = game.logicGame(turnPlayer1);
        var turnPlayer2 = player.getPlayer();
        var turn2 = game.logicGame(turnPlayer2);
        var turnPlayer3 = player.getPlayer();
        var turn3 = game.logicGame(turnPlayer3);

        game.checkWin();

    }

}
