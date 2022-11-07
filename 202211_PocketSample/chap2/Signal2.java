package jp.wings.pocket.chap2;

public enum Signal2 {
    RED, BLUE, YELLOW;

    public String toString() {
        return "信号の色は" + name();
    }
}
