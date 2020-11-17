import org.junit.Test;

import static org.junit.Assert.*;

public class FinalTest {

    @Test
    public void result() {
        TapTap T1=new TapTap();
        TapTap T2=new TapTap();
        TapTap T3=new TapTap();
        int[] arr1={2,2,2,2,2,0};
        int[] arr2={1,1,1,1,1,1,0};
        int[] arr3={1,1,1,2,1,1,0};
        T1.result(T1,arr1);
        T2.result(T2,arr2);
        T3.result(T3,arr3);
        assertEquals(30,T1.sum);
        assertEquals(6,T2.sum);
        assertEquals(7,T3.sum);
    }
}