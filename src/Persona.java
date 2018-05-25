
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;

public class Persona extends PersonaApp.PersonaPOA{
    
     private ORB orb;
    Conexion conex = new Conexion();

    @Override
    public boolean insertarPersona(int id, String nombre, String apellido, String direccion, String genero, String estado) {
 boolean resultado = false;
        try {
            String query = "Insert into persona(id,nombre,apellido,direccion,genero,estado)"
                    + "values ('"+id+"','"+nombre+"','"+apellido+"','"+direccion+"','"+genero+"','"+estado+"')";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            int valor = st.executeUpdate(query);
            if(valor > 0){
                resultado = true;
            }
            //Cerramos recursos
            st.close();
            conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + e.getMessage());
        }
        return resultado;    }

    @Override
    public boolean eliminarPersona(int id) {
 boolean resultado = false;
        try {
            String query = "Delete from persona where id = "+id;
            conex.conexion();
            Statement st = conex.conex.createStatement();
            int valor = st.executeUpdate(query);
            if(valor > 0){
                resultado = true;
            }
            //Cerramos recursos
            st.close();
            conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + e.getMessage());
        }
        return resultado;    }

    @Override
    public boolean actualizarPersona(int id, String nombre, String apellido, String direccion, String genero, String estado) {
 boolean resultado = false;
        try {
            String query = "Delete from persona where id = "+id;
            conex.conexion();
            Statement st = conex.conex.createStatement();
            int valor = st.executeUpdate(query);
            if(valor > 0){
                resultado = true;
            }
            //Cerramos recursos
            st.close();
            conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + e.getMessage());
        }
        return resultado;    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ResultSet listaEstados(){
        ResultSet resultado = null;
        
        try {
            String query = "Select id, nombre from estado";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            resultado = st.executeQuery(query);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " +e.getMessage());
        }
        
        return resultado;
    }
    
    public ResultSet listaGenero(){
        ResultSet resultado = null;
        
        try {
            String query = "Select id, nombre from genero";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            resultado = st.executeQuery(query);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " +e.getMessage());
        }
        
        return resultado;
    }
    
    public ResultSet cargarTablaPersona(){
        ResultSet resultado = null;
        try {
            String query = "Select id, nombre, apellido, direccion, genero, estado from persona";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            resultado = st.executeQuery(query);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + e.getMessage());
        }
        return resultado;
    }
    
}
