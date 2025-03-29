/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evangelismoCrud.usuario;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import evangelismoCrud.usuario.dao.UsuarioDAO;

/**
 *
 * @author IFPR
 */
public class UsuarioTableModel extends AbstractTableModel {
    
    private final UsuarioDAO usuarioDAO;
    private final String[] columnNames;
    private List<Usuario> usuarios;
    
    public UsuarioTableModel() {
        this.usuarioDAO = new UsuarioDAO();
        this.usuarios = usuarioDAO.listLastTwenty();
        this.columnNames = new String[]{"ID", "NOME", "E-MAIL", "DATA DE NASCIMENTO", "CPF", "SEXO", "CONSULTA"};
    }

    public void atualizarTabela() {
        usuarios = usuarioDAO.listLastTwenty();
        fireTableDataChanged();
    }
    
    public void pesquisarPorNome(String nome) {
        usuarios = usuarioDAO.pesquisarPorNome(nome);
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);
    
        if(columnIndex == 0) {
            return usuario.getId();
        }
        
        if(columnIndex == 1) {
            return usuario.getNome();
        }
        
        if(columnIndex == 2) {
            return usuario.getEmail();
        }
        
        if(columnIndex == 3) {
            return usuario.getDataNascimento();
        }
        
        if(columnIndex == 4) {
            return usuario.getCpf();        
        } 
        
        if(columnIndex == 5) {
            return usuario.getSexoPessoa();        
        }
        
        if(columnIndex == 6) {
            return usuario.getConsulta();        
        }
        
        return null;
            
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
}
