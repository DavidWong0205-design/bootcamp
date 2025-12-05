public class DemoDataType2 {
  public static void main(String[] args) {
    System.out.println("123");

    // byte, short, long, (store Integer)
    // byte (-128 - 127)
    // short (-32xxx - 32xxx)
    // int (-21億 - 21億)
    // long (2^63)
    // 方便自己睇數可以用 : 2_123_456_789 (加底線)

  int i1 = 2147483647;
  i1 = i1 + 1;
  System.out.println(i1);
  // ! 會出-2147483647 (因為是一個cycle) 

  // long l1 = 2_200_000_000;
  // System.out.println(l1);
  // ! 出現錯誤,因為2_200_000_000 超過了 int 的最大值, 要在後面加L like
  // long l1 = 2_200_000_000L;

  // long + int =>long + long => long
  long l1 = 2_200_000_000L + 5;
  System.out.println(l1);

  int i8 = 9;
  // ! byte b1 = i8; (i8 = int may out of the range, so error)

  }
}
