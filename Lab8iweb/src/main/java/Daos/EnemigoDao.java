package Daos;

import Beans.Enemigo;

import java.sql.*;
import java.util.ArrayList;

public class EnemigoDao {
    public ArrayList<EnemigoDao> obtenerListaUsuarios() {

        ArrayList<Enemigo> listaEnemigos = new ArrayList<>();

        try {
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/l6_20203368";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();

            //ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");
            ResultSet rs = stmt.executeQuery( "SELECT * FROM enemigos";
            while (rs.next()) {
                Enemigo enemigo = new Enemigo();

                enemigo.setNombre(rs.getString(2));
                enemigo.setEdad(rs.getInt(3));
                heroe.setNivel(rs.getInt(  4));
                heroe.setPuntosDeExperiencia(rs.getInt(5));
                heroe.setPareja(rs.getString(6));
                heroe.setGenero(rs.getString(7));
                heroe.setClase(rs.getString(8));
                heroe.setAtaque(rs.getInt(9));

                listaHeroes.add(heroe);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaUsuarios;

    }

}
