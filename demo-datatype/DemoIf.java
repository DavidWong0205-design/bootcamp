public class DemoIf {

  public static void main(String[] args) {

    // if
    int x = 3;
    if (x < 4) {
      System.out.println("hello"); // true 3 < 4
    }
    // if + else
    if (x < 2) {
      System.out.println("goodbye"); // false 3 < 2
    } else {
      System.out.println("hi");
    }
    // if + else if + else
    int A = 100;
    if (A < 90) {
      System.out.println("A smaller than 90");
    } else if (A >= 90 && A < 100) {
      System.out.println("A is 90 < 99");
    } else { // >=100
      System.out.println("y >=100");

      int scoreA = 100;
      if (scoreA < 60) {
        System.out.println("不合格");
      } else if (scoreA >= 60 && scoreA < 100) {
        System.out.println("合格");
      } else {
        System.out.println("滿分");
      }
      double w = 120;
      if (w < 100) {
        System.out.println("ABC");
      } else if (103 < w && w < 110) {
        System.out.println("DEF");
      } else {
        System.out.println("xyz");
      }

      // AND &&
      // OR ||
      int a = 2;
      int b = 9;
      if (a > 3 || b < 10) {
        System.out.println("a > 3 or b < 10");
      } else {
        System.out.println("Error");
      }
      



    int q = 4;
    int u = 100;
    if (q >5 && u < 99) {
      System.out.println("good");
    } else if (q <= 5) {
      System.out.println("byeeeee");
    } else { // q > 5 && u >= 99
      System.out.println("goHomeByBus");
      
    }



    }
  }
}
