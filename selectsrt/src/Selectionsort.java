
public class Selectionsort {
    public static void main(String[] args) {

    int[] arr = {22,56,23,22,87,2,5,6,7,8};
    int length = arr.length;
    selectionsort(arr);
    System.out.println("The sorted elements are:");
    for(int i:arr){

        System.out.println(i);
         }
     }

    public static void selectionsort(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            int index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){

                    index =j;
                }

            }
            int smallNumber = arr[index];
            arr[index]= arr[i];
            arr[i]= smallNumber;
        }

    }
}



