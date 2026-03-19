package org.prog.session13;
import java.sql.*;

public class DatabaseUtils {
    private static final String URL = "jdbc:postgresql://localhost:5432/your_db";
    private static final String USER = "postgres";
    private static final String PASS = "password";

    // Метод для поиска телефона в БД
    public static PhoneRecord
    getPhoneByModel(String modelName) {
        String sql = "SELECT model, price FROM phones WHERE model = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, modelName);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new PhoneRecord(rs.getString("model"), rs.getInt("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Метод для сохранения нового телефона
    public static void savePhone(String modelName, int price) {
        String sql = "INSERT INTO phones (model, price) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, modelName);
            pstmt.setInt(2, price);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
