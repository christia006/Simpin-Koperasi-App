# Aplikasi SimPin (Sistem Informasi Simpan Pinjam) - Backend Java
Aplikasi SimPin adalah sistem backend Java untuk manajemen simpan pinjam berbasis desktop. Dibangun menggunakan Java GUI (Kemungkinan menggunakan Swing atau JavaFX) dan terhubung ke database MariaDB. Proyek ini dirancang sebagai solusi manajemen keuangan koperasi kecil atau lembaga simpan pinjam dengan fitur-fitur CRUD dan user-friendly UI.

🚀 Fitur Utama
- 🔐 **Login & Autentikasi**: Sistem login pengguna.
- 👥 **Manajemen Anggota**:  Login ,Night Mode, Change languange ,Tambah,lihat, ubah, hapus data anggota simpan pinjam,dan Menampilkan laporan data simpanan.
- 💰 **Transaksi Simpanan dan Pinjaman**: Catat transaksi simpanan dan pinjaman per anggota.
- 📦 **Modular Struktur**: Menggunakan pemisahan `entity`, `repository`, `model`, dan `view`.
- 🧰 **Utilitas DB**: Koneksi database menggunakan MariaDB Driver.
- 📋 **Manajemen ToDo**: Contoh fitur CRUD yang menunjukkan struktur REST-like modular.
- 📁 **Resource Management**: Aset grafis dikelola terstruktur (`assets/`).
  
- 🧱 Teknologi yang Digunakan
- Bahasa Pemrograman: Java
- Database: MariaDB
- Build Tool: Ant (`build.xml`)
  
- GUI Library: Swing (berdasarkan file `.form` dan `.class`)
  🏗️ Struktur Direktori
├── entity/             # Kelas entitas data seperti `Todo`
├── repository/         # Interface dan implementasi repository
├── model/              # Logika bisnis (seperti TodoModel)
├── view/               # Komponen tampilan
├── component/          # Panel dan UI tambahan
├── util/               # Utility seperti koneksi DB dan helper
├── assets/             # Ikon dan gambar untuk UI
├── lib/                # Driver MariaDB
└── build.xml           # File build Ant

🛠️ Cara Menjalankan
1. Clone repositori:
   git clone https://github.com/username/aplikasi-simpin-backend.git

2. Buka di NetBeans / IntelliJ IDEA / VSCode (dengan plugin Java)

3. Pastikan database MariaDB aktif dan konfigurasi koneksi benar di `DBUtil.java`

4. Compile dan Jalankan via IDE atau Ant:
   ant run

   - Pastikan MariaDB telah diinstal.
- Import struktur database sesuai kebutuhan (belum tersedia di repo ini).
- Periksa dan ubah file `DBUtil.java` untuk menyesuaikan kredensial database.



database :

CREATE TABLE IF NOT EXISTS members (
    id_anggota INT AUTO_INCREMENT PRIMARY KEY,     -- ID Anggota (Auto Increment)
    nama VARCHAR(100) NOT NULL,                    -- Nama Anggota
    jenis_kelamin ENUM('Laki-laki', 'Perempuan') NOT NULL, -- Jenis Kelamin
    nik VARCHAR(20) NOT NULL UNIQUE,               -- NIK (Nomor Induk Kependudukan)
    no_hp VARCHAR(15) NOT NULL,                    -- Nomor HP Anggota
    alamat TEXT NOT NULL,                          -- Alamat Lengkap Anggota
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP -- Waktu Data Dimasukkan
) ENGINE=INNODB; -- Pastikan menggunakan InnoDB

-- Buat tabel 'pinjaman'
CREATE TABLE IF NOT EXISTS pinjaman (
    id_pinjaman INT PRIMARY KEY,                   -- ID Pinjaman
    id_anggota INT,                                -- ID Anggota (Harus Sama dengan Tipe di 'members')
    jumlah INT NOT NULL,                           -- Jumlah Pinjaman
    no_rek INT(6) NOT NULL,                        -- No Rekening (6 Digit)
    tanggal INT NOT NULL,                          -- Tanggal Pinjaman
    bulan INT NOT NULL,                            -- Bulan Pinjaman
    tahun INT NOT NULL,                            -- Tahun Pinjaman
    status_pinjaman ENUM('Disetujui', 'Ditolak', 'Menunggu', 'Lunas') NOT NULL, -- Status Pinjaman
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Waktu Data Dimasukkan
    FOREIGN KEY (id_anggota) REFERENCES members(id_anggota) -- Hubungkan ke members.id_anggota
        ON DELETE CASCADE                           -- Hapus otomatis jika anggota dihapus
        ON UPDATE CASCADE
) ENGINE=INNODB; -- Pastikan menggunakan InnoDB




