package myapp.dao;

import myapp.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getAll() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void updUser(User upduser) {
        entityManager.merge(upduser);
    }

    @Override
    public void deleteUsr(int id) {
        entityManager.remove(getUserById(id));
    }

    @Override
    public void addNewUser(User newUser) {
        entityManager.persist(newUser);
    }


}
