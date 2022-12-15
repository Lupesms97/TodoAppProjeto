package org.controler;

import org.Util.ConnectionFactory;
import org.model.Project;

import java.lang.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProjectController {

    public static void save(Project project) throws RuntimeException {
        String sql = "INSERT INTO `projects` (name," +
                "description," +
                "createAt," +
                "UpdateAt)" +
                "VALUES(?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date((project.getCreateAt()).getTime()));
            statement.setDate(4, new Date((project.getUpdateAt()).getTime()));
            statement.execute();

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar as inormações no banco de dados "+ ex.getMessage());
        }finally {
            ConnectionFactory.closeConnection(conn, statement);

        }


    }

    public static void update(Project project){

        String sql = "UPDATE `projects` SET "+
        "name=?, " +
        "description=?, " +
        "createAt=?, " +
        "UpdateAt=? "+
        "WHERE id=?";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreateAt().getTime()));
            statement.setDate(4, new Date(project.getUpdateAt().getTime()));
            statement.setInt(5, project.getId());
            statement.execute();


        } catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar o banco de dados "+ ex.getMessage(), ex);
        }
    }

    public void removeById(int idProject){
        String sql = "DELETE FROM `projects` WHERE id=?";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, idProject);
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao apagar as informações do projeto"+ ex.getMessage(), ex);
        }finally {
            ConnectionFactory.closeConnection(conn, statement);

        }

    }


    public List<Project> getAll(){

        String sql = "SELECT * FROM `projects`";

        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        List<Project> projects = new ArrayList<Project>();

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                Project project = new Project();

                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreateAt(resultSet.getDate("createAt"));
                project.setUpdateAt(resultSet.getDate("updateAt"));

                projects.add(project);

            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao buscar as informações  do projeto "+ ex.getMessage(), ex);
        }finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);

        }


        return projects;

    }


}
