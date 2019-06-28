package Start;

import manager.computerMgr;

public class Main {
    public static void main(String[] args) {
        computerMgr cm = new computerMgr();
        cm.initial();
        while (true) {
            if (cm.startMenu()) break;
            cm.returnMain();
        }
    }
}
