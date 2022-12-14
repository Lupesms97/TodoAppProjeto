package org.controler;

import org.Util.ConnectionFactory;
import org.model.Project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectController {
    //save
    //removebyId
    //update
    //getall

    public void save(Project project){
        String sql = "INSERT INTO project (name," +
                "description," +
                "createAt," +
                "UpdateAt VALUES(?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreateAt().getTime()));
            statement.setDate(4, new Date(project.getUpdateAt().getTime()));
            statement.execute();

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar as inormações no banco de dados "+ ex.getMessage(), ex);
        }finally {
            ConnectionFactory.closeConnection(conn, statement);

        }


    }

    public void update(Project project, Object projectName){
        String sql = "UPDATE project SET(name," +
        "description," +
        "createAt," +
        "UpdateAt VALUES(?, ?, ?, ?)";

        Connection conn= null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreateAt().getTime()));
            statement.setDate(4, new Date(project.getUpdateAt().getTime()));
            statement.execute();


        } catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar o banco de dados "+ ex.getMessage(), ex);
        }
    }

    public void removeByName(String projectName){
        String sql = "DELETE FROM project WHERE name=?";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, projectName);
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao apagar as informações do projeto " +projectName+" ."+ ex.getMessage(), ex);
        }finally {
            ConnectionFactory.closeConnection(conn, statement);

        }

    }


    public List<Project> getAll(String nameProject){

        String sql = "SELECT * FROM project WHERE name=?";

        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        List<Project> projects = new ArrayList<Project>();

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, nameProject);
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return projects;

    }


}
