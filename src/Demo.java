import java.util.Scanner;

/**
 * des:this is the demo v1.0
 * time:2019-07-11
 * author:LeeSour326@163.com
 * description：这是乘法口诀表 v3.0
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("this is the first demo in the ide");
        System.out.println("this si a fix test for one merge work");
        Scanner sc = new Scanner(System.in);
        System.out.println("你想要输入的数字是：" );
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            int j=1;
            while (j<=i){
                System.out.print(j+"X"+i+"="+i*j+"\t");
                j++;
            }
            System.out.println(" ");
        }
        System.out.println("this is a change in dev");
        System.out.println("this is a change in master");
    }
}
