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

  public Mobil(String merk, String tipeMesin) {
    this.merk = merk;
    this.mesin = new Mesin(tipeMesin);
  }

  public void tampilkanInfo() {
    System.out.println("Mobil merk: " + merk + ", Mesin: " + mesin.getTipe());
  }
}

public class Composition {
  public static void main(String[] args) {
    Mobil mobil = new Mobil("Honda", "V6");
    mobil.tampilkanInfo();
  }
}
