package Controller;

import Model.Jadwal.DAOJadwal;
import Model.Jadwal.ModelJadwal;
import View.Admin.HomeAdmin;
import View.Guest.HomeGuest;

import javax.swing.table.DefaultTableModel;

public class ControllerHomeAdmin {

    private HomeAdmin view;
    private HomeGuest viewJadwal;
    private DAOJadwal dao;

    public ControllerHomeAdmin(HomeAdmin view) {
        this.view = view;
        this.dao = new DAOJadwal();
    }
     public ControllerHomeAdmin(HomeGuest viewJadwal) {
        this.viewJadwal = viewJadwal;
        this.dao = new DAOJadwal();
    }

    public void tampilkanDataJadwal() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("PERTANDINGAN");
        model.addColumn("TANGGAL");
        model.addColumn("JAM");
        model.addColumn("CHANNEL");

        for (ModelJadwal jadwal : dao.getAllJadwal()) {
            Object[] row = new Object[] {
                jadwal.getId(),
                jadwal.getPertandingan(),
                jadwal.getTanggal(),
                jadwal.getJam(),
                jadwal.getChannel()
            };
            model.addRow(row);
        }

        view.getTabel_Jadwal().setModel(model);
    }
     public void tampilkanDataJadwalGuest() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("PERTANDINGAN");
        model.addColumn("TANGGAL");
        model.addColumn("JAM");
        model.addColumn("CHANNEL");

        for (ModelJadwal jadwal : dao.getAllJadwal()) {
            Object[] row = new Object[] {
                jadwal.getId(),
                jadwal.getPertandingan(),
                jadwal.getTanggal(),
                jadwal.getJam(),
                jadwal.getChannel()
            };
            model.addRow(row);
        }

        viewJadwal.getTabel_Jadwal().setModel(model);
    }
}
