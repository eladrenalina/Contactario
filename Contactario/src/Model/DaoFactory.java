/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Conn.Single_Conn;
/**
 *
 * @author Emmanuel
 */
public class DaoFactory {
    
    public dao createDB_AgendaDAO() {
        return  new GestorDataBase(); 
    }
    
    public dao createJDBCServer_DAO(){
    return new GestorDataBase();
    }
    
}