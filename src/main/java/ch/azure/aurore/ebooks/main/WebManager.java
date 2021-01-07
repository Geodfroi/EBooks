package ch.azure.aurore.ebooks.main;

public class WebManager {
    private final MainController main;
   // private final WebEngine webEngine;

    public WebManager(MainController main) {
        this.main = main;
//        webEngine = main.webView.getEngine();
//        webEngine.load("https://www.rts.ch/");
    }
}
