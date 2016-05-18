
public abstract class AlatMusikPetik implements AlatMusik{
    private String nama;
    AlatMusikPetik(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    @Override
    public void caraMain() {
        System.out.println("Dimainkan dengan cara dipetik.");
    }
}
