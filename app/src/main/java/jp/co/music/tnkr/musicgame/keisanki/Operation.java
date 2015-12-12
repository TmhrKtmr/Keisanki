package jp.co.music.tnkr.musicgame.keisanki;

/**
 * Created by yukumo3621 on 2015/12/13.
 */


public enum Operation {
    PLUS {
        int apply(int x, int y) { return x + y; }
        char character() { return '+'; }
    },
    MINUS {
        int apply(int x, int y) { return x - y; }
        char character() { return '-'; }
    },
    TIMES {
        int apply(int x, int y) { return x * y; }
        char character() { return '*'; }
    },
    DIVIDE {
        int apply(int x, int y) { return x / y; }
        char character() { return '/'; }
    };
    abstract int apply(int x, int y);
    abstract char character();
}

