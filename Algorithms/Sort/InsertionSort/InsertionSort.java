package Algorithms.Sort.InsertionSort;

public class InsertionSort {
    public int[] src;

    public void sort(){
        int tmp = 0;
        for(int i = 1; i < src.length; i++){                    //外层循环控制要插入数据是哪个
            int val = src[i];                                   //因为会覆盖数据，所以先把此位置数据记录下来
            int j = i - 1;                                      //有序区间应该在左侧
            for(; j >= 0; j--){                                 //内层循环寻找插入的地方，从后向前查找，查找时比val值大的将会向后移动，此时存在数据覆盖
                if(val < src[j]){
                    src[j+1] = src[j];
                }else{
                    break;                                      //退出循环条件不能忘，否则将会覆盖数据
                }
            }
            src[j+1] = val;                                     //因为循环退出时的位置在应该在的位置之前所以要+1
        }
        for(int a : src){
            System.out.println(a);
        }
    }
}


