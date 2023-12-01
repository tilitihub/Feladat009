/*
* File: App.java
* Author: Tiliczki Tibor
* Copyright: 2023, Tiliczki Tibor
* Group: Szoft II-1-E
* Date: 2023-11-30
* Github: https://github.com/tilitihub/Feladat009.git
* Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();

        controller.start();
        controller.stop();
        controller.restart();
    }
}
