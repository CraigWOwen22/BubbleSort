package com.company;

public class BubbleSort {

    public void bubbleSort(int[] unsortedArray) {

        int len = unsortedArray.length;

        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-i-1 ; j++) {
                if(unsortedArray[j]>unsortedArray[j+1]){
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j+1] = temp;
                }
            }
        }
    }

    public void printArray(int unsortedArray[]){
        int len = unsortedArray.length;
        for (int i = 0; i < len; i++) {
            System.out.print(unsortedArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] myUnsortedArray = {2,7,34,1,67,56,24,4};

        BubbleSort bubbleObj = new BubbleSort();
        bubbleObj.bubbleSort(myUnsortedArray);
        bubbleObj.printArray(myUnsortedArray);
    }
}
