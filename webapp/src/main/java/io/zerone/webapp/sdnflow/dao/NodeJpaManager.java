package io.zerone.webapp.sdnflow.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import io.zerone.dao.DAO;
import io.zerone.dao.DAO.DAOFactory;
import io.zerone.webapp.sdnflow.domain.EventInfoBean;

public class NodeJpaManager {
  private static final Log log = LogFactory.getLog(NodeJpaManager.class);
  private final static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
  
  private DAO<EventInfoBean> eventInfoDao;
  
  /**
   * Default constructor
   */
  public NodeJpaManager(EntityManager em) {
    eventInfoDao = DAOFactory.create(em, EventInfoBean.class);
  }
}
