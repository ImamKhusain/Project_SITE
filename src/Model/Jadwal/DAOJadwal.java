package Model.Jadwal;

import Model.Connector;
import Model.ModelJadwal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOJadwal {

    private Connection conn;

    public DAOJadwal() {
        conn = Connector.Connect();
    }

    public List<ModelJadwal> getAllJadwal() {
        List<ModelJadwal> list = new ArrayList<>();
        String query = "SELECT * FROM jadwal";

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                ModelJadwal jadwal = new ModelJadwal(
                    rs.getInt("id"),
                    rs.getString("pertandingan"),
                    rs.getDate("tanggal"),
                    rs.getString("jam"),
                    rs.getString("channel")
                );
                list.add(jadwal);
            }
        } catch (SQLException e) {
            System.out.println("Gagal ambil data jadwal: " + e.getMessage());
        }

        return list;
    }
}
