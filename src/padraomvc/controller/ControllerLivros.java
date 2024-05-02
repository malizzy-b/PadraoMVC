package padraomvc.controller;

import java.sql.SQLException;
import java.util.List;
import padraomvc.model.dao.DaoLivros;
import padraomvc.util.ControllerBasico;

/**
 * Controller for the entity Livros.
 */
public class ControllerLivros implements ControllerBasico {
    
    DaoLivros dao;

    @Override
    public Object inserir(Object obj) throws SQLException, ClassNotFoundException {
        dao = new DaoLivros();
        return dao.inserir(obj);
    }

    @Override
    public Object alterar(Object obj) throws SQLException, ClassNotFoundException {
        dao = new DaoLivros();
        return dao.alterar(obj);
    }

    @Override
    public Object buscar(Object obj) throws SQLException, ClassNotFoundException {
        dao = new DaoLivros();
        return dao.buscar(obj);
    }

    @Override
    public Object excluir(Object obj) throws SQLException, ClassNotFoundException {
        dao = new DaoLivros();
        return dao.excluir(obj);
    }

    @Override
    public List<Object> listar(Object obj) throws SQLException, ClassNotFoundException {
        dao = new DaoLivros();
        return dao.listar(obj);
     }
}
