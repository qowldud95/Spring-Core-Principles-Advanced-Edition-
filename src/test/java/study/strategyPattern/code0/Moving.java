package study.strategyPattern.code0;

public class Moving {

    private MovableStrategy movableStrategy;

    public Moving(MovableStrategy movableStrategy){
        this.movableStrategy = movableStrategy;
        move();
    }

    public void move(){
        movableStrategy.move();
    }
}
