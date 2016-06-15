package io.zerone.webapp.sdnflow.shared;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

public class ContainerRsp {
  private String  clientIp = null;
  private String  errCode  = null;

  /**
   * 客户端IP
   */
  @JsonProperty("client_ip")
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  /**
   * 0表示成功，否则为错误码 或者“出错信息”（字符串）
   **/
  @JsonProperty("errcode")
  public String getErrCode() {
    return errCode;
  }
  
  public void setErrCode(String errcode) {
    this.errCode = errcode;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIp, errCode);
  }
}
