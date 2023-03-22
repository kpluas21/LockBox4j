import org.Caesar;
import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class LockBoxTests {
    @Test
    public void caesarEncryptTest() {
        String input = "Hello World!";

        Assertions.assertTrue(Caesar.encrypt(input, 1).equals("Ifmmp Xpsme!"));
        Assertions.assertTrue(Caesar.encrypt(input, 5).equals("Mjqqt Btwqi!"));
        Assertions.assertTrue(Caesar.encrypt(input, 26).equals("Hello World!"));
        Assertions.assertTrue(Caesar.encrypt(input, 27).equals("Ifmmp Xpsme!"));

    }

    @Test
    public void caesarDecryptTest() {

    }
}
