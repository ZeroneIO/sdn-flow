package io.zerone.webapp.sdnflow.shared;

import org.codehaus.jackson.annotate.JsonProperty;

public class NetsetReq {
  private String  reqBw;
  private String  maxBw;
  private Integer cls;

  /**
   * 请求带宽（k/m/g），默认为兆（m）
   **/
  @JsonProperty("req_bw")
  public String getReqBw() {
    return reqBw;
  }
  
  public void setReqBw(String reqBw) {
    this.reqBw = reqBw;
  }

  /**
   * 最大带宽（k/m/g），默认为兆（m）
   **/
  
  @JsonProperty("max_bw")
  public String getMaxBw() {
    return maxBw;
  }
  
  public void setMaxBw(String maxBw) {
    this.maxBw = maxBw;
  }

  /**
   * Traffic class （0～255）
   **/
  @JsonProperty("cls")
  public Integer getCls() {
    return cls;
  }
  
  public void setCls(Integer cls) {
    this.cls = cls;
  }
}
