package Algorithms.Sort.BubbleSort;

public class BubbleSort {
    /**
     * 为无序数组 [7 5 1 9 4 2 6 8 3] 排序
     */
    public int[] src;

    public void sort(){
        for(int i = 0; i < src.length; i++){
            boolean flag = false;                                             //做标志位以减少多余的循环次数，内循环一次都没执行表示已经有序则break
            for(int j = 0; j < src.length - i - 1; j++){
                if(src[j+1] < src[j]){
                    int tmp = 0;
                    tmp = src[j];
                    src[j] = src[j+1];
                    src[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        for(int a : src){
            System.out.println(a);
        }
    }
}
