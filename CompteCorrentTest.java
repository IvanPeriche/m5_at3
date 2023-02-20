import org.junit.Test;
import static org.junit.Assert.*;

/**
* Aquest codi es un test que comprova els possibles resultats del codi CompteCorrent
* @author IvanPeriche
* @version 1.0
*/

 
public class CompteCorrentTest {
      /**
     * @param 
     */

     @Test
     public void testConstructor() {
         int saldoInicial = 100;
         String contrasenya = "1234";
         CompteCorrent compte = new CompteCorrent(saldoInicial, contrasenya);
         assertEquals(saldoInicial, compte.getSaldo(contrasenya));
         assertEquals(contrasenya, compte.getContrasenya());
     }

    @Test
    public void testDiposita() {
        int saldo = 10000;
        String contrasenya = "1234";
        CompteCorrent compte = new CompteCorrent(saldo, contrasenya);
        int nouSaldo = compte.diposita(50);
        assertEquals(10050, nouSaldo);
    }

    @Test
    public void testRetira() {
        int saldo = 10000;
        String contrasenya = "1234";
        CompteCorrent compte1 = new CompteCorrent(saldo, contrasenya);
        CompteCorrent compte2 = new CompteCorrent(saldo, contrasenya);
        CompteCorrent compte3 = new CompteCorrent(saldo, contrasenya);
        int pastaRetirada1 = compte1.retira(50, contrasenya);
        int pastaRetirada2 = compte2.retira(50, "Incorrecte");
        int pastaRetirada3 = compte3.retira(200000, contrasenya);

        // Cas en que tot està bé
        assertEquals(9950, pastaRetirada1);
        // Cas en que la contrassenya està malament
        assertEquals(-2, pastaRetirada2);
        // Cas en que la retirada de diners és més gran que el saldo del compte
        assertEquals(-1, pastaRetirada3);
    }

    @Test
    public void testGetSaldoContrasenyaCorrecta4() {
        CompteCorrent compte = new CompteCorrent(100, "1234");
        //Probem una cotrasenya corrcecta
        assertEquals(100, compte.getSaldo("1234"));
    }

    @Test
    public void testGetSaldoContrasenyaIncorrect4() {
        CompteCorrent compte = new CompteCorrent(100, "1234");
        //Probem una cotrasenya incorrcecta
        assertEquals(-2, compte.getSaldo("5678"));
    }

    @Test
    public void testSetContrassenya5() {
        int saldo = 10000;
        String contrasenya = "1234";
        String antiga = contrasenya;
        String nova = contrasenya;
        CompteCorrent compte = new CompteCorrent(saldo, contrasenya);
        int novaPassword1 = compte.setContrasenya(antiga, nova);
        int novaPassword2 = compte.setContrasenya("Incorrecte", nova);
        assertEquals(0, novaPassword1);
        assertEquals(-2, novaPassword2);
    }
}
