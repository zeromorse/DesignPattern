package N27_mediator.code;

/**
 * 抽象同事类
 */
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    /**
     * 行动方法，子类实现
     */
    public abstract void action();

    /**
     * 示意性方法
     * 调用此方法可以改变对象内部的状态
     */
    public void change() {
        mediator.colleagueChanged(this);
    }
}
