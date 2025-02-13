package com.pjmartos;

import io.skippy.junit5.PredictWithSkippy;
import org.junit.jupiter.api.Test;

@PredictWithSkippy
class MainTest {

    @Test
    void coverageForMain() {
        new Main().main();
    }
}