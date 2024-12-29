class Mesin {
  private String tipe;

  public Mesin(String tipe) {
    this.tipe = tipe;
  }

  public String getTipe() {
    return tipe;
  }
}

class Mobil {
  private String merk;
  private Mesin mesin;
  public Mobil(String merk, Mesin mesin) {
    this.merk = merk;
    this.mesin = mesin;
  }

  public void tampilkanInfo() {
    System.out.println("Mobil merk: " + merk + ", Mesin: " + mesin.getTipe());
  }
}

public class Agregation{
  public static void main(String[] args) {
    Mesin mesin = new Mesin("V8");
    Mobil mobil = new Mobil("Toyota", mesin);
    mobil.tampilkanInfo();
  }
}
