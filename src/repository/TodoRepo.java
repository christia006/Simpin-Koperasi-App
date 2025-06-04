package repository;

import entity.Todo;
import java.lang.reflect.Member;
import model.TodoModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mariadb.jdbc.Connection;
import util.DBUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TodoRepo implements ITodoRepo {
  


 
    
 //////
    
    public int hapuslah(String idAnggota) {
    String sqlCheck = "SELECT COUNT(*) FROM simpanan WHERE id_anggota = ?";  // Cek apakah ID anggota ada di tabel simpanan
    String sqlDelete = "DELETE FROM simpanan WHERE id_anggota = ?";  // Query untuk menghapus berdasarkan ID anggota

    try (Connection connection = (Connection) DBUtil.getConnection(); 
         PreparedStatement checkStmt = connection.prepareStatement(sqlCheck)) {
        
        // Set parameter ID anggota ke query untuk pengecekan
        checkStmt.setString(1, idAnggota);

        // Eksekusi query untuk cek apakah ID anggota ada
        ResultSet rs = checkStmt.executeQuery();
        if (rs.next() && rs.getInt(1) > 0) {
            // ID anggota ditemukan, lanjutkan dengan penghapusan
            try (PreparedStatement deleteStmt = connection.prepareStatement(sqlDelete)) {
                deleteStmt.setString(1, idAnggota);  // Set parameter ID anggota ke query untuk penghapusan
                int rowsAffected = deleteStmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data berhasil dihapus.");
                    return 1;  // Berhasil menghapus data
                } else {
                    System.out.println("Gagal menghapus data. ID anggota tidak ditemukan.");
                    return -1;  // Data tidak ditemukan
                }
            }
        } else {
            System.out.println("ID anggota tidak ditemukan.");
            return -1;  // ID anggota tidak ditemukan
        }

    } catch (SQLException e) {
        e.printStackTrace();
        return -1;  // Terjadi kesalahan saat penghapusan
    }
}

    
///hapus pinjaman
    
  public int hapuspinjaman(String idAnggota) {
    String sqlCheck = "SELECT COUNT(*) FROM pinjaman WHERE idAnggota = ?";  // Cek apakah ID anggota ada di tabel pinjaman
    String sqlDelete = "DELETE FROM pinjaman WHERE idAnggota = ?";  // Query untuk menghapus berdasarkan ID anggota

    try (Connection connection = (Connection) DBUtil.getConnection(); 
         PreparedStatement checkStmt = connection.prepareStatement(sqlCheck)) {
        
        // Set parameter ID anggota ke query untuk pengecekan
        checkStmt.setString(1, idAnggota);

        // Eksekusi query untuk cek apakah ID anggota ada
        ResultSet rs = checkStmt.executeQuery();
        if (rs.next() && rs.getInt(1) > 0) {
            // ID anggota ditemukan, lanjutkan dengan penghapusan
            try (PreparedStatement deleteStmt = connection.prepareStatement(sqlDelete)) {
                deleteStmt.setString(1, idAnggota);  // Set parameter ID anggota ke query untuk penghapusan
                int rowsAffected = deleteStmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data berhasil dihapus.");
                    return 1;  // Berhasil menghapus data
                } else {
                    System.out.println("Gagal menghapus data.");
                    return -1;  // Gagal menghapus data meskipun ID anggota ditemukan
                }
            }
        } else {
            System.out.println("ID anggota tidak ditemukan di tabel pinjaman.");
            return -1;  // ID anggota tidak ditemukan
        }

    } catch (SQLException e) {
        e.printStackTrace();
        return -1;  // Terjadi kesalahan saat penghapusan
    }
}


    
    
    
    /// hapus data anggota
    
