
package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

public class Persona {
    String dui_nuevo;

    public String getDui_nuevo() {
        return dui_nuevo;
    }

    public void setDui_nuevo(String dui_nuevo) {
        this.dui_nuevo = dui_nuevo;
    }
    String dui;
    String nombres;
    String apellidos;
    
    
    Connection cnn;
    Statement state;
    ResultSet result;

    public Persona() {
        try {
            Class.forName("com.mysql.jdbc.Driver");//Driver de la base de datos
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_recurso_humano", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Persona(String dui, String nombres, String apellidos) {
        this.dui = dui;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    public boolean insertarDatos(){
        try{
            String myQuery = "insert into tb_persona values ('" + dui + "', '" + nombres + "', '" + apellidos + "');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(myQuery);
            if(estado == 1){
                return true;
            }
        }catch(SQLException ex){
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean modificarDatos(){
        try{
            String myQuery = "update tb_persona set dui_persona='" + dui + "', nombre_persona = '" + nombres + "', apellidos_persona='" + apellidos+"' where dui_persona='" + dui_nuevo+"'";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(myQuery);
            if(estado == 1){
                return true;
            }
        }catch(SQLException ex){
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean eliminarRegistro(){
        try{
            String myQuery = "delete from tb_persona where dui_persona = '" + dui + "';" ;
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(myQuery);
            if(estado==1){
                return true;
            }
        }catch(SQLException ex){
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<Persona> consultarRegistro(){
        ArrayList<Persona> person = new ArrayList();
        try{
            String myQuery = "select * from tb_persona;";
            state = cnn.createStatement();
            result = state.executeQuery(myQuery);
            
            while(result.next()){
                person.add(new Persona(result.getString("dui_persona"), result.getString("nombre_persona"), result.getString("apellidos_persona")));
            }
        }catch(SQLException ex){
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return person;
    }

    
    
    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
}
