public class af_methods {
    static void max (int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)    if (max < arr[i])       max = arr[i];
        System.out.println(max);
    }

    public static void main(String args[]) {
        int a[] = {3,2,3,6,2,86,23,124,5};
        max(a);
    }
}
