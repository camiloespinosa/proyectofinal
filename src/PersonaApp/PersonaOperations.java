package PersonaApp;


/**
* PersonaApp/PersonaOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Persona.idl
* viernes 25 de mayo de 2018 09H09' COT
*/

public interface PersonaOperations 
{
  boolean insertarPersona (int id, String nombre, String apellido, String direccion, String genero, String estado);
  boolean eliminarPersona (int id);
  boolean actualizarPersona (int id, String nombre, String apellido, String direccion, String genero, String estado);
  void shutdown ();
} // interface PersonaOperations
