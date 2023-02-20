import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
* Aquest codi es un test que comprova els possibles resultats del codi CompteCorrent
* @author IvanPeriche
* @version 1.0
*/


public class CostPersonalTest {
     /**
     * @param 
     */
    
   Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1000, 0);
   Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 800,0);
   Treballador treballador3 = new Treballador(null, Treballador.BASE,800,10);
        Treballador[] treballadors = {treballador1, treballador2, treballador3};
@Test
public void CostPersonalTest1(){
    Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1000, 0);
    Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 800,0);
    Treballador treballador3 = new Treballador(null, Treballador.BASE,800,10);
        Treballador[] treballadors = {treballador1, treballador2, treballador3};
        float expected = 1000 + 800 + 800 + (10*20);
        float result = CostPersonal.CalculaCostDelPersonal(treballadors);
        assertEquals(expected,result,0.0);
}
@Test 
public void CostPersonalTest2(){
    Treballador treballador3 = new Treballador(null, Treballador.BASE,800,10);
    float expected = 800 +(10*20);
    float result = CostPersonal.CostTreballador(treballador3);
    assertEquals(expected, result, 0.0);
}
@Test
public void testCalculaCostDelPersonal(){
    Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1000, 0);
    float expected1 = 800 + (10*20);
    float result1 = 1000;
    assertEquals(expected1, result1, 0.0);
    
    Treballador[] treballadors2 = {};
    float result = 0;
    float expected = 0;

    Treballador[] treballadors3 = {treballador1,treballador2,treballador3};
    float expected3 = 2800;
    float result3 = 1000 + 800 + 800 + (10*20);
    assertEquals(expected3, result3, 0.0);
}
@Test
public void testCalculaCostDelPersonal2(){
    Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1000, 0);
    Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 800,0);
    Treballador treballador3 = new Treballador(null, Treballador.BASE,800,10);
        Treballador[] treballadors = {treballador1, treballador2, treballador3};
        float expected = 1000 + 800 + 800 + (10*20);
        float result = CostPersonal.CalculaCostDelPersonal(treballadors);
        assertEquals(expected,result,0.0);

        float expected2 = 1000 + 800 + 800 + (10+20);
        float result2 = CostPersonal.CalculaCostDelPersonal(treballadors);
        assertEquals(expected, result, 0.0);
    }

}
