package Daos;

import Beans.Enemigo;
import Beans.Hechizo;

import java.sql.*;
import java.util.ArrayList;

public class HechizoDao {
    public ArrayList<Hechizo> obtenerListaHechizo() {

        ArrayList<Hechizo> listaHechizos = new ArrayList<>();

        try {
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/l8";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();

            //ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");
            ResultSet rs = stmt.executeQuery( "SELECT * FROM hechizos");
            while (rs.next()) {
                Hechizo hechizo = new Hechizo();

                hechizo.setNombre(rs.getString(2));

                hechizo.setPotenciaDeHechizo(rs.getInt(3));
                hechizo.setPrecisionDeHechizo(rs.getInt(  4));
                hechizo.setNivelAprendizaje(rs.getInt(5));
                hechizo.setElemento(rs.getString(6));


                listaHechizos.add(hechizo);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return listaHechizos;

    }
}
