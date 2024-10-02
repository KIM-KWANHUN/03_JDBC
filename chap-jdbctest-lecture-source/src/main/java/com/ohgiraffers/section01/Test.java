package com.ohgiraffers.section01;

import com.ohgiraffers.section01.EmployeeDTO.DTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static com.ohgiraffers.section01.common.JDBCTemplate.getConnection;
import static com.ohgiraffers.section01.common.JDBCTemplate.close;

public class Test {

    public static void main(String[] args) {
        Connection con = getConnection();

        PreparedStatement pstmt = null;

        ResultSet rset = null;


        Scanner sc = new Scanner(System.in);
        System.out.println("조회하실 사번을 입력해주세요 : ");
        int empId = sc.nextInt();

        String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = ?";

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1,empId);
            rset = pstmt.executeQuery();

            if(rset.next()) {
                System.out.println(rset.getString(1,"EMP_ID") + "번 ");
            } else {
                System.out.println("번호를 찾을수 없습니다.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(con);
            close(pstmt);
            close(rset);
        }


    }
}
