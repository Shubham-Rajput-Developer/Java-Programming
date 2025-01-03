import java.util.*;
public class InterfaceExample {
    public static void main(String args[])
    {
        Queen obj = new Queen();
        obj.Moves();

    }
}

interface ChessPlayer
{
    void Moves();

}
class Queen implements ChessPlayer
{
    public void Moves()
    {
        System.out.println("Right,left,top,down,diagonal sides");
    }
}
class Rook implements ChessPlayer
{
    public void Moves()
    {
        System.out.println("Right,left,down,diagonal sides (By one step)");
    }
}
