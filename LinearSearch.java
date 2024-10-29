package Vinsys;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter Elements of Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the value you want to search for");
        int search = sc.nextInt();
        int index = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
            }
        }
        
        if (index != -1) {
            System.out.println("Element was found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
        
        
    }
}
