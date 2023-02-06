import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Aquest codi es un test que comprova els possibles resultats del codi CheckNumber
 * @author IvanPeriche
 * @version 1.0
 */
public class CostPersonalTest {

    @Test
    /**
     * @param 
     */
    public void CheckNumberTestNegatiu() {
        CheckNumber check = new CheckNumber(-10);
        double val = check.comprovaSigne();
        assertEquals(-1.0, val, 0.0);
    }
    