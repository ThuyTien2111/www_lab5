package vn.edu.iuh.fit.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.edu.iuh.fit.entity.Job;

import java.util.List;

@Repository
public class JobDao {
    private final EntityManager manager;

    @Autowired
    public JobDao(EntityManager entityManager) {
        this.manager = entityManager;
    }
    @Transactional
    public List<Job> getAll(){
        try {
            return manager.createQuery("select j from Job j", Job.class).getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
