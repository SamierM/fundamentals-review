import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.*;


public class QuickSortArrayTest {

    private QuickSortArray quickSortArray;

    int[] nullArray = null;
    int[] emptyArray = {};
    int[] trivialArray = {1,2,3,4,5};
    int[] largeArray;
    int[] smallArray;
    int[] mediumArray;
    int[] randArray;
    int[] sortedlargeArray;
    int[] sortedSmallArray;
    int[] sortedMediumArray;
    int[] sortedRandArray;


//    public void setUp() {
//        Random random = new Random();
//        quickSortArray = new QuickSortArray();
//
//        int[] smallArray = {5,3,1, 2, 4};
//        sortedSmallArray = Arrays.copyOf(smallArray, smallArray.length);
//        sortedSmallArray = Arrays.stream(sortedSmallArray).sorted().toArray();
//
//        int[] mediumArray = {1,9,4,3,7,9,3,6};
//        sortedMediumArray = Arrays.copyOf(mediumArray, mediumArray.length);
//        sortedMediumArray = Arrays.stream(sortedMediumArray).sorted().toArray();
//
//        int[] largeArray = {1,9,4,3,7,9,3,6,13,7,9,44,2,4,0,1,77};
//        sortedlargeArray = Arrays.copyOf(largeArray, largeArray.length);
//        sortedlargeArray = Arrays.stream(sortedlargeArray).sorted().toArray();
//
//        randArray = new int[random.nextInt(20)];
//        for(int i = 0; i < randArray.length; i++) {
//            randArray[i] = random.nextInt();
//        }
//        sortedRandArray = Arrays.copyOf(randArray, randArray.length);
//        sortedRandArray = Arrays.stream(sortedRandArray).sorted().toArray();
//    }

    @Test
    public void sortAscending() {
        Random random = new Random();
        quickSortArray = new QuickSortArray();

        int[] smallArray = {5,3,1, 2, 4};
        sortedSmallArray = Arrays.copyOf(smallArray, smallArray.length);
        sortedSmallArray = Arrays.stream(sortedSmallArray).sorted().toArray();

        int[] mediumArray = {1,9,4,3,7,9,3,6};
        sortedMediumArray = Arrays.copyOf(mediumArray, mediumArray.length);
        sortedMediumArray = Arrays.stream(sortedMediumArray).sorted().toArray();

        int[] largeArray = {1,9,4,3,7,9,3,6,13,7,9,44,2,4,0,1,77};
        sortedlargeArray = Arrays.copyOf(largeArray, largeArray.length);
        sortedlargeArray = Arrays.stream(sortedlargeArray).sorted().toArray();

        randArray = new int[random.nextInt(20)];
        for(int i = 0; i < randArray.length; i++) {
            randArray[i] = random.nextInt();
        }
        sortedRandArray = Arrays.copyOf(randArray, randArray.length);
        sortedRandArray = Arrays.stream(sortedRandArray).sorted().toArray();

        quickSortArray.sortAscending(smallArray, 0, smallArray.length);
        quickSortArray.sortAscending(mediumArray, 0, mediumArray.length);
        quickSortArray.sortAscending(largeArray,0, largeArray.length);
        quickSortArray.sortAscending(randArray, 0, randArray.length);

        assertArrayEquals(smallArray, sortedSmallArray);
        assertArrayEquals(mediumArray, sortedMediumArray);
        assertArrayEquals(largeArray, sortedlargeArray);
        assertArrayEquals(randArray, sortedRandArray);
    }


}
