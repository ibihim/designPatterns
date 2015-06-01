package java.de.ko.designPatterns.facadePattern;

public class FacadeTestDrive {

    public static void main(String[] args) {
        BluRayPlayer lgBluRayPlayer = new BluRayPlayer();
        HDTV lgFullHdTelevision = new HDTV();
        IceCream benNJerriesCaramel = new IceCream();

        WatchMovieFacade watchMovieFacade = new WatchMovieFacade(lgBluRayPlayer, lgFullHdTelevision, benNJerriesCaramel);

        watchMovieFacade.startWatching();
        watchMovieFacade.stopWatching();
    }
}
