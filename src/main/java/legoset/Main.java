package legoset;

import java.time.Year;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import legoset.model.LegoSet;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main {

    private static Logger logger = LogManager.getLogger();

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("legoset-mysql");

    private static void createLegoSets() {
       // TODO
    }

    private static List<LegoSet> getLegoSets() {
        // TODO
        return null;
    }

    private static Long getTotalPieces() {
        // TODO
        return null;
    }

    private static void deleteLegoSets() {
        // TODO
    }

    public static void main(String[] args) {
        createLegoSets();
        getLegoSets().forEach(logger::info);
        logger.info("Total pieces: {}", getTotalPieces());
        deleteLegoSets();
        emf.close();
    }

}
