package Univercity_uni_onetoone.dao;

import java.security.PublicKey;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Univercity_uni_onetoone.dto.Collage;
import Univercity_uni_onetoone.dto.School;

public class SchoolDao {
public EntityManager getEntityManager()
{
	return Persistence.createEntityManagerFactory("rajath").createEntityManager();
			}

public void savacollage(Collage collage)
{
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	School school=collage.getSchool();
	entityTransaction.begin();
	entityManager.persist(collage);
	entityManager.persist(school);
	entityTransaction.commit();

}
public void getfind(int id)
{
EntityManager entityManager=getEntityManager()	;
School school_id=entityManager.find(School.class, id);
System.out.println(school_id);


}
}
