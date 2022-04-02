package ClassEx23_58;

public class ArrayVarTest_21 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = arr1;

        for(int cnt = 0; cnt<arr2.length; cnt++) {
            System.out.println(arr2[cnt]);
        }

        arr2[1] = 7;

        for (int cnt = 0; cnt<arr1.length; cnt++) {
            System.out.println(arr1[cnt]);
        }

        for (int cnt = 0; cnt<arr2.length; cnt++) {
            System.out.println(arr2[cnt]);
        }
    }
}
