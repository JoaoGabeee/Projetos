package produto.produtoBack;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ProdutoTableModel extends AbstractTableModel {

    private final String[] colunaNomes;
    private final ProdutoDAO produtoDAO;
    private List<Produto> produtos;

    public ProdutoTableModel() {
        this.produtoDAO = new ProdutoDAO();
        this.produtos = produtoDAO.listarUltimosVinte();
        this.colunaNomes = new String[]{"ID", "NOME", "MARCA", "DATA DE FABRICAÇÃO", "DATA DE VENCIMENTO", "PREÇO"};
    }

    public void atualizarTabela() {
        produtos = produtoDAO.listarUltimosVinte();
        fireTableDataChanged();
    }

    public void pesquisarPorNome(String nome) {
        produtos = produtoDAO.pesquisarPorNome(nome);
        fireTableDataChanged();
    }


    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return colunaNomes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = produtos.get(rowIndex);

        switch (columnIndex) {
            case 0 -> {
                return produto.getId();
            }
            case 1 -> {
                return produto.getNome();
            }
            case 2 -> {
                return produto.getMarca();
            }
            case 3 -> {
                return produto.getDataFabricacao();
            }
            case 4 -> {
                return produto.getDataVencimento();
            }
            case 5 -> {
                return produto.getPreco();
            }
        }

        return null;
    }

    @Override
    public String getColumnName(int column) {
        return colunaNomes[column];
    }
}

