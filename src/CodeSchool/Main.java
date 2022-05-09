package CodeSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 0; i < 14; i++) {
            dynamicArray.isAdd("string" + i);
        }

        System.out.println(dynamicArray.toString());

        System.out.println(dynamicArray.sizeOfDynamicArray());

        System.out.println(dynamicArray.getElement(4));

        dynamicArray.removeElement(8);

        dynamicArray.removeElement("string6");

        System.out.println(dynamicArray.toString());

        System.out.println(dynamicArray.sizeOfDynamicArray());

    }
}
