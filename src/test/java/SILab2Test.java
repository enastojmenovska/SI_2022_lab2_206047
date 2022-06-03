import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void Test1() {
        List<String> l1 = Arrays.asList("1","#", "2", "0", "3", "#", "1", "#", "#");
        List<String> l2 = Arrays.asList("0","#", "0", "0", "0", "#", "0", "#", "#");
        List<String> l3 = Arrays.asList("#","0", "#", "0", "0", "#", "0", "#", "0");
        List<String> l4 = Arrays.asList("#","2", "#", "1", "2", "#", "1", "#", "2");

        assertEquals(l1,SILab2.function((l2)));
        assertEquals(l4,SILab2.function((l3)));
    }

    @Test
    void Test2(){
        IllegalArgumentException exception;
        List<String> l1 = new ArrayList<>();
        List<String> l2 = Arrays.asList("0","#", "#");
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(l1));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(l2));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

    }

}