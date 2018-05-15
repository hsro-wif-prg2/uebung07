package ueb07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by d1Av0 on 15-May-18.
 */
public class SortierenTest {
 @Test
  void testSwap(){
     Integer[] array = {1,2,3};
     Sortieren.swap(array,1,2);
     assertEquals(1,(int) array[1]);
     assertEquals(2,(int)array[0]);
     assertEquals(3,(int)array[2]);

 }


}
