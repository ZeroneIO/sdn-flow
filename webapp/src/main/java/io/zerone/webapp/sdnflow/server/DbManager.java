package io.zerone.webapp.sdnflow.server;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import io.zerone.webapp.sdnflow.dao.NodeJpaManager;

public class DbManager {
  /**
   * Common logging, see {@link io.zerone.log.LogConfigure} for details.
   */
  private static Log log = LogFactory.getLog(DbManager.class);

  /**
   * see resources/META-INF/persistence.xml
   */
  public static final String PERSISTENCE_UNIT_NAME = "DataStore";

  private EntityManagerFactory emf;
  private EntityManager entityManager;
  private NodeJpaManager dbClient;

  public void start() {
    // setup persistence driver
    log.debug("starting...");
    try {
      emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
      entityManager = emf.createEntityManager();
      dbClient = new NodeJpaManager(entityManager);
    } catch (Exception e) {
      log.error(e.getMessage());
      // e.printStackTrace();
    }
  }

  public void stop() {
    log.debug("stopping...");
    if (null != dbClient) {
      // close database resources
      emf.close();
    }
  }
}
