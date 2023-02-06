import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Aquest codi es un test que comprova els possibles resultats
 */
public class CheckNumberTest {

    @Test
    public void CheckNumberTestNegatiu() {
        CheckNumber check = new CheckNumber(-10);
        double val = check.comprovaSigne();
        assertEquals(-1.0, val, 0.0);
    }

    @Test
    public void CheckNumberTestNormal() {
        CheckNumber check = new CheckNumber(0);
        double val = check.comprovaSigne();
        assertEquals(0.0, val, 0.0);
    }

    @Test
    public void CheckNumberTestPositiu() {
        CheckNumber check = new CheckNumber(10);
        double val = check.comprovaSigne();
        assertEquals(1.0, val, 0.0);
    }

}