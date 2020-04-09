import java.util.Scanner;
public class ArrayElementRemoval {
    public void removeAndShow() {
    }
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0, 6, 0, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an element to be removed: ");
        int X = scanner.nextInt();
        int amountOfX=0;
        int index_del;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                amountOfX++;
                array[array.length-amountOfX]=0;
                index_del = i;
                for (int j = index_del; j < array.length-amountOfX; j++) {
                    array[j] = array[j + 1];
                }
            }

        }
        if(amountOfX!=0){
            System.out.println("The new array is: ");
            System.out.print('{');
            for (int i=0;i<array.length-1;i++){
                System.out.print(array[i]+",");
            }
            System.out.printf("%d%s",array[array.length-1],"}");
        }else System.out.println("Element not found in the array");
    }
}