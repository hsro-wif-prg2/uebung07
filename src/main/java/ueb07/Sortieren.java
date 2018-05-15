package ueb07;

import java.lang.reflect.Array;

/**
 * Created by d1Av0 on 15-May-18.
 */
public class Sortieren {
    static <T> void swap(T[] array,int indexStart,int indexEnd){
        T w = array[indexStart];
        array[indexStart] = array[indexEnd];
        array[indexEnd] = w;
    }


}
