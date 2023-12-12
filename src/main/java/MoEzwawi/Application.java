package MoEzwawi;

import MoEzwawi.dao.EventDAO;
import MoEzwawi.entities.Event;
import MoEzwawi.entities.EventType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("BE-S3-L2");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventDAO dao = new EventDAO(em);
        Event evento1 = new Event("Concerto","10-05-2024", EventType.PUBLIC);
        evento1.setDescription("Concerto molto figo");
        evento1.setMaximumCapacity(2000);
        dao.save(evento1);
    }
}
