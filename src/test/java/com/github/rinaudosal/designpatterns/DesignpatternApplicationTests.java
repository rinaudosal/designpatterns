package com.github.rinaudosal.designpatterns;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DesignpatternApplication.class)
public class DesignpatternApplicationTests {

    // Test class added ONLY to cover main() invocation not covered by application tests.
    @Test
    public void main() {
        DesignpatternApplication.main(new String[]{});
    }
}
