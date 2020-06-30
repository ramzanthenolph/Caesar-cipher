import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CaesarTest{
    @Test
    public void createCipher_instanceOfCipher(){
        Caesar caesar = new Caesar("test string");
        //noinspection ConstantConditions
        assertTrue(caesar instanceof Caesar);
    }
    @Test
    public void runGetInput_returnString_String(){
        Caesar caesar = new Caesar("test string");
        assertEquals("test string", caesar.getInputString());
    }
    @Test
    public void runEncrypt_receiveInput_String(){
        Caesar caesar= new Caesar("test");
        //noinspection ConstantConditions
        assertTrue(caesar.encryptText("right", 1) instanceof String);
    }
    @Test
    public void runEncyrpt_shiftLettersBy1_String() {
        Caesar caesar = new Caesar("a");
        assertEquals("b", caesar.encryptText("right",1));
    }
    @Test
    public void runEncrypt_shiftLettersBy2_String() {
        Caesar caesar = new Caesar("a");
        assertEquals("c", caesar.encryptText("right",2));
    }

    @Test
    public void runEncrypt_shiftLettersBeyondZ_String() {
        Caesar caesar = new Caesar("z");
        assertEquals("a", caesar.encryptText("right",1));
    }
    @Test
    public void runEncrypt_dealingWithEncryptWhitespaces_String() {
        Caesar caesar = new Caesar("a b");
        assertEquals("c d", caesar.encryptText("right",2));
    }
    @Test
    public void runEncrypt_dealingWithNonAlphabets_String() {
        Caesar caesar = new Caesar("1-2.3");
        assertEquals("1-2.3", caesar.encryptText("right",3));
    }
}
