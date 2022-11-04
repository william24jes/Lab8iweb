package Daos;

import Beans.Heroes;

import java.sql.*;
import java.util.ArrayList;

public class DaoHeroe {

    public ArrayList<Heroes> obtenerlistaHeroes(){
        ArrayList<Heroes> listaHeroes = new ArrayList<>();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/l6_20203368";
        String sql = "SELECT * FROM heroes";

        try(Connection connection = DriverManager.getConnection(url,"root","root");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while(rs.next()){
                Heroes Heroes = new Heroes();

                Heroes.setIdHeroe(rs.getInt(1));
                Heroes.setNombre(rs.getString(2));
                Heroes.setEdad(rs.getInt(3));
                Heroes.setNivel(rs.getInt(  4));
                Heroes.setPuntosDeExperiencia(rs.getInt(5));
                Heroes.setPareja(rs.getString(6));
                Heroes.setGenero(rs.getString(7));
                Heroes.setClase(rs.getString(8));
                Heroes.setAtaque(rs.getInt(9));

                listaHeroes.add(Heroes);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaHeroes;
    }



}
