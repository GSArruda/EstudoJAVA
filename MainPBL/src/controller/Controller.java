
package controller;

import dao.FuncionarioDAO;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.CRUD;


public class Controller {
    FuncionarioDAO funcDAO  = new FuncionarioDAO();
    CRUD crud = new CRUD();
    
    
    public Controller(CRUD crud , FuncionarioDAO funcDAO){
        
        this.crud = crud;
        this.funcDAO = funcDAO;
        this.crud.btnAdd.addActionListener((ActionListener) this);
        this.crud.btnListar.addActionListener((ActionListener) this);
        
    }
    
    public void populaTabela(JTable tabela){
        DefaultTableModel tab = new DefaultTableModel();
        tabela.setModel(tab);
        tab.addColumn("CPF");
        tab.addColumn("Nome");
        tab.addColumn("Salário");
        tab.addColumn("Cargo");
        tab.addColumn("Tempo de Empresa");
        Object [] coluna  = new Object[5];
        int numRegistros = funcDAO.listaFuncionarios().size();
        for(int i = 0; i< numRegistros; i++){
            coluna [0] = funcDAO.listaFuncionarios().get(i).getCpf();
            coluna[1] = funcDAO.listaFuncionarios().get(i).getNome();
            coluna[2] = funcDAO.listaFuncionarios().get(i).getSalario();
            coluna[3] = funcDAO.listaFuncionarios().get(i).getCargo();
            coluna[4] = funcDAO.listaFuncionarios().get(i).getTempo();
            tab.addRow(coluna);
        }
    }
    
    
}
