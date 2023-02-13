import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Aquest codi es un test que comprova els possibles resultats del codi CostPersonal
 * @author IvanPeriche
 * @version 1.0
 */


 public class CostPersonalTest {

        @Test
        public void testCostTreballadorDirector() {
        Treballador director = new Treballador(Treballador.TipusTreballador.DIRECTOR, 10000f, 0);
        float cost = CostPersonal.CostTreballador(director);
        assertEquals(10000f, cost, 0.001f);
}


    @Test
    public void testCostTreballadorBase() {
        Treballador base = new Treballador(Treballador.TipusTreballador.BASE, 5000f, 10);
        float cost = CostPersonal.CostTreballador(base);
        assertEquals(5000f + 10 * 20, cost, 0.001f);
    }
    
    }