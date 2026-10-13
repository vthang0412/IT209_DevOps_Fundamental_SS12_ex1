package com.example.cimatrixdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CiMatrixDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldPassBasicTest() {
        assertEquals(2, 1 + 1);
    }
}
