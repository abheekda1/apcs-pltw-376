
/**
 * Avticity 3.7.6
 */
import java.util.ArrayList;

public class SortingAlgorithms {
    /**
     * Perform a selection sort an ArrayList of integers
     * 
     * @param intList an ArrayList of integers
     * @return intList sorted from smallest to largest
     */
    public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList) {
        /* your code goes here */
        for (int i = 0; i < intList.size(); i++) {
            int smallestNumIdx = i;
            for (int j = i + 1; j < intList.size(); j++) {
                if (intList.get(j) < intList.get(smallestNumIdx))
                    smallestNumIdx = j;
            }

            // swap
            int temp = intList.get(i);
            intList.set(i, intList.get(smallestNumIdx));
            intList.set(smallestNumIdx, temp);
            // System.out.println(intList);
        }

        return intList;
    }

    /**
     * Perform an insertion sort an ArrayList of integers
     * 
     * @param intList an ArrayList of integers
     * @return intList sorted from smallest to largest
     */
    public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList) {
        /* your code goes here */
        for (int i = 1; i < intList.size(); ++i) {
            int currentElem = intList.get(i);
            int j;
            for (j = i - 1; j >= 0 && intList.get(j) > currentElem; j--)
                intList.set(j + 1, intList.get(j));
            intList.set(j + 1, currentElem);
        }

        return intList;
    }

    /**
     * Perform a selection sort an ArrayList of doubles
     * 
     * @param doubleList an ArrayList of doubles
     * @return doubleList sorted from smallest to largest
     */
    public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList) {
        /* your code goes here */
        for (int i = 0; i < doubleList.size(); i++) {
            int smallestNumIdx = i;
            for (int j = i + 1; j < doubleList.size(); j++) {
                if (doubleList.get(j) < doubleList.get(smallestNumIdx))
                    smallestNumIdx = j;
            }

            // swap
            double temp = doubleList.get(i);
            doubleList.set(i, doubleList.get(smallestNumIdx));
            doubleList.set(smallestNumIdx, temp);
            // System.out.println(intList);
        }

        return doubleList;
    }

    /**
     * Perform an insertion sort an ArrayList of doubles
     * 
     * @param doubleList an ArrayList of doubles
     * @return doubleList sorted from smallest to largest
     */
    public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList) {
        /* your code goes here */
        for (int i = 1; i < doubleList.size(); ++i) {
            double currentElem = doubleList.get(i);
            int j;
            for (j = i - 1; j >= 0 && doubleList.get(j) > currentElem; j--)
                doubleList.set(j + 1, doubleList.get(j));
            doubleList.set(j + 1, currentElem);
        }

        return doubleList;
    }

}
