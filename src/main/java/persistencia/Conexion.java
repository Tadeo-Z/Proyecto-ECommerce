/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
* @author yalam
 */
public class Conexion {

    private String USERNAME = "root";
    private String PASSWORD = "";
    private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE = "ecommerce";
    private String CLASSNAME = "com.mysql.cj.jdbc.Driver";
    private String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
    /**
     * Atributo Conexion
     */
    protected Connection con;


    /**
     * Constructor de la clase Conexion que establece una conexión a la base de
     * datos.
     */

    public Conexion() {
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (ClassNotFoundException e) {
            System.err.println("Error en: " + e);
        } catch (SQLException e) {
            System.err.println("Error en: " + e);
        }
    }


    /**
     * Obtiene la conexión a la base de datos.
     *
     * @return La conexión a la base de datos.
     */

    public Connection getConexion() {
        return con;
    }
}
