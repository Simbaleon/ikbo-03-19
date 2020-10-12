package Prac7;

import java.util.Stack;

public class OnStack extends Drunkard{

    private Stack<Integer> player1Stack = new Stack<Integer>();
    private Stack<Integer> player2Stack = new Stack<Integer>();

    @Override
    public void startCards() {
        super.startCards();
        for (int i = 0;i < 5;i++) {
            player1Stack.push(player1.get(4 - i));
            player2Stack.push(player2.get(4 - i));
        }
        player1.clear();
        player2.clear();
    }

    @Override
    public void repushToPlayer1Deck() {
        player1.add(player2Stack.pop());
        player1.add(player1Stack.pop());
        player1.addAll(player1Stack);
        player1Stack.clear();
        player1Stack.addAll(player1);
        player1.clear();
    }

    @Override
    public void repushToPlayer2Deck() {
        player2.add(player1Stack.pop());
        player2.add(player2Stack.pop());
        player2.addAll(player2Stack);
        player2Stack.clear();
        player2Stack.addAll(player2);
        player2.clear();
    }

    @Override
    public void ifCardsAreEquals() {
        player1.add(player1Stack.pop());
        player1.addAll(player1Stack);
        player1Stack.clear();
        player1Stack.addAll(player1);
        player1.clear();

        player2.add(player2Stack.pop());
        player2.addAll(player2Stack);
        player2Stack.clear();
        player2Stack.addAll(player2);
        player2.clear();
    }

    @Override
    public int checkPlayer1Size() {
        return player1Stack.size();
    }

    @Override
    public int checkPlayer2Size() {
        return player2Stack.size();
    }

    @Override
    public int Card1() {
        return player1Stack.peek();
    }

    @Override
    public int Card2() {
        return player2Stack.peek();
    }

    public OnStack() {
        Game();
    }

    //6 0 1 4 2
    //9 8 1 2 0
    //Первый игрок победил!
    public static void main(String[] args) {
        new OnStack();
    }
}
