package model;

import entity.Todo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.mariadb.jdbc.Statement;
import util.DBUtil;
import java.sql.ResultSet; 
import javax.swing.JOptionPane;

public class TodoModel {
    private int id;
    private String field1;
    private long field2;
    private long field3;
    private String field4;
    private String field5;
    private String password;

    private static final String INSERT_SQL = "INSERT INTO todos (field1, field2, field3, field4, field5, password) VALUES (?, ?, ?, ?, ?, ?)";
    private static DBUtil dbUtil = new DBUtil();

    // Constructor
    public TodoModel(String field1, long field2, long field3, String field4, String field5, String password) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;
        this.password = password;
    }

   
    
   public static List<Todo> loadTodosFromDatabase() {
        String sql = "SELECT * FROM todos";  // SQL to fetch all todos
        List<Todo> todos = new ArrayList<>();

        try (Connection connection = DBUtil.getConnection(); 
             Statement stmt = (Statement) connection.createStatement(); 
             ResultSet rs = stmt.executeQuery(sql)) {
             
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                String dueDate = rs.getString("due_date");
                String priority = rs.getString("priority");
                String username = rs.getString("username");
                String password = rs.getString("password");

                // Create Todo object and add to the list
                todos.add(new Todo(id, title, description, dueDate, priority, username, password));
            }
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
        return todos;
    }

    
    
   public static int addMemberToDatabase(String nama, String jenisKelamin, String nik, String noHp, String alamat) {
    String checkSql = "SELECT COUNT(*) FROM members WHERE nik = ?";
    String insertSql = "INSERT INTO members (nama, jenis_kelamin, nik, no_hp, alamat) VALUES (?, ?, ?, ?, ?)";

    try (Connection connection = DBUtil.getConnection()) {
        // Cek apakah NIK sudah ada di database
        try (PreparedStatement checkStmt = connection.prepareStatement(checkSql)) {
            checkStmt.setString(1, nik);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                // Tampilkan pesan menggunakan JOptionPane
                JOptionPane.showMessageDialog(null, "NIK sudah terdaftar. Silakan gunakan NIK yang berbeda.", 
                                              "Info", JOptionPane.INFORMATION_MESSAGE);
                return 0; // Kode 0 menandakan NIK sudah ada
            }
        }

        // Jika NIK belum ada, lakukan proses INSERT
        try (PreparedStatement insertStmt = connection.prepareStatement(insertSql)) {
            insertStmt.setString(1, nama);
            insertStmt.setString(2, jenisKelamin);
            insertStmt.setString(3, nik);
            insertStmt.setString(4, noHp);
            insertStmt.setString(5, alamat);

            int rowsAffected = insertStmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan.", 
                                              "Sukses", JOptionPane.INFORMATION_MESSAGE);
                return 1; // Kode 1 menandakan data berhasil disimpan
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menyimpan data.", 
                                              "Error", JOptionPane.ERROR_MESSAGE);
                return -1; // Kode -1 menandakan kegagalan penyimpanan
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), 
                                      "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        return -1;
    }
}

     
    // Method to add new TODO item to the database
  public static int addAnggota(String field1, long field2, long field3, String field4, String field5, String password) throws SQLException {
    Connection connection = dbUtil.getConnection();  // Mendapatkan koneksi dari dbUtil
    try (PreparedStatement stmt = connection.prepareStatement(INSERT_SQL)) {
        // Menyiapkan data untuk statement
        stmt.setString(1, field1);  // field1 -> String
        stmt.setLong(2, field2);    // field2 -> long
        stmt.setLong(3, field3);    // field3 -> long
        stmt.setString(4, field4);  // field4 -> String
        stmt.setString(5, field5);  // field5 -> String
        stmt.setString(6, password);  // password -> String

        // Menjalankan query INSERT
        int result = stmt.executeUpdate();  // Eksekusi query insert ke database

        if (result == 0) {  // Jika tidak ada baris yang terpengaruh
            throw new SQLException("Gagal memasukkan data ke dalam database.");
        }

        return result;  // Mengembalikan jumlah baris yang terpengaruh
    } finally {
        dbUtil.closeConnection(connection);  // Pastikan koneksi ditutup
    }
}




    // Override toString for debugging
    @Override
    public String toString() {
        return "TodoModel{" +
                "id=" + id +
                ", field1='" + field1 + '\'' +
                ", field2=" + field2 +
                ", field3=" + field3 +
                ", field4='" + field4 + '\'' +
                ", field5='" + field5 + '\'' +
                '}';
    }
}




