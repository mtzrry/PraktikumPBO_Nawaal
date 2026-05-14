package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {
    Connection koneksi = null;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public void add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement s = koneksi.prepareStatement(sql)) {
            s.setInt(1, mhs.getId());
            s.setString(2, mhs.getNama());
            s.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement s = koneksi.prepareStatement(sql)) {
            s.setString(1, mhs.getNama());
            s.setInt(2, mhs.getId());
            s.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement s = koneksi.prepareStatement(sql)) {
            s.setInt(1, id);
            s.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        String sql = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement s = koneksi.prepareStatement(sql)) {
            s.setInt(1, id);
            ResultSet rs = s.executeQuery();
            if (rs.next()) {
                mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhs;
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        try (Statement s = koneksi.createStatement();
             ResultSet rs = s.executeQuery(sql)) {
            while (rs.next()) {
                listMhs.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMhs;
    }
}