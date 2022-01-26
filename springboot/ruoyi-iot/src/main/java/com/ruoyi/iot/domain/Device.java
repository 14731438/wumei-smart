package com.ruoyi.iot.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备对象 iot_device
 * 
 * @author kerwincui
 * @date 2021-12-16
 */
public class Device extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 产品分类ID */
    private Long deviceId;

    /** 产品分类名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 产品ID */
    @Excel(name = "产品ID")
    private Long productId;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String productName;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 用户昵称 */
    @Excel(name = "用户昵称")
    private String userName;

    /** 租户ID */
    @Excel(name = "租户ID")
    private Long tenantId;

    /** 租户名称 */
    @Excel(name = "租户名称")
    private String tenantName;

    /** 设备编号 */
    @Excel(name = "设备编号")
    private String serialNumber;

    /** 固件版本 */
    @Excel(name = "固件版本")
    private BigDecimal firmwareVersion;

    /** 设备状态（1-未激活，2-禁用，3-在线，4-离线） */
    @Excel(name = "设备状态")
    private Integer status;

    /** wifi信号强度（信号极好4格[-55— 0]，信号好3格[-70— -55]，信号一般2格[-85— -70]，信号差1格[-100— -85]） */
    @Excel(name = "wifi信号强度")
    private Integer rssi;

    /** 设备所在地址 */
    @Excel(name = "设备所在地址")
    private String networkAddress;

    /** 设备入网IP */
    @Excel(name = "设备入网IP")
    private String networkIp;

    /** 设备经度 */
    @Excel(name = "设备经度")
    private Long longitude;

    /** 设备纬度 */
    @Excel(name = "设备纬度")
    private Long latitude;

    /** 激活时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "激活时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date activeTime;

    @Excel(name = "物模型")
    private String thingsModelValue;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public void setDeviceId(Long deviceId)
    {
        this.deviceId = deviceId;
    }

    public Long getDeviceId() 
    {
        return deviceId;
    }
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setTenantId(Long tenantId) 
    {
        this.tenantId = tenantId;
    }

    public Long getTenantId() 
    {
        return tenantId;
    }
    public void setTenantName(String tenantName) 
    {
        this.tenantName = tenantName;
    }

    public String getTenantName() 
    {
        return tenantName;
    }
    public void setSerialNumber(String serialNumber) 
    {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() 
    {
        return serialNumber;
    }
    public void setFirmwareVersion(BigDecimal firmwareVersion) 
    {
        this.firmwareVersion = firmwareVersion;
    }

    public BigDecimal getFirmwareVersion() 
    {
        return firmwareVersion;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setRssi(Integer rssi) 
    {
        this.rssi = rssi;
    }

    public Integer getRssi() 
    {
        return rssi;
    }
    public void setThingsModelValue(String thingsModelValue)
    {
        this.thingsModelValue = thingsModelValue;
    }

    public String getThingsModelValue()
    {
        return thingsModelValue;
    }
    public void setNetworkAddress(String networkAddress) 
    {
        this.networkAddress = networkAddress;
    }

    public String getNetworkAddress() 
    {
        return networkAddress;
    }
    public void setNetworkIp(String networkIp) 
    {
        this.networkIp = networkIp;
    }

    public String getNetworkIp() 
    {
        return networkIp;
    }
    public void setLongitude(Long longitude) 
    {
        this.longitude = longitude;
    }

    public Long getLongitude() 
    {
        return longitude;
    }
    public void setLatitude(Long latitude) 
    {
        this.latitude = latitude;
    }

    public Long getLatitude() 
    {
        return latitude;
    }
    public void setActiveTime(Date activeTime) 
    {
        this.activeTime = activeTime;
    }

    public Date getActiveTime() 
    {
        return activeTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("deviceId", getDeviceId())
            .append("deviceName", getDeviceName())
            .append("productId", getProductId())
            .append("productName", getProductName())
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("tenantId", getTenantId())
            .append("tenantName", getTenantName())
            .append("serialNumber", getSerialNumber())
            .append("firmwareVersion", getFirmwareVersion())
            .append("status", getStatus())
            .append("rssi", getRssi())
            .append("networkAddress", getNetworkAddress())
            .append("networkIp", getNetworkIp())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("activeTime", getActiveTime())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}