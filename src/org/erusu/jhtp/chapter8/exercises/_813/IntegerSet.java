package org.erusu.jhtp.chapter8.exercises._813;

public class IntegerSet {
    private boolean[] arr;

    // constructor
    public IntegerSet() {
        arr = new boolean[101];
    }

    // Theoretical set Union
    public static IntegerSet union(IntegerSet mainSet, IntegerSet testSet) {
        boolean[] union = new boolean[101];

        for(int indx = 0; indx < 101; indx++) {
            if(mainSet.getArr()[indx] || testSet.getArr()[indx])
                union[indx] = true;
        }

        IntegerSet unionSet = new IntegerSet();
        unionSet.setArr(union);

        return unionSet;
    }

    // Theoretical set Intersection
    public static IntegerSet intersection(IntegerSet mainSet, IntegerSet testSet) {
        boolean[] intersection = new boolean[101];

        for(int indx = 0; indx < 101; indx++) {
            if(mainSet.getArr()[indx] && testSet.getArr()[indx])
                intersection[indx] = true;
        }

        IntegerSet intersectionSet = new IntegerSet();
        intersectionSet.setArr(intersection);

        return intersectionSet;
    }

    // Insert element into set
    public void insertElement(int e) {
        arr[e] = true;
    }

    // Delete element from set
    public void deleteElement(int e) {
        arr[e] = false;
    }

    // Compare this set to another set
    public boolean isEqualTo(IntegerSet otherSet) {
        for(int indx = 0; indx < 101; indx++) {
            if(arr[indx] != otherSet.getArr()[indx])
                return false;
        }

        return true;
    }

    // Accessor and Modifier Methods
    public boolean[] getArr() {
        return arr;
    }

    public void setArr(boolean[] newArr) {
        arr = newArr;
    }

    // toString
    @Override
    public String toString() {
        String output = "[";
        for(int indx = 0; indx < 101; indx++) {
            if(arr[indx]) {
                output += String.format("%d, ", indx);
            }
        }
        return ((output.length() > 2) ? (output.substring(0, output.length() - 2)) : output) + "]";
    }
}
