package io.zerone.webapp.sdnflow.shared;

import org.codehaus.jackson.annotate.JsonProperty;

public class ContainerReq {
  private String  id = null;
  private String  ip = null;
  private String  taskId = null;
  private String  reqBandWidth = null;
  private String  maxBandWidth = null;
  private Integer trafficClass = null;

  /**
   * 容器ID
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  /**
   * 容器IP
   **/
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }

  /**
   * 任务ID （可选）
   **/
  @JsonProperty("task_id")
  public String getTaskId() {
    return taskId;
  }
  
  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  /**
   * 请求带宽（k/m/g），默认为兆（m）
   **/
  @JsonProperty("req_bw")
  public String getReqBw() {
    return reqBandWidth;
  }
  
  public void setReqBw(String reqBw) {
    this.reqBandWidth = reqBw;
  }

  /**
   * 最大带宽（k/m/g），默认为兆（m）
   **/
  
  @JsonProperty("max_bw")
  public String getMaxBw() {
    return maxBandWidth;
  }
  
  public void setMaxBw(String maxBw) {
    this.maxBandWidth = maxBw;
  }

  /**
   * Traffic class （0～255）
   **/
  @JsonProperty("cls")
  public Integer getCls() {
    return trafficClass;
  }
  public void setCls(Integer cls) {
    this.trafficClass = cls;
  }

}
