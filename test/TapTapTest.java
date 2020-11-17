import static org.junit.Assert.*;

public class TapTapTest {

    @org.junit.Test
    public void type1() {
        TapTap T1=new TapTap();
        TapTap T2=new TapTap();
        int[] arr1={1,1,1,1,1,1,0};
        int[] arr2={1,1,1,1,0};
        T1.SetTap(T1,arr1);
        T2.SetTap(T2,arr2);
        assertEquals(6,T1.Type1(T1));
        assertEquals(4,T2.Type1(T2));
    }

    @org.junit.Test
    public void type2() {
        TapTap T1=new TapTap();
        TapTap T2=new TapTap();
        int[] arr1={2,2,2,2,2,0};
        int[] arr2={2,2,2,0};
        T1.SetTap(T1,arr1);
        T2.SetTap(T2,arr2);
        assertEquals(30,T1.Type2(T1));
        assertEquals(12,T2.Type2(T2));
    }

    @org.junit.Test
    public void type3() {
        TapTap T1=new TapTap();
        TapTap T2=new TapTap();
        int[] arr1={1,1,2,1,1,1,0};
        int[] arr2={2,1,2,0};
        T1.SetTap(T1,arr1);
        T2.SetTap(T2,arr2);
        assertEquals(7,T1.Type3(T1));
        assertEquals(5,T2.Type3(T2));
    }

    @org.junit.Test
    public void convert() {
        TapTap T1=new TapTap();
        TapTap T2=new TapTap();
        TapTap T3=new TapTap();
        int[] arr1={2,2,2,2,2,0};
        int[] arr2={1,1,1,1,1,1,0};
        int[] arr3={1,1,1,2,1,1,0};
        T1.SetTap(T1,arr1);
        T2.SetTap(T2,arr2);
        T3.SetTap(T3,arr3);
        assertEquals(1,T2.Convert(T2));
        assertEquals(2,T1.Convert(T1));
        assertEquals(3,T3.Convert(T3));
    }
}