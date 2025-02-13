package com.pjmartos;

// This is here just to test with re-arranging imports - no issues there
import static java.lang.System.out;
import java.io.PrintStream;

public class Main {

    public void main() {
        PrintStream out1 = out;
        out1.println("Skippy!");
    }
}
