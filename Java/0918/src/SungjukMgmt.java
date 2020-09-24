import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

public class SungjukMgmt {
	private Scanner scan;
	private Connection conn;
	
	public SungjukMgmt() { //Constructor
		this.scan = new Scanner(System.in);
		DBConnection dbconn = new DBConnection();
		this.conn = dbconn.getConnection();
		//System.out.println("방금 객체가 생성됐습니다.");
	}
	
	@Override
	protected void finalize() {  //소멸자
		System.out.println("프로그램을 이용해 주셔서 감사합니다.");
		DBClose.close(this.conn);
	}
	
	public static void main(String[] args) throws SQLException{
		SungjukMgmt sm = new SungjukMgmt(); //생성자 호출
		while(true) {
			int choice = sm.showMenu();
			if(choice == 9) break;
			if(choice >= 1 && choice <= 5) 	sm.process(choice);
		}
		sm = null;
		System.gc();	
	}
	
	private int showMenu() {
		System.out.println("\n9. 종료하기           1. 모두 보기            2. 검색하기                3. 추가하기                4. 수정하기                 5. 삭제하기");
		System.out.print("선택 >> ");
		return this.scan.nextInt();
	}
	
	private void process(int choice) throws SQLException {//1부터 5까지만
		switch(choice) {
			case 1 :  selectAll();   break;
			case 2 :  break;
			case 3 :  insert();       break;
			case 4 :  update();     break;
			case 5 :  break;
		}
	}
	
	private void update() throws SQLException {
		System.out.print("수정할 학생의 학번 : ");                 String hakbun = this.scan.next();
		String sql = "SELECT kor, eng, mat  FROM  Student   WHERE hakbun = ?";    //불완전한 SQL문장
		PreparedStatement pstmt = this.conn.prepareStatement(sql);         //4. 아직까지 불완전한 SQL문장
		pstmt.setString(1, hakbun);  //비로서 완전한 SQL문장.
		ResultSet rs = pstmt.executeQuery();            //5. 아주 중요하다. 파라미터에 sql을 넣지 말자.
		rs.next();   //6. ResultSet에 담겨있는 레코드 한개 읽었다.
		int kor = rs.getInt("kor");                 int eng = rs.getInt("eng");             int mat = rs.getInt("mat");
		
		int tot = kor + eng + mat;
		double avg = tot / 3.;
		String grade = (avg >= 90) ? "A" : 
			                           (avg >= 80) ? "B" :
			                        	    (avg >= 70) ? "C" :
			                        	    	(avg >= 60) ? "D" : "F";
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		
		sql = "UPDATE Student SET tot = ?, avg = ?, grade = ? WHERE hakbun = ?";  //불완전한 SQL문장
		pstmt = this.conn.prepareStatement(sql);            //아직까지 불완전한 SQL문장
		pstmt.setInt(1, tot);          pstmt.setDouble(2, avg);           
		pstmt.setString(3, grade);       pstmt.setString(4, hakbun);   //비로서 완전한 SQL문장
		
		int row = pstmt.executeUpdate();   //아주 아주 주의하자. 파라미터에 sql 넣지 말자.
		if(row == 1) System.out.println("Update Success");
		else System.out.println("Update Failure");
		
		if(pstmt != null) pstmt.close();
	}
	
	private void insert() throws SQLException {
		System.out.print("학번 : ");    String hakbun = this.scan.next();
		System.out.print("이름 : ");    String name = this.scan.next();
		System.out.print("국어 : ");    int kor = this.scan.nextInt();
		System.out.print("영어 : ");    int eng = this.scan.nextInt();
		System.out.print("수학 : ");    int mat = this.scan.nextInt();
		
		//불완전한 SQL문 만들기
		String sql = "INSERT INTO Student(hakbun, name, kor, eng, mat) VALUES(?, ?, ?, ?, ?)";
		PreparedStatement pstmt = this.conn.prepareStatement(sql);   //4. 아직까지 불완전한 SQL문장
		pstmt.setString(1, hakbun);        pstmt.setString(2, name);
		pstmt.setInt(3, kor);                pstmt.setInt(4, eng);                 pstmt.setInt(5, mat);   //비로소 여기서 완전한 SQL문장
		int row = pstmt.executeUpdate();     //5. 아주 주의하자....파라미터에 sql 넣지 말자.
		if(row == 1)  System.out.println("Insert Success");
		else System.out.println("Insert Failure");
		
		if(pstmt != null) pstmt.close();
	}
	
	private void selectAll() throws SQLException {
		Statement stmt = this.conn.createStatement();   //4.
		String sql = "SELECT * FROM Student  ORDER BY tot DESC";
		ResultSet rs = stmt.executeQuery(sql);                //5
		
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t평점");
		System.out.println("------------------------------------------------------");
		while(rs.next()) {                                              //6
			String hakbun = rs.getString("hakbun");
			String name = rs.getString("name");
			int kor = rs.getInt("kor");
			int eng = rs.getInt("eng");
			int mat = rs.getInt("mat");
			int tot = rs.getInt("tot");
			double avg = rs.getDouble("avg");
			String grade = rs.getString("grade");
			System.out.println(hakbun + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg + "\t" + grade);
		}
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
	}
	
	
	
	
}
