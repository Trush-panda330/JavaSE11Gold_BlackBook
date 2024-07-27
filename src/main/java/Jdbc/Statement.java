package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Statement {
    public static void main(String[] args) {

        final String URL = "jdbc:mysql://localhost/sampledb";
        final String USER = "root";
        final String PASS = "pass";
        String sql = " student set score = score + 90 where name = '小林' ";

        Connection con = null;
        java.sql.Statement stmt = null;

        try {
            // JDBCドライバのロード
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 1. DBに接続
            con = DriverManager.getConnection(URL, USER, PASS);
            // 2. ステートメントを生成
            stmt = con.createStatement();
            // 3. SQLを実行
            int count = stmt.executeUpdate(sql);
            System.out.println(count + "件更新しました");
        } catch (Exception e) {
            e.printStackTrace(); // エラー詳細を出力
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
