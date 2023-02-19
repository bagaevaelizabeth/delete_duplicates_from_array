public class DeleteDuplicatesFromArray {

    public int deleteDuplicate(int arr[]) {
        int i = 0;
        for(int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String argv[]) {
        DeleteDuplicatesFromArray a = new DeleteDuplicatesFromArray();
        int arr[] = {1, 1, 2, 2, 4, 4};
        int v = a.deleteDuplicate(arr);
        System.out.println(v);
    }
}
