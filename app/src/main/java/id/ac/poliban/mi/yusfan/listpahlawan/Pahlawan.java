package id.ac.poliban.mi.yusfan.listpahlawan;

public class Pahlawan {
    private String pahlawan;
    private String pahlawanName;
    private String pahlawanDesc;

    public Pahlawan(String pahlawan, String pahlawanName, String pahlawanDesc) {
        this.pahlawan = pahlawan;
        this.pahlawanName = pahlawanName;
        this.pahlawanDesc = pahlawanDesc;
    }

    public String getPahlawan() {
        return pahlawan;
    }

    public void setPahlawan(String pahlawan) {
        this.pahlawan = pahlawan;
    }

    public String getPahlawanName() {
        return pahlawanName;
    }

    public void setPahlawanName(String pahlawanName) {
        this.pahlawanName = pahlawanName;
    }

    public String getPahlawanDesc() {
        return pahlawanDesc;
    }

    public void setPahlawanDesc(String pahlawanDesc) {
        this.pahlawanDesc = pahlawanDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getPahlawanName(), getPahlawanDesc());
    }
}
