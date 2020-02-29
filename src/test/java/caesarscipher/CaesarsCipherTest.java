package caesarscipher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarsCipherTest {

    private CaesarsCipher caesarsCipher = new CaesarsCipher();

    @Test
    void testCipheredMessageWithOffsetOf12() {
        assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today", 12));
    }

    @Test
    void testEmptyString() {
        assertEquals("", caesarsCipher.cipher("", 12));
    }

    @Test
    void testCipheredMessageWithOffsetOf11() {
        assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today", 11));
    }

    @Test
    void anotherFailingTest() {
        assertEquals("", caesarsCipher.cipher("how are you doing today", 12));
    }
}