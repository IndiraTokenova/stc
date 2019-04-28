package part01.lesson04.task1;

import part01.lesson04.task2.ObjectBox;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author indira [22.04.2019]
 * */
public class MathBox extends ObjectBox {

    private Set<Number> numsSet = new HashSet<>();

    public MathBox(Number[] numbers) {
        numsSet.addAll(Arrays.asList(numbers));
    }

    /**
     * @return sum of the numSet elements
     * */
    public double summator() {
        double summa = 0;
        for (Number number: numsSet) {
            try {
                if (number.getClass() == Double.class) {
                    summa += (double) number;
                } else if (number.getClass() == Integer.class) {
                    summa += (int) number;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return summa;
    }

    /**
     * method divides all elements to divider
     * @param divider int
     * */
    public void splitter(int divider) {
        Set<Number> devidedNumsSet = new HashSet<>();

        for (Number number: numsSet) {
            devidedNumsSet.add((double)number.intValue() / divider);
            System.out.println((double) number.intValue() / divider);
        }
        numsSet = devidedNumsSet;
    }

    /**
     * method remove number from numSet, if it exist
     * @param number deleted number
     * @return true if number deleted
     *         false is number doesn't exist
     * */
    public boolean removeNumber(Number number) {
        return numsSet.remove(number);
    }

    public Set<Number> getNumsSet() {
        return numsSet;
    }

    @Override
    public int hashCode() {
        int summa = (int) Math.round(summator());
        int result = 1;
        for (Number number: numsSet) {
            result = summa * result + (int) number;
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        MathBox mathBox = (MathBox) obj;
        if (numsSet.size() != mathBox.getNumsSet().size()) {
            return false;
        }
        if (numsSet.size() == 0 && mathBox.getNumsSet().size() == 0) {
            return true;
        }
        for (Number number: numsSet) {
            if (mathBox.getNumsSet().contains(number)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder numStr = new StringBuilder();
        for (Number number: numsSet) {
            numStr.append(number).append(" ");
        }
        return numStr.toString();
    }

    @Override
    public void addObject(Object object) {
        try {
            numsSet.add((Number)object);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

}
