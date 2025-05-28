package sorting;

public class selectionsort {

    public static void main(String[] args) {
        int arr[] = {23, 54, 2, 1, 4, 56, 43};
        
        System.out.println("Original Array:");
        printArray(arr);

        // Perform Selection Sort
        selectionSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    // Method to perform Selection Sort
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;

            // Find the index of the smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the array
    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

