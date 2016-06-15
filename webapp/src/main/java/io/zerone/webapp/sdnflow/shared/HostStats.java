package io.zerone.webapp.sdnflow.shared;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class HostStats {
  private String id = null;
  private String ip = null;
  private String reqBw = null;
  private String maxBw = null;
  private Integer cls = null;
  private Integer interval = null;
  private String datetime = null;
  private Integer count = null;
  private List<BandWidth> bwInfo = new ArrayList<BandWidth>();

  /**
   * Host ID
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Host IP
   **/
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }
  
  public void setIp(String ip) {
    this.ip = ip;
  }

  /**
   * 主机请求的带宽
   **/
  @JsonProperty("req_bw")
  public String getReqBw() {
    return reqBw;
  }

  public void setReqBw(String reqBw) {
    this.reqBw = reqBw;
  }

  /**
   * 主机设置的最大带宽（当前配置的限制带宽）
   **/
  @JsonProperty("max_bw")
  public String getMaxBw() {
    return maxBw;
  }
  
  public void setMaxBw(String maxBw) {
    this.maxBw = maxBw;
  }

  /**
   * Traffic class
   **/
  @JsonProperty("cls")
  public Integer getCls() {
    return cls;
  }
  
  public void setCls(Integer cls) {
    this.cls = cls;
  }

  /**
   * 查询的间隔周期（s/m），默认为秒（s）
   **/
  @JsonProperty("interval")
  public Integer getInterval() {
    return interval;
  }
  
  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  /**
   * 第一个采样的时间戳
   **/
  @JsonProperty("datetime")
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  /**
   * 流量数据列表 按照interval递增
   **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * 每个时间点的流量信息
   **/
  @JsonProperty("bw_info")
  public List<BandWidth> getBwInfo() {
    return bwInfo;
  }

  public void setBwInfo(List<BandWidth> bwInfo) {
    this.bwInfo = bwInfo;
  }

}
