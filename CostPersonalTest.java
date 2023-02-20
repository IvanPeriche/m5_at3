import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Aquest codi es un test que comprova els possibles resultats del codi CostPersonal
 * @author IvanPeriche
 * @version 1.0
 */


 public class CostPersonalTest {

        Treballador treballador1 = new Treballador("Ivan", Treballador.DIRECTOR, 1000, 0);
        Treballador treballador2 = new Treballador("Iker", Treballador.SUBDIRECTOR, 800, 0);
        Treballador treballador3 = new Treballador("Hugo", Treballador.BASE, 800, 10);

        Treballador[] treballadors = {treballador1, treballador2, treballador3};

        @Test
        public void CostPersonalTest1() {

            Treballador treballador1 = new Treballador("Ivan", Treballador.DIRECTOR, 1000, 0);
            Treballador treballador2 = new Treballador("Iker", Treballador.SUBDIRECTOR, 800, 0);
            Treballador treballador3 = new Treballador("Hugo", Treballador.BASE, 800, 10);
            Treballador[] treballadors = {treballador1, treballador2, treballador3};

            float expected = 1000 + 800 + 800 +(10*20);
            float result = CostPersonal.CalculaCostDelPersonal(treballadors);
            assertEquals(expected, result, 0.0);
        }

        @Test
        public void testCostTreballadorBase() {
        Treballador base = new Treballador(Treballador.TipusTreballador.BASE, 5000f, 10);
        float cost = CostPersonal.CostTreballador(base);
        assertEquals(5000f + 10 * 20, cost, 0.001f);
        }
    }