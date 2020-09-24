import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

public class UpdateDemo1 {
    public static void main(String[] args) throws SQLException{
        Scanner scan = new Scanner(System.in);
        System.out.print("수정할 사원의 이름 : ");
        String ename = scan.next();
        System.out.print("수정할 직무 : ");
        String job = scan.next();
        System.out.print("수정할 월급 : ");
        double sal = scan.nextDouble();
        
        DBConnection dbconn = new DBConnection();
        Connection conn = dbconn.getConnection(); // 2,3
        
        String sql = " UPDATE emp_copy " +
                           " SET job = ?, sal = ? " +
                           " WHERE ename = ? "; // 불완전한 SQL문
        PreparedStatement pstmt = conn.prepareStatement(sql); // 4. 아직도 불완전한 SQL문장이다.
        
        pstmt.setString(1, job);         pstmt.setDouble(2, sal);     
        pstmt.setString(3, ename); // 비로소 완전한 SQL 문장이 된다
        
        int rows = pstmt.executeUpdate(); // 5. 매우 주의하자. 파라미터에 sql을 넣지 말자
        if (rows == 1) System.out.println("Update Success");
        else System.out.println("Update Failure");
        
         DBClose.close(conn, pstmt); // 6
        
    }
}
