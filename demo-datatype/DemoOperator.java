public class DemoOperator {
  public static void main(String[] args) {
    System.out.println("123");
    int x = 10;
    x = x + 20;
    System.out.println(x);

    int y = x + 100;
    System.out.println(y);

    int z = y * 10;
    System.out.println(z);

    // int / int = int =>
    int r3 = 10 / 3;
    System.out.println(r3);
    // = 10/3

    System.out.println(10.0 / 3); // double / int = double (加.0)

    int score1 = 100;
    int score2 = 99;
    double averageScore = (score1 + score2) / 2.0;
    System.out.println(averageScore);

    double score3 = 81;
    double score4 = 80;
    double averageScore2 = (score3 + score4) / 2;
    System.out.println(averageScore2);

    double a1 = 0.1 + 0.2;
    System.out.println(a1); // 0.30000004

    int r1 = 10 % 3;
    System.out.println(r1); 
    // ! remainder (餘數) of 10/3

    //boolean (true of false)
    boolean c = true;
    c = false;

    int result = 5;
    boolean isResultOddNumber = result % 2 ==1; // "==" checking if equals to
    System.out.println(isResultOddNumber);

    int davidAge = 26;
    boolean isElderly = davidAge >= 65;
    System.out.println(isElderly);

    int dickyAge = 70;
    boolean isElderly2 = dickyAge >= 65;
    System.out.println(isElderly2);

    // ! boolean should be boolean isXXXX = true of false
    // ! boolean isMale = false / boolean isFemale = true
    //! boolean gender = male (X)

    // char
    // single quote = a b c 1 2 3 ? ! @ 中文字 咩文都得

    char a3 = 'b';
    a3 = '$';
    a3 = '@';
    a3 = 'b';

    char a4 = 'B';
    System.out.println(a3==a4);
    
    a4 = 'b';
    System.out.println(a3==a4);

    // float (store decimal number有小數位)(但有限小數)
    // 3.1234567 error , <is a double value
    float f1 = 3.1234567f;
    f1 = f1 + 0.01f;
    System.out.println(f1);

    // +1 and -1
    int t = 0;
    // t+1 有4種寫法
    t++;
    ++t;
    t = t + 1;
    t += 1;
    System.out.println(t); // 上面加左4次

    int w = 0;
    w--;
    --w;
    w = w -1;
    w -= 1;
    System.out.println(w);

    int q = 1;
    q *= 3;
    q = q * 3;
    System.out.println(q);

    // comparison
    // > < >= <= == !=

    int score = 91;
    boolean isGradeA = score >=90;
    System.out.println(isGradeA);

    char gender = 'F';
    boolean isMale = gender != 'F';
    System.out.println(isMale);

    
  }
}
