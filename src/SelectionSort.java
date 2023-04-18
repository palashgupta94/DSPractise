public class SelectionSort {

    public void sort(int[] arr){

        if(arr.length == 0 ) return;
        if(arr.length ==1 )System.out.println(arr[0]);

        for(int i=0; i < arr.length-1; i++){

            int index = i;
            System.out.println("index is -- " + index);

            for(int j = i+1; j < arr.length; j++){

                if(arr[j] < arr[index]){
                    System.out.println("value of j is -- "+j);
                    index = j;
                }
            }

            if(index != i){
                swap(arr, index, i);
            }
        }

        print(arr);
    }

    private void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " -- ");
        }
    }

    private void swap(int[] arr, int index, int i) {

        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }
}
