public abstract class BangunDatar {
    protected String warna;
    protected String border;

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }
}