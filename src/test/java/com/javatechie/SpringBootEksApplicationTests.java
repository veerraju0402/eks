package com.javatechie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
class SpringBootEksApplicationTests {

	@Test
    void contextLoads() {
        System.out.println("sampple test");
    }

    @Test
    void testMethod() {
        assertEquals(true, true);
    }

}

