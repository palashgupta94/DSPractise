public class BubbleSort {

    /* Algortithm:
     * 
     * 1. Iterarte over array
     * 2. check whether arr[j] < arr[j+1]
     * 3. if arr[j] is smaller than arr[j+1] then swap arr[j+1] and arr[j]
     * 
     * 4. follow step 1 to 3 for length-i-1 time;
     */

    public void sortASC(int[] arr) {

        if (arr.length <= 0)
            return;
        if (arr.length == 1)
            print(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        print(arr);
    }

    public void sortDESC(int[] arr) {

        if (arr.length <= 0)
            return;
        if (arr.length == 1)
            print(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        print(arr);
    }

    public void sortASC(char[] arr) {

        if (arr.length <= 0)
            return;
        if (arr.length == 1)
            System.out.println(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }

    public void sortDESC(char[] arr) {

        if (arr.length <= 0)
            return;
        if (arr.length == 1)
            System.out.println(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    char temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }

    public void sortString(String str, String sortType){
        if(str == null || str.isEmpty()) return;
        if(sortType == null || sortType.isEmpty()) return;
        if(str.length() == 1)System.out.println(str.charAt(0));

        char[] arr = str.toCharArray();

        if(sortType.equalsIgnoreCase("ASC")){
            sortASC(arr);
        }else{
            sortDESC(arr);
        }
    }


    private void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " -- ");
        }
        System.out.println();
    }

    private void print(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " -- ");
        }

        System.out.println();
    }
}