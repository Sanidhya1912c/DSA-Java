package LeetCode;

public class ContainDublicate {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };

        System.out.println(containDublicate(array));
    }

    public static boolean containDublicate(int[] arr){

        boolean containDublicate =  false;

        
        for(int i = 0; i < arr.length ;  i++){{
            int value = arr[i];
            for(int j = 0; j < arr.length ; j++){
                if(i == j) continue;
                if(value == arr[j]) {
                    containDublicate = true;
                    break;
                }

            }
        }}

        return containDublicate;
    }
}
