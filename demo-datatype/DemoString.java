import java.rmi.ConnectIOException;

public class DemoString {
  public static void main(String[] args) {
    //string is not primitive
    String s = "David";
    String s2 = "Dicky";

    // ! String 不能用==
    // 可用 .equals
    System.out.println(s.equals("David"));
    System.out.println(s.equals("david"));// false ,上面講明 s = David, not david

    // length()
    System.out.println(s.length()); // David 5個字 = 5

    // charAt() 位置上的字
    System.out.println(s.charAt(3)); // David = 01234 = so 3 = i
    System.out.println(s.charAt(0)); // David = 0 = D

    // last character
    String s3 = "Connie";
    System.out.println(s3.charAt(s3.length()-1));
    // first character
    System.out.println(s3.charAt(0));

    // Find the middle character of name
    String name = "Joey";
    System.out.println(name.charAt(name.length() /2) );

    // indexOf()
    String s4 = "Sally";
    System.out.println(s4.indexOf('a')); // 1
    System.out.println(s4.indexOf('b')); // -1 找不到就是-1
    System.out.println(s4.indexOf('l')); // 2 找第一個

    // lastIndexOf()
    System.out.println(s4.lastIndexOf('l')); // 3 找最後一個

    // contains() 找內容 true or false
    System.out.println(s4.contains("ll")); // true
    System.out.println(s4.contains("lll")); // false

  }
}
