package factoryBrowser;

/**
 * Created by Arceus6666 on 11/06/2018.
 */

public class FactoryBrowser {


    public static final String FIREFOX = "firefox";
    public static final String IE = "ie";
    public static final String CHROME = "chrome";
    public static final String SAFARI = "safari";

    /**
     *
     * @param typeBrowser
     * @return
     */
    public static IBrowser make (String typeBrowser) {
        IBrowser browser;

        switch(typeBrowser) {
            case FIREFOX :
                browser = new FireFox();
                break;
            case CHROME :
                browser = new Chrome();
                break;
            case IE :
                browser = new IE();
                break;
            case SAFARI :
                browser = new Safari();
                break;
            default:
                browser=new Chrome();
                break;
        }

        return browser;
    }
}
