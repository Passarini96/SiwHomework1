package homework1.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CorsoMain {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("corso-unit");
		EntityManager em = emf.createEntityManager();
		

		
		
		em.close();
		emf.close();
	}
}


// ho deciso di mettere una fetch EAGER su allievo cosi da poter subito risalire a partire da un allievo ai corsi cui partecipa
