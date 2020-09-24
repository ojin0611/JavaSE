import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

public class UpdateDemo1 {
    public static void main(String[] args) throws SQLException{
        Scanner scan = new Scanner(System.in);
        System.out.print("������ ����� �̸� : ");
        String ename = scan.next();
        System.out.print("������ ���� : ");
        String job = scan.next();
        System.out.print("������ ���� : ");
        double sal = scan.nextDouble();
        
        DBConnection dbconn = new DBConnection();
        Connection conn = dbconn.getConnection(); // 2,3
        
        String sql = " UPDATE emp_copy " +
                           " SET job = ?, sal = ? " +
                           " WHERE ename = ? "; // �ҿ����� SQL��
        PreparedStatement pstmt = conn.prepareStatement(sql); // 4. ������ �ҿ����� SQL�����̴�.
        
        pstmt.setString(1, job);         pstmt.setDouble(2, sal);     
        pstmt.setString(3, ename); // ��μ� ������ SQL ������ �ȴ�
        
        int rows = pstmt.executeUpdate(); // 5. �ſ� ��������. �Ķ���Ϳ� sql�� ���� ����
        if (rows == 1) System.out.println("Update Success");
        else System.out.println("Update Failure");
        
         DBClose.close(conn, pstmt); // 6
        
    }
}
