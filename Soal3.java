class OuterClass {
    int x = 10;
    int y1 = 4;
    int y2 = 3;
    int y3 = 1;
    int y4 = 2;
    int y5 = 6;
    int y6 = 8;
    int y7 = 7;
    int y8 = 9;
  
    class InnerClass {
      int y = 5;
      
    }
  }
  
  public class Soal3 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x + myOuter.y1 + myOuter.y2 + myOuter.y3 + myOuter.y4 + myOuter.y5 + myOuter.y6 + myOuter.y7 + myOuter.y8);
    }
  }