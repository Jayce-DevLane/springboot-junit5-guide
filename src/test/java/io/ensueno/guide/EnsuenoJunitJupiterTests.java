package io.ensueno.guide;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnsuenoJunitJupiterTests {

    @Test
    @DisplayName("기본_테스트_검사")
    void simpleTestMethod(){
        assertEquals(2, 1+1);
    }

}
