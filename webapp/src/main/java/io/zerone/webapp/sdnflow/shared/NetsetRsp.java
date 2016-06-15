package io.zerone.webapp.sdnflow.shared;

import org.codehaus.jackson.annotate.JsonProperty;

public class NetsetRsp {
  private String id;
  private String ip;
  private String newBw;
  private String errcode;

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
   * 当前分配的带宽
   **/
  @JsonProperty("new_bw")
  public String getNewBw() {
    return newBw;
  }
  public void setNewBw(String newBw) {
    this.newBw = newBw;
  }

  /**
   * 0表示成功，否则为错误码 或者“出错信息”（字符串）
   **/
  @JsonProperty("errcode")
  public String getErrcode() {
    return errcode;
  }
  
  public void setErrcode(String errcode) {
    this.errcode = errcode;
  }
}
