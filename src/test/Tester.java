package test; 

import database.DbFacade;
import entity.Project;
import entity.ProjectUser;
import entity.Task;
import java.util.List;

public class Tester { 
    public static void main(String[] args) {
        DbFacade dbFacade = new DbFacade();
        
        System.out.println("--- Start create users ---");
        dbFacade.createUser("Peter Hansen", "Peter@Hansen.dk");
        dbFacade.createUser("Jens noget", "Jens@noget.dk");
        dbFacade.createUser("Nik andet", "nik@andet.dk");
        System.out.println("--- End create users ---");
        
        System.out.println("--- Start find one user ---");
        ProjectUser user = dbFacade.findUser(1);
        System.out.println(user.getUserName());
        System.out.println("--- End find one user ---");

        System.out.println("--- Start find all users ---");
        List<ProjectUser> users = dbFacade.getAllUsers();
        for (ProjectUser userInList : users) {
            System.out.println(userInList.getUserName());
        }
        System.out.println("--- End find all users ---");
        
        System.out.println("--- Start create projects ---");
        dbFacade.createProject("Project 1", "Mit først project");
        dbFacade.createProject("Project 2", "Mit andet project");
        dbFacade.createProject("Project 3", "Mit trejde project");
        System.out.println("--- End create projects ---");
        
        System.out.println("--- Start find project ---");
        Project project = dbFacade.findProject(2);
        System.out.println("--- End find project ---");
        
        System.out.println("--- Start assign user to project ---");
        dbFacade.assignUserToProject(3, 1);
        dbFacade.assignUserToProject(2, 1);
        System.out.println("--- End assign user to project ---");
        
        System.out.println("--- Start create task and assign to project ---");
        Task task = dbFacade.createTaskAndAssignToProject("Min task", "Min først task", 2);
        System.out.println("--- End create task and assign to project ---");
    }
}