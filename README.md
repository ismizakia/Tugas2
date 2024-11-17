## Identitas
- Nama  : Ismi Zakia
- NPM  : 2210010020
- Kelas  : 5B Non Reguler Banjarmasin
  
# TemperatureConverterApp

**TemperatureConverterApp** adalah aplikasi berbasis GUI (Graphical User Interface) untuk mengonversi suhu antara berbagai skala suhu, seperti Celsius, Fahrenheit, Kelvin, dan Reamur. Aplikasi ini memungkinkan pengguna untuk mengonversi suhu dari atau ke Celsius.

## Fitur

- **Pilihan Skala Konversi**:
  - Dari Celsius ke Fahrenheit, Kelvin, atau Reamur.
  - Dari Fahrenheit, Kelvin, atau Reamur ke Celsius.
- **Validasi Input**:
  - Input hanya menerima angka atau titik desimal.
- **Antarmuka Pengguna Interaktif**:
  - Antarmuka yang sederhana dan ramah pengguna.

## Prasyarat

- **Java Development Kit (JDK)** versi 8 atau lebih baru.

## Cara Menjalankan

1. **Kloning atau Unduh Proyek**:
   - Kloning repositori ini atau unduh file `.java`.
2. **Kompilasi dan Jalankan Program**:
   - Di terminal:
     ```bash
     javac TemperatureConverterApp.java
     java TemperatureConverterApp
     ```
   - Atau gunakan IDE seperti NetBeans, Eclipse, atau IntelliJ untuk menjalankan file.

## Struktur Antarmuka

1. **Field Input**:
   - Masukkan nilai suhu yang ingin dikonversi.
2. **Radio Button**:
   - Pilih konversi dari atau ke Celsius.
3. **ComboBox Skala Suhu**:
   - Pilih skala target untuk konversi (Fahrenheit, Kelvin, Reamur).
4. **Tombol Konversi**:
   - Klik tombol ini untuk mendapatkan hasil konversi.
5. **Hasil Konversi**:
   - Output hasil konversi akan ditampilkan di bawah antarmuka.

## Penjelasan Kode

### Komponen Utama
1. **JTextField**:
   - Tempat untuk memasukkan suhu yang ingin dikonversi.
   - Validasi untuk memastikan hanya angka yang dapat dimasukkan.
2. **JComboBox**:
   - Menyediakan pilihan skala suhu target (Fahrenheit, Kelvin, Reamur).
3. **JRadioButton**:
   - Opsi untuk memilih arah konversi:
     - Dari Celsius ke skala lain.
     - Dari skala lain ke Celsius.
4. **JLabel**:
   - Menampilkan hasil konversi suhu.
5. **ActionListener**:
   - Digunakan untuk menangani klik tombol konversi.

### Logika Konversi
1. **Dari Celsius**:
   - Fahrenheit: `C × 9/5 + 32`
   - Kelvin: `C + 273.15`
   - Reamur: `C × 4/5`
2. **Ke Celsius**:
   - Fahrenheit: `(F - 32) × 5/9`
   - Kelvin: `K - 273.15`
   - Reamur: `R × 5/4`

## Contoh Penggunaan

1. Jalankan aplikasi.
2. Masukkan suhu di kotak input.
3. Pilih arah konversi:
   - **To Celsius**: Untuk konversi dari Fahrenheit, Kelvin, atau Reamur ke Celsius.
   - **From Celsius**: Untuk konversi dari Celsius ke Fahrenheit, Kelvin, atau Reamur.
4. Pilih skala target pada **ComboBox**.
5. Klik tombol **Konversi** untuk melihat hasilnya.
6. Hasil konversi akan ditampilkan di bagian bawah antarmuka.
