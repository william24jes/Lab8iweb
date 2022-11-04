package Daos;

import Beans.Enemigo;

import java.sql.*;
import java.util.ArrayList;

public class EnemigoDao {
    public ArrayList<Enemigo> obtenerListaEnemigos() {

        ArrayList<Enemigo> listaEnemigos = new ArrayList<>();

        try {
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/lab8";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();

            //ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");
            ResultSet rs = stmt.executeQuery( "SELECT * FROM enemigos");
            while (rs.next()) {
                Enemigo enemigo = new Enemigo();

                enemigo.setNombre(rs.getString(2));

                enemigo.setAtaque(rs.getInt(3));
                enemigo.setExperienciaxDerrota(rs.getInt(  4));
                enemigo.setObjetoDejado(rs.getString(5));

                listaEnemigos.add(enemigo);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return listaEnemigos;

    }

}
