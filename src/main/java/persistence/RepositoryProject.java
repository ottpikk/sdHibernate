package persistence;

import model.Project;
import util.DbUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryProject {
    private EntityManager entityManager;

    public RepositoryProject(){
        this.entityManager = DbUtil.getEntityManager();
    }

    public void saveProject(Project project){
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(project);
            this.entityManager.getTransaction().commit();
        } catch (Exception e){
            this.entityManager.getTransaction().rollback();
        }
    }

    public void updateProject(Project project){
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.merge(project);
            this.entityManager.getTransaction().commit();
        } catch (Exception e){
            this.entityManager.getTransaction().rollback();
        }
    }

    public void deleteProject(Project project){
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.remove(entityManager.merge(project));
            this.entityManager.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
            this.entityManager.getTransaction().rollback();
        }
    }

    public List<Project> listAllProjects(){
        String sql = "FROM Project";
        return this.entityManager.createQuery(sql).getResultList();
    }

    public Project findProjectById(int projectId){
        return null;
    }
}
