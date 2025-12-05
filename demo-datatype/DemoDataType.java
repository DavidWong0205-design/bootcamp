public class DemoDataType {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Variable 變量
        // Integer (+ve - -ve)

        // "=" assignment
        // from right to left
        int x = 3;
        int y = 7;

        System.out.println("x");
        System.out.println(x);
        System.out.println("y");
        System.out.println(y);

        x = 10;
        System.out.println(x);
        // re-assign y = 10
        y = 100;
        System.out.println(y);
        // sysout > System.out.println()
        // Variable name convention
        // 第一隻字要英文字母 細寫
        int water = 1;
        // 駝峰式命名法 每個英文開頭都大寫
        int goToSchool = 2;

        // Declaration for vaiable type (聲名變量類型)
        int a;
        a = 4;

        // ! int 整數 double 有小數的字
        double x1 = 3.14;
        System.out.println(x1);

        double x2 = 3.06;
        System.out.println(x2);

        // ! put x3 value into variable x3
        int p4 = 1000;
        System.out.println(p4);

       // + - * /

       System.out.println(p4);
       int p5 = 99;
       p5 = p4;
       System.out.println(p4);
       System.out.println(p5);

       int a4 = 5;
       int a5 = 20;
       a5 = 10 + a4;
       System.out.println(a5);

       // ! add to itself
       p5 = p5 + 100000;
       System.out.println(p5);


       // ! 1(Store Integer) byte, short, int, long 整數
       // ! 2(Store number with decimal place) float, double 有小數
       // ! 3(Store Single Character) char 一個英文字
       // ! 4(Store true or false) boolean 真定假



    }
}
