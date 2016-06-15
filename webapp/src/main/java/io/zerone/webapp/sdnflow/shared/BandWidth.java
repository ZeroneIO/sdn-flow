package io.zerone.webapp.sdnflow.shared;

import org.codehaus.jackson.annotate.JsonProperty;

public class BandWidth {
  private Integer bwUp   = null;
  private Integer bwDown = null;

  /**
   * 上行带宽
   **/
  @JsonProperty("bw_up")
  public Integer getBwUp() {
    return bwUp;
  }
  
  public void setBwUp(Integer bwUp) {
    this.bwUp = bwUp;
  }

  /**
   * 下行带宽
   **/
  @JsonProperty("bw_down")
  public Integer getBwDown() {
    return bwDown;
  }
  
  public void setBwDown(Integer bwDown) {
    this.bwDown = bwDown;
  }
}