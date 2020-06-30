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
    
}
