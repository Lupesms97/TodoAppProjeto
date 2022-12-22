package org.controller;

import org.Util.ConnectionFactory;
import org.model.Task;

import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class TaskController {

    public static void save(Task task){
        String sql = "INSERT INTO `task`"+
               "(idProject, " +
                "name, " +
                "description, " +
                "statusTask, " +
                "notes, " +
                "deadLine, " +
                "createAt, " +
                "updateAt)" +
                "VALUES (?,?,?,?,?,?,?,?)";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isStatusTask());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadLine().getTime()));
            statement.setDate(7, new Date(task.getCreateAt().getTime()));
            statement.setDate(8, new Date(task.getUpdateAt().getTime()));
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar a tarefa "+ex.getMessage(), ex);
        }finally {
            ConnectionFactory.closeConnection(conn, statement);

        }


    }

    public static void update(Task task){
        String sql = "UPDATE task SET "+
                "idProject=?," +
                "name = ?," +
                "description= ?," +
                "statusTask= ?," +
                "notes= ?," +
                "deadLine= ?," +
                "createAt = ?," +
                "updateAt= ?"+
                "WHERE id = ?";

        Connection conn = null;
        PreparedStatement statement = null;
        // BLOCO DE BAIXO ESTABELECE A CONEXÃO COM O BANCO DE DADOS
        //E SETA A TROCA DOS VALORES PARA EVITAR SELF INJECTION
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isStatusTask());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadLine().getTime()));
            statement.setDate(7, new Date(task.getCreateAt().getTime()));
            statement.setDate(8, new Date(task.getUpdateAt().getTime()));
            statement.setInt(9, task.getId());
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao autalizar o banco de dados"+ ex.getMessage(), ex);
        }


    }
    public void  removeById(int taskId) throws SQLException {

        String sql = "REMOVE FROM task WHERE id=?";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
        } catch (SQLException e) {
            throw new SQLException("Erro ao apagar a tarefa do banco de dados", e);
        }finally {
            ConnectionFactory.closeConnection(conn, statement);
        }


    }

    public static List<Task> getAll(int idProject){

        String sql = "SELECT * FROM task WHERE idProject=?";

        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        //Lista de tarefa que vai ser devolvida quando chamar o metodo getall
        List <Task> tasks = new ArrayList<Task>();

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            //SETANDO O VALOR QUE VAI SER USADO PARA FAZER O FILTRO DE BUSCA
            statement.setInt(1, idProject);
            //RETORNANDO O VALOR DA QUERY(LISTA DE TAREFAS)
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setStatusTask(resultSet.getBoolean("statusTask"));
                task.setDeadLine(resultSet.getDate("deadLine"));
                task.setCreateAt(resultSet.getDate("createAt"));
                task.setUpdateAt(resultSet.getDate("updateAt"));

                tasks.add(task);



            }

        } catch (Exception ex) {
            throw new  RuntimeException("Erro ao buscar as informações"+ ex.getMessage(), ex);
        }finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }

        //Lista que foi criada e vai ser devolvida já carregada
        return tasks;
    }




}
