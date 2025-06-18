package abc;

public class QuickSort {
static void quickSort(int [] arr,int low,int high) {
if(low < high) {
int pivotIndex = portition(arr,low,high);
quickSort(arr, low, pivotIndex-1);
quickSort(arr, pivotIndex+1, high);
}
}

private static int portition(int[] arr, int low, int high) {
int pivot = arr[high];
int i = low - 1;
for(int j=0;j<high;j++) {
if(arr[j] < pivot) {
i++;
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
return i+1;


}
static void printArray(int [] arr) {
for(int value : arr) {
System.out.print(value +" ");
}
System.out.println();
}

public static void main(String[] args) {
int [] numbers = {5,2,9,1,6};
System.out.println("Before sorting");
printArray(numbers);
quickSort(numbers, 0, numbers.length-1);
System.out.println("After sorting");
printArray(numbers);

}
}
