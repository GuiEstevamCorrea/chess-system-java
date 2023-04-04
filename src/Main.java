import boardGame.Board;
import boardGame.Position;
import chess.ChessMatch;
import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());

    }
}