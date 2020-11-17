import org.apache.commons.lang3.ArrayUtils;

public class TapTap {
    int length=0;//进行操作的次数,默认为0
    int[] test=null;//输入的具体数值
    int sum=0;//用于统计得分

    public void SetTap(TapTap T, int[] arr)//初始化得分数组
    {
        T.length=ArrayUtils.getLength(arr);
        T.test=new int [length];
        for(int i=0;i<length;i++)
        {
            T.test[i]=arr[i];
        }
    }

    //每次都没跳到中心
    public int Type1(TapTap T)
    {
        for(int i=0;i<T.length-1;i++)
        {
            sum=sum+1;
        }
        return sum;
    }

    //每次都跳到中心
    public int Type2(TapTap T)
    {
        int count=0;
        for(int i=0;i<T.length-1;i++)
        {
            count=i+1;
            sum+=count*2;
        }
        return sum;
    }

    //有时跳到中心有时又没有
    public int Type3(TapTap T)
    {
        int count=0;
        for(int i=0;i<T.length-1;i++)
        {
            if(T.test[i]==1)
            {
                sum+=1;
                if(i-1>=0&&T.test[i-1]==2)
                {
                    count=0;
                }
            }
            if(T.test[i]==2)
            {
                count++;
                if(i-1>=0&&T.test[i-1]==1)
                {
                    sum+=2;
                }
                else if(i-1>=0&&T.test[i-1]==2)
                {
                    sum+=count*2;
                }
                else {
                    sum+=2;
                }
            }
            if(T.test[i]==0)
            {
                break;
            }
        }
        return sum;
    }

    public int Convert(TapTap T)
    {
        int count1=0,count2=0;
        for(int i=0;i<T.length-1;i++)
        {
            if(T.test[i]==1)
            {
                count1++;
            }
            else if(T.test[i]==2)
            {
                count2++;
            }
        }
        if(count1==T.length-1)
            return 1;
        else if(count2==T.length-1)
            return 2;
        else
            return 3;
    }

    public int result(TapTap T,int arr[])
    {
        T.SetTap(T,arr);
        int a=T.Convert(T);
        if(a==1)T.Type1(T);
        else if(a==2) T.Type2(T);
        else T.Type3(T);
        return sum;
    }
}
