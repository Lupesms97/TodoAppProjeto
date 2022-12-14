package org.play;
import java.lang.*;
import org.controler.ProjectController;
import org.model.Project;
import java.util.List;
import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        ProjectController projectController = new ProjectController();

        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("Criando um teste para o meu project controler");
        ProjectController.save(project);

        project.setName("Testando update");
        ProjectController.update(project);

        List<Project> projects = projectController.getAll();
        System.out.println("O total de projetos são "+ projects.size());

    }
}