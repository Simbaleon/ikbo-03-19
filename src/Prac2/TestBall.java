package Prac2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(10, 15);
        System.out.println(ball);
        ball.move(30, 25);
        System.out.println(ball);
    }
}
