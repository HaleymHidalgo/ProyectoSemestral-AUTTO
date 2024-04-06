package proyectosemestral.Controlador;

import proyectosemestral.Modelo.Cliente;
import proyectosemestral.Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Haleym Hidalgo
 */
public class CtrlReportes {
    //Metodos Propios
    public List<Cliente> buscarClientes(){
        List<Cliente> listaClientes = new ArrayList<Cliente>();

        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT * FROM cliente";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                //Obtenemos los datos
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getString("id_cliente"));
                cliente.setTipoCliente(rs.getString("tipo_cliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellidoP(rs.getString("apellidop"));
                cliente.setApellidoM(rs.getString("apellidom"));
                cliente.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setEstado(rs.getBoolean("estado"));
                //Guardamos el cliente en la Lista
                System.out.println(cliente.toString());
                listaClientes.add(cliente); 
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar Cliente: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar Cliente: " + e.getMessage());
        }
        //Devolvemos la Lista con los Clientes 
        System.out.println(listaClientes);
        return listaClientes;
    }
    
    public ArrayList<ArrayList<Object>> buscarClientesTOP() {
        ArrayList<ArrayList<Object>> listaEmpleados = new ArrayList<>();

        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT rut_empleado, COUNT(rut_empleado) AS cantidad_arriendos FROM arriendo GROUP BY rut_empleado ORDER BY cantidad_arriendos DESC";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // Obtenemos los datos
                String rutEmpleado = rs.getString("rut_empleado");
                int cantidadArriendos = rs.getInt("cantidad_arriendos");

                // Creamos un ArrayList para almacenar los datos de un empleado
                ArrayList<Object> datosEmpleado = new ArrayList<>();
                datosEmpleado.add(rutEmpleado);
                datosEmpleado.add(cantidadArriendos);

                // Guardamos el empleado en la lista
                listaEmpleados.add(datosEmpleado);
            }

            // Cerramos los recursos
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar Cliente: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar Cliente: " + e.getMessage());
        }

        // Devolvemos la lista con los empleados
        return listaEmpleados;
    }

    public int totalArriendos(){
        int total = 0;
        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT SUM(precio) AS 'total' FROM arriendo";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Obtenemos los datos
                total = rs.getInt("total");
                System.out.println(total);
            }

            // Cerramos los recursos
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar Cliente: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar Cliente: " + e.getMessage());
        }

        // Devolvemos la lista con los empleados
        return total;
    }
}
