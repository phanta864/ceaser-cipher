import org.junit.Test;

import static org.junit.Assert.*;

public class CeaserCipherTest {
    @Test
    public void ceaserCipher_takeStringInput_string() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        String expectedOutput = new String();
        expectedOutput = "lipps";
        assertEquals(expectedOutput, testCeaserCipher.doCeaserCipher("hello", 4));
    }

    @Test
    public void ceaserCipher_allowsUppercaseInput_string() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        String expectedOutput = new String();
        expectedOutput = "LIPPS";
        assertEquals(expectedOutput, testCeaserCipher.doCeaserCipher("HELLO", 4));
    }

    @Test
    public void ceaserCipher_doesEncryption_string() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        String expectedOutput = new String();
        expectedOutput = "lipps";
        assertEquals(expectedOutput, testCeaserCipher.doCeaserCipher("hello", 4));

    }

    @Test
    public void ceaserCipher_doesDecryption_string() {
        CeaserCipher testCeaserCipher =  new CeaserCipher();
        String expectedOutput = new String();
        expectedOutput = "hello";
        assertEquals(expectedOutput, testCeaserCipher.unDoCeaserCipher("lipps", 4));
    }

    @Test
    public void unDoCeaserCipher_takesInUppercaseLetters_string() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        String expectedOutput = "HI";
        assertEquals(expectedOutput, testCeaserCipher.unDoCeaserCipher("BC", 20));
    }
}