class Siswa {
  private String nama;

  public Siswa(String nama) {
    this.nama = nama;
  }

  public String getNama() {
  return nama;
  }
}

class Sekolah {
  private String namaSekolah;

  public Sekolah(String namaSekolah) {
  this.namaSekolah = namaSekolah;
                  }

  public void daftarSiswa(Siswa siswa) {
    System.out.println(siswa.getNama() + " telah mendaftar di " + namaSekolah);
  }
}

public class Asosiation {
  public static void main(String[] args) {
    Siswa siswa = new Siswa("Budi");
    Sekolah sekolah = new Sekolah("Politeknik Elektronika Negeri Surabaya");
    sekolah.daftarSiswa(siswa);
  }
}
