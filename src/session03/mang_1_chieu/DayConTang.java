package session03.mang_1_chieu;

public class DayConTang {
    public static void main(String[] args) {
        int[] arr = new int[] {7,6,8,6,7,2,3,4,5,7,2};
        int index = -1;
        int maxElement = 0;
        for (int i = 0; i < arr.length ; i++){
            int count = 1;
            int j = i + 1;
            while ( j < arr.length-1 && arr[j] >= arr[j-1] ){
                count++;
                j++;
            }
            if(maxElement<count){
                index = i;
                maxElement = count ;
            }
        }
        System.out.println("in ra dãy con tăng");

    }
}
