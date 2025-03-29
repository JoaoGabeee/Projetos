package evangelismoCrud.usuario.dao;

import evangelismoCrud.banco.GenericDAO;
import evangelismoCrud.usuario.Usuario;
import jakarta.persistence.Query;
import java.util.List;

public class UsuarioDAO extends GenericDAO<Usuario> {

    public UsuarioDAO() {
        super(Usuario.class);
    }

    
    @SuppressWarnings("unchecked")
    public List<Usuario> listLastTwenty() {
        entityManager.clear();
        String hqlList = "from Usuario u order by u.id desc";
        Query query = entityManager.createQuery(hqlList);
        query.setMaxResults(20);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<Usuario> pesquisarPorNome(String nome) {
        String hqlSearch = "from Usuario u where lower(u.nome) like concat('%', :nome, '%') order by u.nome asc";
        Query query = entityManager.createQuery(hqlSearch);
        query.setParameter("nome", nome);
        return query.getResultList();
    }
    
}
