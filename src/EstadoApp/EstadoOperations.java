package EstadoApp;


/**
* EstadoApp/EstadoOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Estado.idl
* viernes 25 de mayo de 2018 09H10' COT
*/

public interface EstadoOperations 
{
  boolean insertarEstado (int id, String nombre);
  boolean eliminarEstado (int id);
  boolean actualizarEstado (int id, String nombre);
  void shutdown ();
} // interface EstadoOperations
