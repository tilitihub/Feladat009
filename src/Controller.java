/*
* File: App.java
* Author: Tiliczki Tibor
* Copyright: 2023, Tiliczki Tibor
* Group: Szoft II-1-E
* Date: 2023-11-30
* Github: https://github.com/tilitihub/Feladat009.git
* Licenc: GNU GPL
*/

public class Controller implements Controllable {
    public void start() {
        System.out.println("A funkció elindult.");
    }

    public void stop() {
        System.out.println("A funkció leállt.");
    }

    public void restart() {
        System.out.println("A funkció újraindult.");
    }
}
