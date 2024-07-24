//package Exception.try_with_resources;
//
//
//import java.sql.SQLException;
//
//
//public class Sample1 {
//    public static void main(String[] args)  {
//      try(MyResource obj1 = new MyResource("obj1");
//          MyResource obj2 = new MyResource("obj2")) {
//          System.out.println("try ブロック内の処理");
//          throw new SQLException();
//          } catch (SQLException e) {
//            System.out.println("catch ブロック:SQLException");
//        } catch (Exception e) {
//          System.out.println("catch ブロック内:Excption");
//      } finally {
//          System.out.println("finally ブロック");
//      }
//    }
//}