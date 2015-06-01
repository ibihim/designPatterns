package java.de.ko.designPatterns.facadePattern;

public class WatchMovieFacade {

    BluRayPlayer bluRayPlayer;
    HDTV hdtv;
    IceCream iceCream;

    public WatchMovieFacade(
            BluRayPlayer bluRayPlayer,
            HDTV hdtv,
            IceCream iceCream
    ) {
        this.bluRayPlayer = bluRayPlayer;
        this.hdtv = hdtv;
        this.iceCream = iceCream;
    }

    public void startWatching() {
        iceCream.getOutOfFridge();
        hdtv.turnOn();
        bluRayPlayer.turnOn();
        bluRayPlayer.insertBluRayDisc();
        hdtv.switchSource();
        iceCream.openUp();
        iceCream.eat();
    }

    public void stopWatching() {
        hdtv.turnOff();
        bluRayPlayer.turnOff();
        iceCream.throwAway();
    }
}
