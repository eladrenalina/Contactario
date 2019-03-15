package Model;

/**
 * 
 * @author plbogado
 */
public interface dao {
    public void agregar(Contacts c);
    public void modificar(Contacts c,int id);
    public void eliminar(String id);
    public void mostrarTodos();
    public void buscar(String buscar);
}
