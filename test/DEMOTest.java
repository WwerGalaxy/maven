import org.junit.Test;

import static org.junit.Assert.*;

public class DEMOTest {

    @Test
    public void result() {
        DEMO D=new DEMO();
        int[] arr1={1,1,1,1,1,0};
        D.SetTap(D,arr1);
        D.result(D,arr1);
        assertEquals(0,D.sum);
    }
}