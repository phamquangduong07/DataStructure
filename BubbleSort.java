public class BubbleSort {
    /*
     * Sắp xếp nổi bọt
     * Nguyên lý:
     *          +, Chạy từ đầu đến cuối mảng
     *          +, Nếu phần tử đứng  trước mà lớn hơn phân tử đứng sau thì đổi chỗ
     *          +, Sau mỗi vòng lặp thì phần tử lớn nhất sẽ trôi xuông cuối mảng 
     * 
     */
    public static void main(String[] args) {
        int[] a ={4,3,5,1,8,23,0,2};
        bubbleSort(a);
      printArray(a);
    }

   public static void bubbleSort(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void printArray(int a[]){
        for(int i =0 ;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
    }
}
