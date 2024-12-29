class Mobil {
  public void jalan() {
    System.out.println("Mobil berjalan...");
  }
}

class Pengemudi {
  private Mobil mobil;

  public Pengemudi(Mobil mobil) {
    this.mobil = mobil;
  }

  public void mulaiPerjalanan() {
    mobil.jalan();
  }
}

public class Dempedency{
  public static void main(String[] args) {
    Mobil mobil = new Mobil();
    Pengemudi pengemudi = new Pengemudi(mobil);
    pengemudi.mulaiPerjalanan();
  }
}
