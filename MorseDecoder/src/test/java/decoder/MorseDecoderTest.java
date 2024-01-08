package decoder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class MorseDecoderTest {
    private MorseCodeDecoder morseCodeDecoder;

    @BeforeEach
    public void init(){
        morseCodeDecoder = new MorseCodeDecoder();
    }
    @ParameterizedTest
    @ValueSource(strings = {".... . -.--   .--- ..- -.. ."})
    void simpleTest(String str){
        String result = morseCodeDecoder.decode(str);
        Assertions.assertEquals("HEY JUDE", result);
    }

    @Test
    void NullStrTest(){
        String result = morseCodeDecoder.decode(" ");
        Assertions.assertEquals("", result);
    }

    @Test
    void oneSymbol(){
        String result = morseCodeDecoder.decode("....");
        Assertions.assertEquals("H", result);
    }

    @Test
    void unknownSymbol(){
        String result = morseCodeDecoder.decode("------");
        Assertions.assertEquals("", result);
    }

    @Test
    void unknownSymbols(){
        String result = morseCodeDecoder.decode("/----- ------/");
        Assertions.assertEquals("", result);
    }
    @Test
    void unknownSymbolsSpaceBetween(){
        String result = morseCodeDecoder.decode("/-----   ------/");
        Assertions.assertEquals("", result);
    }

    @Test
    void onlySpace(){
        String result = morseCodeDecoder.decode(".");
        System.out.println(result);
        Assertions.assertEquals("E", result);
    }

    @Test
    void firstSpace(){
        String result = morseCodeDecoder.decode("     .   .");
        System.out.println(result);
        Assertions.assertEquals("E E", result);
    }
}
