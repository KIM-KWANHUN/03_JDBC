package com.ohgiraffers.section02.preparedstatement;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application05 {

    public static void main(String[] args) {

        /* index 1. EMPLOYEE 테이블에서 조회할 사원의 성씨를 입력받아
         *   해당하는 성을 가지고 있는 사원의 정보를 모두 출력 */
        // 커넥션 만들기
        Connection con = getConnection();
        // statement 만들기
        PreparedStatement pstmt = null;
        // result 만들기
        ResultSet rset = null;
        // 스캐너 생성
        EmployeeDTO emp = null;

        List<EmployeeDTO> emplist = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("조회하실 성을 입력해주세요 : ");
        String empName = sc.nextLine();
        // 프로퍼티 파일에 SQL작성
        Properties prop = new Properties();

        try {

            prop.loadFromXML(
                    new FileInputStream("src/main/java/com/ohgiraffers/section02/preparedstatement/employee-query.xml")
            );
            // 키값 동일 해야함
            String query = prop.getProperty("selectByFamilyName");
            System.out.println("query = " + query);

            pstmt = con.prepareStatement(query);

            pstmt.setString(1, empName);

            rset = pstmt.executeQuery();

            emplist = new ArrayList();

            while(rset.next()) {
                emp = new EmployeeDTO();
                emp.setEmpId(rset.getString("EMP_ID"));
                emp.setEmpName(rset.getString("EMP_NAME"));
                emp.setEmpNo(rset.getString("EMP_NO"));
                emp.setEmail(rset.getString("EMAIL"));
                emp.setPhone(rset.getString("PHONE"));
                emp.setDeptCode(rset.getString("DEPT_CODE"));
                emp.setJobCode(rset.getString("JOB_CODE"));
                emp.setSalLevel(rset.getString("SAL_LEVEL"));
                emp.setSalary(rset.getInt("SALARY"));
                emp.setBonus(rset.getDouble("BONUS"));
                emp.setManagerId(rset.getString("MANAGER_ID"));
                emp.setHireDate(rset.getDate("HIRE_DATE"));
                emp.setEntDate(rset.getDate("ENT_DATE"));
                emp.setEntYn(rset.getString("ENT_YN"));

                emplist.add(emp);


            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvalidPropertiesFormatException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            close(con);
            close(pstmt);
            close(rset);

        }

        for(EmployeeDTO empDto : emplist) {
            System.out.println("empDto = " + empDto);
            
        }
    }
}
