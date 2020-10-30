package DP04TemplatePattern;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();


    // Template;
    public final void play() {
        initialize();

        startPlay();

        endPlay();
    }

}
