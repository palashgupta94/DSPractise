public class InsertionSort {
    
    public void insertionSortASC(int[] arr){

        if (arr.length <= 0)
            return;
        if (arr.length == 1)
            print(arr);

        for(int i = 1; i < arr.length; i++){

            int temp = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        print(arr);
    }

    public void insertionSortDESC(int[] arr){

        if (arr.length <= 0)
            return;
        if (arr.length == 1)
            print(arr);

        for(int i = 1; i < arr.length; i++){

            int temp = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] < temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        print(arr);
    }


    private void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " -- ");
        }

        System.out.println();
    }

}
