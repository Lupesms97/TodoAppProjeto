package org.Util;

import org.model.Task;

import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author leona
 */
public class TaskTableModel extends AbstractTableModel {

    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa Concluida", "Editar", "Excluir"  };
    List<Task> tasks = new ArrayList<>();

    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    public boolean IsCellEditable(int rowIndex, int columnIndex) {

        return columnIndex == 3;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex){

        if(tasks.isEmpty()){
            return Object.class;
        }

        return this.getValueAt(0, columnIndex).getClass();
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return tasks.get(rowIndex).getName();

            case 1:
                return tasks.get(rowIndex).getDescription();

            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadLine());

            case 3:
                return tasks.get(rowIndex).isStatusTask();

            case 4:
                return "";
            case 5:
                return "";
            default:
                return "Dados nao encontrados";
        }
    }

    @Override
    public void setValueAt(Object value, int columnIndex, int rowIndex){
        tasks.get(rowIndex).setStatusTask((boolean) value);
    }


    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }



}


