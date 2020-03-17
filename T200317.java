import java.util.Arrays;

public class T200317 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = Arrays.copyOf(arr, arr.length);
        //深拷贝
        // 相比于 newArr = arr 这样的赋值, copyOf 是将数组进行了 深拷贝, 即又创建了一个数组对象
        // 拷贝原有数组中的所有元素到新数组中
        System.out.println("newArr: " + Arrays.toString(newArr));
        //newArr: [1, 2, 3, 4, 5, 6]

        arr[0] = 10;
        System.out.println("arr: " + Arrays.toString(arr));
        //arr: [10, 2, 3, 4, 5, 6]
        System.out.println("newArr: " + Arrays.toString(newArr));
        //newArr: [1, 2, 3, 4, 5, 6]
        //修改原数组，不影响新数组

        // 拷贝某个范围.
        int[] newArray = Arrays.copyOfRange(arr, 2, 4);
        System.out.println("newArray: " + Arrays.toString(newArray));
        //newArray: [3, 4]
        //可见，范围区间为[2,4)  （下标）
    }

    public static void main3(String[] args) {
        //数组转字符串
        int[] arr = {1, 2, 3, 4, 5, 6};
        String newArray = Arrays.toString(arr);
        System.out.println(newArray);
        //[1, 2, 3, 4, 5, 6]
    }

    public static void main2(String[] args) {
        //判断是否有序
        int[] arr = {1, 3, 8, 6, 4, 7, 5, 2, 9};
        System.out.println(isSorted(arr));//false
    }
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main1(String[] args) {
        //冒泡排序法
        int[] arr = {3, 5, 2, 4, 1, 8, 6, 9, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        //引用传的是地址，方法直接修改原数组
    }
    public static void bubbleSort(int[] arr) {
        boolean flg = false;
        for(int i = 0; i < arr.length - 1; i++) {
            //i是数组的数字数：9
            flg = false;
            //检查是否会在循环的某一次有序;
            for(int j = 0; j < arr.length - 1 - i; j++) {
                //j是每一个数字循环的次数
                //下标为0的数字循环9次；下标为1的数字循环8次
                //即i每增加1，j少循环一次
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false) {
                //若有序，可直接返回
                return;
            }
        }
    }
}
