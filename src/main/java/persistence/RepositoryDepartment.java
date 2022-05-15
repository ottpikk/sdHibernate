package persistence;

import model.Department;
import model.Project;
import util.DbUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryDepartment {
    private EntityManager entityManager;

    public RepositoryDepartment(){
        this.entityManager = DbUtil.getEntityManager();
    }

    public void saveDepartment(Department department){
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(department);
            this.entityManager.getTransaction().commit();
        } catch (Exception e){
            this.entityManager.getTransaction().rollback();
        }
    }

    public void updateDepartment(Department department){
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.merge(department);
            this.entityManager.getTransaction().commit();
        } catch (Exception e){
            this.entityManager.getTransaction().rollback();
        }
    }

    public void deleteDepartment(Department department){
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.remove(entityManager.merge(department));
            this.entityManager.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
            this.entityManager.getTransaction().rollback();
        }
    }

    public List<Department> listAllDepartment(){
        String sql = "FROM Department";
        return this.entityManager.createQuery(sql).getResultList();
    }

    public Project findProjectById(int departmentId){
        return null;
    }

}