public int deleteMemberFromDatabase(String nik) {
    String sql = "DELETE FROM members WHERE nik = ?";  // Query to delete based on NIK
    
    try (Connection connection = (Connection) DBUtil.getConnection(); 
         PreparedStatement stmt = connection.prepareStatement(sql)) {
        
        // Set parameter NIK to the query
        stmt.setString(1, nik);
        
        // Execute the query to delete data
        int rowsAffected = stmt.executeUpdate();
        
        // Check if deletion was successful
        if (rowsAffected > 0) {
            System.out.println("Data berhasil dihapus.");
            return 1;  // Successfully deleted data
        } else {
            System.out.println("Gagal menghapus data. NIK tidak ditemukan.");
            return -1;  // Data not found
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return -1;  // Error occurred during deletion
    }
}


public int addkan(int idAnggota, String namaAnggota, String jenisSimpanan, double jumlah, int tanggal, int bulan, int tahun) {
    // SQL query untuk menyimpan data ke dalam tabel `simpanan`
    String sql = "INSERT INTO simpanan (id_anggota, nama_anggota, jenis_simpanan, jumlah, tanggal, bulan, tahun) VALUES (?, ?, ?, ?, ?, ?, ?)";

    try (Connection connection = (Connection) DBUtil.getConnection();  // Dapatkan koneksi dari utilitas database
         PreparedStatement stmt = connection.prepareStatement(sql)) {

        // Set parameter ke dalam SQL query
        stmt.setInt(1, idAnggota);         // ID Anggota
        stmt.setString(2, namaAnggota);    // Nama Anggota
        stmt.setString(3, jenisSimpanan);  // Jenis Simpanan
        stmt.setDouble(4, jumlah);            // Jumlah Simpanan
        stmt.setInt(5, tanggal);           // Tanggal Simpanan
        stmt.setInt(6, bulan);             // Bulan Simpanan
        stmt.setInt(7, tahun);             // Tahun Simpanan

        // Eksekusi query dan cek jumlah baris yang terpengaruh
        int rowsAffected = stmt.executeUpdate();
        return rowsAffected > 0 ? 1 : -1; // Return 1 jika sukses, -1 jika gagal

    } catch (SQLException e) {
        // Tangani kesalahan SQL
        System.err.println("Database error: " + e.getMessage());
        e.printStackTrace();
        return -1; // Return -1 jika terjadi kesalahan
    }
}



public int getJumlahData() throws SQLException {
        String sql = "SELECT COUNT(*) FROM members"; // SQL to count data
        int count = 0;
        
        try (Connection connection = (Connection) DBUtil.getConnection(); 
             PreparedStatement stmt = connection.prepareStatement(sql); 
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                count = rs.getInt(1); // Get the count from the first column
            }
        } catch (SQLException e) {
            System.err.println("Error while fetching the data count: " + e.getMessage());
            throw e; // Re-throw the exception to be handled by the caller
        }

        return count;
    }


  
    /// Simpan data yang ditambah 
    public void loadMembersFromDatabase(DefaultTableModel model) {
    // Define the SQL query to fetch member data from the database
    String query = "SELECT * FROM members"; // Assuming your table is named 'members'

    try (Connection connection = (Connection) DBUtil.getConnection(); 
         PreparedStatement stmt = connection.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        // Clear the model to ensure it's empty before loading new data
         while (rs.next()) {
            String nama = rs.getString("nama");
            String jenisKelamin = rs.getString("jenis_kelamin");
            String nik = rs.getString("nik");
            String noHp = rs.getString("no_hp");
            String alamat = rs.getString("alamat");
            
            model.addRow(new Object[]{model.getRowCount() + 1, nama, jenisKelamin, nik, noHp, alamat});
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    
 //// panel pinjaman cloud data nya   
  public void loadpinjaman(DefaultTableModel model) {
    // Define the SQL query to fetch data from the 'pinjaman' table
    String query = "SELECT * FROM pinjaman"; // Fetching all rows from the 'pinjaman' table

    try (Connection connection = (Connection) DBUtil.getConnection(); 
         PreparedStatement stmt = connection.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        // Clear the model to ensure it's empty before loading new data
        model.setRowCount(0); // Clears existing rows

        // Iterate through the result set to load data into the table model
        while (rs.next()) {
            // Fetch the values from the result set
            int idAnggota = rs.getInt("idAnggota");
            String namaAnggota = rs.getString("namaAnggota");
            String jenisPinjaman = rs.getString("jenisPinjaman");
            int jumlah = rs.getInt("jumlah");
            int noRek = rs.getInt("no_rek");
            int tanggal = rs.getInt("tanggal");
            int bulan = rs.getInt("bulan");
            int tahun = rs.getInt("tahun");

            // Add the data to the table model
            model.addRow(new Object[]{
               
                idAnggota,               // ID Anggota
                namaAnggota,             // Nama Anggota
                jenisPinjaman,           // Jenis Pinjaman
                jumlah,                  // Jumlah
                noRek,                   // No Rekening
                tanggal,                 // Tanggal
                bulan,                   // Bulan
                tahun                    // Tahun
            });
        }
    } catch (SQLException e) {
        // Print the error stack trace if an SQL exception occurs
        e.printStackTrace();
    }
}

    
 public void cloudkan(DefaultTableModel model) {
    // Define the SQL query to fetch member data from the database
    String query = "SELECT * FROM simpanan"; // Mengambil semua data dari tabel 'simpanan'

    try (Connection connection = (Connection) DBUtil.getConnection(); 
         PreparedStatement stmt = connection.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        // Clear the model to ensure it's empty before loading new data
        model.setRowCount(0); // Pastikan model kosong sebelum menambahkan data baru

        while (rs.next()) {
            int idAnggota = rs.getInt("id_anggota");
            String jenisSimpanan = rs.getString("jenis_simpanan");
            int jumlahSimpanan = rs.getInt("jumlah");
            int tanggal = rs.getInt("tanggal");
            int bulan = rs.getInt("bulan");
            int tahun = rs.getInt("tahun");
            String status = rs.getString("status"); // Menambahkan kolom status

            model.addRow(new Object[]{
                model.getRowCount() + 1,          // No. Urut
                idAnggota,                        // ID Anggota
                jenisSimpanan,                    // Jenis Simpanan
                jumlahSimpanan,                   // Jumlah Simpanan
                tanggal,                          // Tanggal Simpanan
                bulan,                            // Bulan Simpanan
                tahun,                            // Tahun Simpanan
                status                            // Status Simpanan
            });
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

 
    
    
@Override
public int addMemberToDatabase(String nama, String jenisKelamin, String nik, String noHp, String alamat) {
    if (isNullOrEmpty(nama, jenisKelamin, nik, noHp, alamat)) {
        System.out.println("Validation failed: Some fields are blank.");
        return -1; // Return -1 if any field is empty
    }

    // Validate and parse NIK and No HP into long
    long nikLong = parseLongSafely(nik);
    long noHpLong = parseLongSafely(noHp);
    if (nikLong == -1 || noHpLong == -1) {
        System.out.println("Validation failed: Invalid number format for NIK or No HP.");
        return -1; // Return -1 if the number format is invalid
    }

    System.out.println("Parsed NIK: " + nikLong + ", No HP: " + noHpLong);

    // Save data to database using the static method
    int result = TodoModel.addMemberToDatabase(nama, jenisKelamin, nik, noHp, alamat);
    if (result == -1) {
        System.out.println("Failed to add data to the database.");
    } else {
        System.out.println("Successfully registered member.");
    }
    return result;
}
// Helper Method untuk validasi string kosong atau null
private boolean isNullOrEmpty(String... values) {
    for (String value : values) {
        if (value == null || value.trim().isEmpty()) {
            return true;
        }
    }
    return false;
}
//  Method untuk parsing angka secara aman
private long parseLongSafely(String value) {
    try {
        return Long.parseLong(value);
    } catch (NumberFormatException e) {
        System.err.println("Invalid number format: " + value);
        return -1; // Kembalikan -1 jika parsing gagal
    }
}

////////////
  @Override
public int registerTodo(String field1, String field2, String field3, String field4, String field5, String password) {
    // Validasi input agar tidak kosong
    if (isNullOrEmpty(field1, field2, field3, field4, field5, password)) {
        System.out.println("Validation failed: Some fields are blank.");
        return -1; // Data tidak lengkap
    }

    // Validasi dan parsing field2 dan field3 ke tipe long
    long field2Long = parseLongSafely(field2);
    long field3Long = parseLongSafely(field3);
    if (field2Long == -1 || field3Long == -1) {
        System.out.println("Validation failed: Invalid number format for field2 or field3.");
        return -1; // Format angka tidak valid
    }

    System.out.println("Parsed field2: " + field2Long + ", field3: " + field3Long);

    // Simpan data ke database
    try {
        int result = TodoModel.addAnggota(field1, field2Long, field3Long, field4, field5, password);
        if (result <= 0) {
            System.out.println("Failed to add data to the database. Result: " + result);
            return -1; // Gagal menambahkan data
        }

        System.out.println("Successfully registered Todo with result: " + result);
        return result; // Sukses menambahkan data
    } catch (SQLException e) {
        System.err.println("Database error: " + e.getMessage());
        Logger.getLogger(TodoRepo.class.getName()).log(Level.SEVERE, null, e);
        return -1; // Error saat berinteraksi dengan database
    }
}
@Override
public List<Todo> fetchAllTodos() {
    List<Todo> todos = new ArrayList<>();
    String query = "SELECT * FROM todos"; // Adjust query to your table structure

    try (Connection connection = (Connection) DBUtil.getConnection();
         PreparedStatement stmt = connection.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            // Create Todo object and map the ResultSet fields to Todo fields
            Todo todo = new Todo(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getString("due_date"),
                    rs.getString("priority"),
                    rs.getString("username"),
                    rs.getString("password")
            );
            todos.add(todo);
        }

    } catch (SQLException e) {
        System.err.println("Error fetching todos: " + e.getMessage());
        e.printStackTrace();
    }
    return todos;
}
}


