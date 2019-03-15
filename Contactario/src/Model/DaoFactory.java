/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * 
 * @author plbogado
 */
public class DaoFactory {
    
    public DAO createDB_AgendaDAO() {
        return  new GestorDataBaseDAOImpl(); 
    }
    
    public DAO createJDBCServer_DAO(){
    return new GestorDataBaseDAOImpl();
    }
    
}
