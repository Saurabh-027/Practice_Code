package Insertation_Sort;

public class InsertationSort {
    public static void main(String[] args) {
        int[] unsortedArray = {4, 2, 33, 8, 45, 2, 3, 1, 6, 4, 8, 1};

        for (int j = 0; j < unsortedArray.length; j++) {
            for (int i = 0; i < unsortedArray.length-1; i++) {
                int key = unsortedArray[i+1];
                if (unsortedArray[i] > key) {
                    int temp = unsortedArray[i];
                    unsortedArray[i] = key;
                    unsortedArray[i+1] = temp;
                }
            }
        }

            for (int i : unsortedArray) {
                System.out.println(i);
            }
        }
    }
