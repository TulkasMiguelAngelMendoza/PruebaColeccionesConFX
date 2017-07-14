
package ar.com.miguel.model;

import ar.com.miguel.entity.Perro;
import java.util.List;


public interface DAO <T, K>{
   void guardar(T t);
   Perro recuperar(K k); //si no se encuentra el elemento, retorna null
   void modificar(T t);
   List<T> recuperarTodos();
   void eliminar(T t);
    
}
