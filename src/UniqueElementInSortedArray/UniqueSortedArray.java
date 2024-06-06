package UniqueElementInSortedArray;

public class UniqueSortedArray {
public static void main(String[] args){
    int[] arr ={1,1,1,2,2,3,4,5,6,7,7,7,8};

    int unique = arr[0];
    System.out.println(unique);

    //logic for printing the unique element of the sorted array.
    for(int i = 1; i < arr.length; i++){
        if(unique != arr[i]){
            unique=arr[i];
            System.out.println(unique);
        }
    }
}
}
