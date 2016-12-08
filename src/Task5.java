import java.util.*;
public class Task5 {
    String s1,s2;
    int k;
    String s3[]=new String[1000];
    Task5(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите университет:");
        s1=scn.nextLine();
        System.out.println("Введите группу:");
        s2=scn.nextLine();
        System.out.println("Введите количество студентов:");
        k=scn.nextInt();
        System.out.println("Введите имя, фамилию студента и количество лет");
        for(int i=0;i<=k;i++){
            s3[i]=scn.nextLine();

        }
        for(int i=0;i<=k;i++) {
            System.out.println(s1+" "+s2+" "+s3[i]);
        }
    }
}
