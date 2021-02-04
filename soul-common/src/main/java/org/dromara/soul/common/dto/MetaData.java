package org.dromara.soul.common.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class MetaData implements Serializable {
    
    private String id;
    
    private String appName;
    
    private String contextPath;
    
    private String path;
    
    private String rpcType;
    
    private String serviceName;// 接口名
    
    private String methodName;
    
    private String parameterTypes;
    
    private String rpcExt;// 扩展信息
    
    private Boolean enabled;
}
