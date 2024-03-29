package com.kodilla.jdbc;


import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {

    @Test
    public void testUpdateVipLevels() throws SQLException {

        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        // When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        ResultSet rs2 = statement.executeQuery(sqlCheckTable);

        // Then
        int howMany = -1;
        while (rs2.next()) {
           howMany = rs2.getInt("HOW_MANY");
       }
        assertEquals(0, howMany);
        rs.close();
        statement.close();

    }

    @Test
    void testUpdateBestsellers() throws SQLException {

        //Givne
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER = false";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER = true";
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        // When
        String sqlProcedureCall = "CALL UpdateBestseller()";
        statement.execute(sqlProcedureCall);
        ResultSet rs2 = statement.executeQuery(sqlCheckTable);

        // Then
        int howMany = -1;
        while(rs2.next()) {
            howMany = rs2.getInt("HOW_MANY");
        }
        assertEquals(1, howMany);
        rs.close();
        statement.close();

    }
}
