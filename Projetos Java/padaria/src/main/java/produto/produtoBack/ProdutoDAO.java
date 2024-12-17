package produto.produtoBack;

import dao.GenericDAO;
import jakarta.persistence.Query;

import java.util.List;

public class ProdutoDAO extends GenericDAO<Produto> {

    public ProdutoDAO() {
        super(Produto.class);
    }

    public List<Produto> listarUltimosVinte() {
        entityManager.clear();
        String hqlList = "from Produto p order by p.id desc";
        Query query = entityManager.createQuery(hqlList);
        query.setMaxResults(20);
        return query.getResultList();
    }

    public List<Produto> pesquisarPorNome(String nome) {
        String hqlSearch = "from Produto p where lowe(p.nome) like concat('%', :nome, '%') order by p.nome asc";
        Query query = entityManager.createQuery(hqlSearch);
        query.setParameter("nome", nome);
        return query.getResultList();
    }

}
