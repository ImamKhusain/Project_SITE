package Model;

import java.sql.Date;

public class ModelJadwal {
    private int id;
    private String pertandingan;
    private Date tanggal;
    private String jam;
    private String channel;

    public ModelJadwal() {}

    public ModelJadwal(int id, String pertandingan, Date tanggal, String jam, String channel) {
        this.id = id;
        this.pertandingan = pertandingan;
        this.tanggal = tanggal;
        this.jam = jam;
        this.channel = channel;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPertandingan() {
        return pertandingan;
    }

    public void setPertandingan(String pertandingan) {
        this.pertandingan = pertandingan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
