package sj.patterns.chainOfResponsibility;

enum IssueLevel {
    LOW,
    MEDIUM,
    HIGH
}

abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void doHandle(IssueLevel level);
}

class Level1Handler extends Handler {
    @Override
    protected void doHandle(IssueLevel level) {
        if (level == IssueLevel.LOW) {
            System.out.println("Handled by Level1 - " + level);
            return;
        }
        nextHandler.doHandle(level);
    }
}

class Level2Handler extends Handler {
    @Override
    protected void doHandle(IssueLevel level) {
        if (level == IssueLevel.MEDIUM) {
            System.out.println("Handled by Level2 - " + level);
            return;
        }
        nextHandler.doHandle(level);
    }
}

class Level3Handler extends Handler {
    @Override
    protected void doHandle(IssueLevel level) {
        if (level == IssueLevel.HIGH) {
            System.out.println("Handled by Level3 - " + level);
            return;
        }
        System.out.println("Unhandled");
    }
}

public class Chain {
    public static void main(String[] args) {

        Handler level1Handler = new Level1Handler();
        Handler level2Handler = new Level2Handler();
        Handler level3Handler = new Level3Handler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        level1Handler.doHandle(IssueLevel.HIGH);
    }
}
