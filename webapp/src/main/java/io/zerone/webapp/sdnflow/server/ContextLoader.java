package io.zerone.webapp.sdnflow.server;


import io.zerone.rest.servlet.RestServletContainer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebListener("Context Loader for Bootstrap")
public class ContextLoader implements ServletContextListener {
  private static Log log = LogFactory.getLog(ContextLoader.class);
  private DbManager dm;
  
  @Override
  public void contextInitialized(ServletContextEvent evnt) {
    StringBuffer restResources = new StringBuffer(getClass().getPackage().getName());
    
    restResources.append(".rest");
    RestServletContainer.addResourcePath(restResources.toString());
    
    // database resources
    dm = new DbManager();
    dm.start();
    
    log.info("System started up.");
  }

  @Override
  public void contextDestroyed(ServletContextEvent evnt) {
    dm.stop();
    log.fatal("System shutdown.");
    // NOTHING
  }
}
