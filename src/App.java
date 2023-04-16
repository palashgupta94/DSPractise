public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] arr = {4,7,3,5,2,6};
        /* BubbleSort bs = new BubbleSort();
        bs.sortASC(arr);
        bs.sortDESC(arr);

        char[] charArray = "lecture".toCharArray();
        bs.sortASC(charArray);
        bs.sortDESC(charArray);

        String str = "Creativity";
        bs.sortString(str, "asc");
        bs.sortString(str, "desc"); */

        InsertionSort is = new InsertionSort();
        is.insertionSortASC(arr);
        is.insertionSortDESC(arr);
    }
}
