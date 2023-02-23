// annonymous arrays : arrays which we dont declare, but we pass them to a method.
// we declare these arrays inside the arguments while calling a method.

public class ag_annonymusArrays {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]) {
        printArray(new int[] {34,2,515,4354,3232,453,45,354,3,45});         // this is how we declare annonymous arrays
    }
}
