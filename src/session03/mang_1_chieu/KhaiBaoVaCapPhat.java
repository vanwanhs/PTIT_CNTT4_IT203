package session03.mang_1_chieu;

import java.util.Arrays;

public class KhaiBaoVaCapPhat {
    public static void main(String[] args) {
        int arrInt[];
        float arrFloat[];
        arrInt = new int[10];
        arrFloat = new float[20];
        arrInt[0] = 1;
        arrFloat[0] = 2.3333F;

        System.out.println("In ra mảng số nguyên "+ Arrays.toString(arrInt));
        System.out.printf("In ra mang số thập phân %.4f",arrFloat[0]);
    }
}
