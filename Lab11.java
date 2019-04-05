import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Lab11 {

        public static void swap(int i, int j, List <Character> A) {
            Character tmp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, tmp);
        }
        public static void insertionSort(List<Character> A) {
            int n = A.size();
            int compareCount = 0;
            int swapCount = 0;
            for (int i = 1; i < n; ++i) {
                compareCount++;
                int key = A.get(i);
                int j = i - 1;
                while (j >= 0 && A.get(j) > key) {
                    swap(j+1,j,A);
                    swapCount++;
                    j = j - 1;
                }

            }
            // use the swap function given
            // print number of comparisions and swaps in this function

        }
        public static void selectionSort(List <Character> A) {
            int n = A.size();
            int compareCount = 0;
            int swapCount = 0;
            for (int i = 0; i < n - 1; i++) {
                int min_idx = A.get(i);
                for (int j = i + 1; j < n; j++) {
                    compareCount++;
                    if (A.get(j) < min_idx) {
                        swap(i, j, A);
                        swapCount++;
                    }

                }
            }

            System.out.println(compareCount+" Comparisons");
            System.out.println(swapCount+" Swaps");
        }
                        // use the swap function given
                // print number of comparisions and swaps in this function

            public static void bubbleSort (List < Character > A) {
                int n = A.size();
                int compareCount = 0;
                int swapCount = 0;
                for (int i = 0; i < n-1; i++)
                    for (int j = 0; j < n-i-1; j++) {
                        compareCount++;
                        if (A.get(j) > A.get(j + 1)) {
                            swap(j + 1, j, A);
                            swapCount++;
                        }
                    }

                // use the swap function given
                // print number of comparisions and swaps in this function
                System.out.println(compareCount+" Comparisons");
                System.out.println(swapCount+" Swaps");
            }

        public static void main(String[] args) {
            List <Character> A = new ArrayList(Arrays.asList('a','b','c','d','e'));
            List <Character> B = new ArrayList(Arrays.asList('e','d','c','b','a'));
            insertionSort(B);
            System.out.println("output of insertion sort");
            System.out.println(B);
            B = Arrays.asList('e','d','c','b','a');
            //
            selectionSort(B);
            System.out.println("output of selection sort");
            System.out.println(B);
            B = Arrays.asList('e','d','c','b','a');
            //
            bubbleSort(B);
            System.out.println("output of bubble sort");
            System.out.println(B);
            B = Arrays.asList('e','d','c','b','a');
            ////////////////////////////////////////////////
            insertionSort(A);
            System.out.println("output of insertion sort");
            System.out.println(A);
            A = Arrays.asList('a','b','c','d','e');
            //
            selectionSort(A);
            System.out.println("output of selection sort");
            System.out.println(A);
            A = Arrays.asList('a','b','c','d','e');
            //
            bubbleSort(A);
            System.out.println("output of bubble sort");
            System.out.println(A);
            A =Arrays.asList('a','b','c','d','e');


        }

    }
    // Answers to Questions
/*
* 4) Selection Sort 0(n^2)
*    Insertion Sort O(n^2)
*    Bubbles Sort O(n^2)
*
* 5) in code
* 6) in code
*
* 7) Insertion Sort
* 8) Insertion Sort
* 9) Insertion Sort
*
* 10) I would make the first for loop start at the last element and decrement
*
*
*
*
*
*
* */

