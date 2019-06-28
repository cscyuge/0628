package Start;

import manager.computerMgr;

public class Main {
    public static void main(String[] args) {
        computerMgr cm = new computerMgr();
        cm.initial();
        boolean quit=false;
        while (!quit) {
            quit=cm.startMenu();
            cm.returnMain();
        }
    }
}
