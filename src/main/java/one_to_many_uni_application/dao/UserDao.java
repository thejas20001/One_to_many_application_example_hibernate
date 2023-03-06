package one_to_many_uni_application.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_to_many_uni_application.dto.Applications;
import one_to_many_uni_application.dto.User;


public class UserDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();

	}

	public void saveUser(User user) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		List<Applications> list = user.getList();
		for (Applications applications : list) {
			entityManager.persist(applications);
			
		}
		
		entityManager.persist(user);
		entityTransaction.commit();
		}
		

	}


