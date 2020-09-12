import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
    private static final Logger logger = LoggerFactory.getLogger(HelloTest.class);

    @Test
    public void testHello() {
        String helloMessage = "HelloMyNearMarket";
        assertEquals("HelloMyNearMarket", helloMessage);
        logger.info("Hello message from my near market");
    }
}
