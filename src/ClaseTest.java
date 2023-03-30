import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaseTest {
    @Test
    void    getAAAAA(){
        boolean a = Clase.isPrime(6);
        assertEquals(true, a);
    }
}