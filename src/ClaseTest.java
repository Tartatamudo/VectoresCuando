
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClaseTest {
    @Test
    void    ComprobarIsPrime(){
        assertEquals(false, Clase.isPrime(0));

        assertEquals(false, Clase.isPrime(1));

        assertEquals(true, Clase.isPrime(2));

        assertEquals(false, Clase.isPrime(-1));
    }

    @Test
    void    comprobarReadDim(){
        int num = Clase.readDim();
        assertEquals(10, num);
    }

    @Test
    void readDim() {
    }

    @Test
    void copyVectors() {
        ArrayList<Integer> otherVec = new ArrayList<Integer>();
        int vec [] = new int [10];

        List<Integer> otherVecConfirm = Arrays.asList(2,3,5,13,977);

        vec = new int[]{-1, 1, 2, 3, 4, 5, 13, 977, -14663467, 77767890, 2421412};

        Clase.copyVectors(vec, otherVec);
        assertEquals(otherVecConfirm, otherVec);
    }

    @Test
    void fillVector() {

    }

    @Test
    void showVector() {

    }

    @Test
    void showOtherVector() {
    }

    @Test
    void testComprobarReadDim() {
    }
}