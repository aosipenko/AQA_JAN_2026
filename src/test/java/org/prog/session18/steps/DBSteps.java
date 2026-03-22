package org.prog.session18.steps;

import org.prog.session18.CucumberRunner;

import java.sql.*;

public class DBSteps {

    public boolean phoneExists(String name) throws SQLException {

        Connection conn = CucumberRunner.getConnection();

        PreparedStatement ps = conn.prepareStatement(
                "SELECT price FROM phones WHERE name = ?"
        );

        ps.setString(1, name);

        ResultSet rs = ps.executeQuery();

        return rs.next(); // true если есть
    }

    public long getPrice(String name) throws SQLException {

        Connection conn = CucumberRunner.getConnection();

        PreparedStatement ps = conn.prepareStatement(
                "SELECT price FROM phones WHERE name = ?"
        );

        ps.setString(1, name);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return rs.getLong("price");
        }

        return -1;
    }

    public void insertPhone(String name, long price) throws SQLException {

        Connection conn = CucumberRunner.getConnection();

        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO phones(name, price) VALUES (?, ?)"
        );

        ps.setString(1, name);
        ps.setLong(2, price);

        ps.executeUpdate();
    }
}