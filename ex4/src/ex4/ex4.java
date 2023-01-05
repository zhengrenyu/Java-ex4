package ex4;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
        //薪資計算
        sop("請輸入工作時數\n"+"一個月基本時數為160小時\n"+"基本時薪174/h，加班費200/h\n");
        Scanner sc = new Scanner(System.in);
        double time = sc.nextDouble();
        sc.close();
        if (time<160){
            sop("本月工作時數:"+time+"未滿160小時\n本月薪資"+174*time);
        }else if(time == 160){
            sop("本月工作時數:"+time+"滿足160小時\n本月薪資"+174*time);
        }else{
            sop("本月工作時數:"+time+"滿足160小時\n本月薪資"+(174*160+200*(time-160)));
        }

    }
    static void sop(String s){
        System.out.print(s);
    }
}