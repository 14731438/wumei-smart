package com.ruoyi.iot.mapper;

import java.util.List;
import com.ruoyi.iot.domain.Device;
import com.ruoyi.iot.model.DeviceShortOutput;
import com.ruoyi.iot.model.IdAndName;

/**
 * 设备Mapper接口
 * 
 * @author kerwincui
 * @date 2021-12-16
 */
public interface DeviceMapper 
{
    /**
     * 查询设备
     * 
     * @param deviceId 设备主键
     * @return 设备
     */
    public Device selectDeviceByDeviceId(Long deviceId);

    /**
     * 查询设备和运行状态
     *
     * @param deviceId 设备主键
     * @return 设备
     */
    public DeviceShortOutput selectDeviceRunningStatusByDeviceId(Long deviceId);

    /**
     * 查询设备的物模型值
     *
     * @param deviceId 设备主键
     * @return 设备
     */
    public String selectDeviceThingsModelValueById(Long deviceId);

    /**
     * 修改设备的物模型值
     *
     * @param idAndName 设备ID和物模型值
     * @return 结果
     */
    public int updateDeviceThingsModelValue(IdAndName idAndName);

    /**
     * 查询设备列表
     * 
     * @param device 设备
     * @return 设备集合
     */
    public List<Device> selectDeviceList(Device device);

    /**
     * 查询设备简短列表
     *
     * @param device 设备
     * @return 设备集合
     */
    public List<DeviceShortOutput> selectDeviceShortList(Device device);

    /**
     * 新增设备
     * 
     * @param device 设备
     * @return 结果
     */
    public int insertDevice(Device device);

    /**
     * 修改设备
     * 
     * @param device 设备
     * @return 结果
     */
    public int updateDevice(Device device);

    /**
     * 删除设备
     * 
     * @param deviceId 设备主键
     * @return 结果
     */
    public int deleteDeviceByDeviceId(Long deviceId);

    /**
     * 批量删除设备
     * 
     * @param deviceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDeviceByDeviceIds(Long[] deviceIds);
}