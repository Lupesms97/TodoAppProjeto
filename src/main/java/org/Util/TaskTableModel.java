package org.Util;

import org.model.Task;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TaskTableModel extends AbstractTableModel {
    String[] columns = {"Nome", "Dedscrição", "Prazo", "Tarefa concluída", "Editar", "Excluir"};
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
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 1:
                return tasks.get(rowIndex).getName();
            case 2:
                return tasks.get(rowIndex).getDescription();
            case 3:
                return tasks.get(rowIndex).getDeadLine();
            case 4:
                return tasks.get(rowIndex).isStatusTask();
            case 5:
                return  "";
            case 6:
                return  "";
            default:
                return "Dados não encontrados";


        }
    }
}
