# 🚀 Katalon Studio Automation: DemoBlaze Web UI Testing Portfolio

Proyek ini merupakan portofolio **Automation Testing** untuk platform e-commerce **DemoBlaze**. Dibuat menggunakan **Katalon Studio**, proyek ini bertujuan untuk memvalidasi fungsionalitas end-to-end, mulai dari manajemen akun hingga proses kalkulasi harga di keranjang belanja.

## 📌 Deskripsi Proyek
Otomatisasi ini mencakup pengujian fungsionalitas utama pada website DemoBlaze untuk memastikan sistem berjalan stabil, data konsisten, dan logika bisnis (seperti perhitungan harga) akurat.

## 📋 Struktur Pengujian (Total 23 Test Cases)

Proyek ini terdiri dari **23 Test Cases** yang terbagi dalam 5 modul utama:

### 1. 🏠 Modul Home & Navigation (9 Test Cases)
* `Send contact submission`: Validasi pengiriman pesan bantuan.
* `Verify about us page`: Memastikan konten video/informasi perusahaan muncul.
* `Verify cart page`: Validasi navigasi ke halaman keranjang.
* `Verify contact page`: Validasi akses ke formulir kontak.
* `Verify Log out function`: Memastikan sesi user berakhir dengan benar.
* `Verify logo product to home`: Fungsi navigasi logo untuk kembali ke beranda.
* `Verify Price Consistency`: Memastikan harga di halaman utama sama dengan halaman detail.
* `Verify product detail page (pdp)`: Validasi tampilan informasi produk.
* `Verify Slide page in Home`: Memastikan banner slider berfungsi normal.

### 2. 🛒 Modul Cart and Checkout (6 Test Cases)
* **`Verify math calculation product`**: Validasi logika matematika harga barang secara dinamis.
* `Add product to cart and verify`: Memastikan barang berhasil masuk ke keranjang.
* `Delete product in the cart`: Fungsi menghapus barang dari daftar belanja.
* `Checkout with valid data`: Proses pembelian hingga selesai dengan data lengkap.
* `Checkout with empty data`: (Negative) Validasi alert jika data kosong.
* `Checkout with only name and number credit card`: Validasi input minimal.

### 3. 🔑 Modul Login (2 Test Cases)
* `Login with valid data`: Akses masuk dengan akun terdaftar.
* `Login with invalid data`: (Negative) Penanganan error saat username/password salah.

### 4. 📝 Modul Register (3 Test Cases)
* `Register with new data`: Membuat akun baru dengan data unik.
* `Register using data exist`: (Negative) Validasi jika user sudah terdaftar.
* `Register with empty field`: (Negative) Validasi jika form registrasi kosong.

### 5. 📂 Modul Category (3 Test Cases)
* `Verify phone category`: Validasi filter produk kategori handphone.
* `Verify Laptop category`: Validasi filter produk kategori laptop.
* `Verify monitor category`: Validasi filter produk kategori monitor.

## 🛠️ Tech Stack & Tools
* **Automation Tool:** Katalon Studio
* **Language:** Groovy / Java
* **Browser:** Google Chrome (Headless/Headed)
* **Library:** Selenium WebDriver (via Katalon)
