package jp.wings.pocket.chap8;

import java.io.IOException;

class ExecSample {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
