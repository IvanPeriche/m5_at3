import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Aquest codi es un test que comprova els possibles resultats del codi CostPersonal
 * @author IvanPeriche
 * @version 1.0
 */
    
    public class CostPersonalTest {
        @Test
        public void testCalculaCostDelPersonal() {
            Treballador[] treballadors = new Treballador[3];
            treballadors[0] = new Treballador (null, Treballador.DIRECTOR, 1000, 0);
            treballadors[1] = new Treballador (null, Treballador.SUBDIRECTOR, 800, 0);
            treballadors[2] = new Treballador (null, Treballador.BASE, 600, 10);
            float expected = 1000 + 800 + 600 + (10 * 20);
            float result = CostPersonal.CalculaCostDelPersonal(treballadors);
            assertEquals(expected, result, 0);
        }
    
        @Test
        public void testCostTreballador() {
            Treballador treballador = new Treballador(null, Treballador.DIRECTOR, 1000, 0);
            float expected = 1000;
            float result = CostPersonal.CostTreballador(treballador);
            assertEquals(expected, result, 0);
    
            treballador = new Treballador(null, Treballador.BASE, 600, 10);
            expected = 600 + (10 * 20);
            result = CostPersonal.CostTreballador(treballador);
            assertEquals(expected, result, 0);
        }
    
        @Test
        public void testCalculaCostDelPersonal2() {
            Treballador[] treballadors = new Treballador[3];
            treballadors[0] = new Treballador(null, Treballador.DIRECTOR, 1000, 0);
            treballadors[1] = new Treballador(null, Treballador.SUBDIRECTOR, 800, 0);
            treballadors[2] = new Treballador(null, Treballador.BASE, 600, 10);
            float expected = 1000 + 800 + 600 + (10 * 20);
            float result = CostPersonal.CalculaCostDelPersonal2(treballadors);
            assertEquals(expected, result, 0);
        }
    
    }