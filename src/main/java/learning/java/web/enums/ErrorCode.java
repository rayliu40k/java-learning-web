/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package learning.java.web.enums;

/**
 * 异常代码枚举
 * 
 * @author Rayliu40k
 * @version $Id: ErrorCode.java, v 0.1 Sep 1, 2020 5:42:52 PM Rayliu40k Exp $
 */
public enum ErrorCode {

                       INVALID_RULE("invalid_rule", "Rule不是合法的Prometheus规则"),

                       INVALID_PARAMETER("invalid_parameter", "非法参数"),

                       API_ERROR("api_error", "接口错误"),

                       INVALID_DATA_FORMAT("invalid_data_format", "非法数据格式"),

                       IO_ERROR("io_error", "I/O异常"),

                       NETWORK_ERROR("network_error", "网络异常"),

                       UNDEFINED_ERROR("undefined_error", "未知异常");

    /** 异常代码 */
    private String code;

    /** 异常描述 */
    private String desc;

    /**
     * 构造器
     * @param code 异常代码
     * @param desc 异常描述
     */
    private ErrorCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>desc</tt>.
     * 
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Setter method for property <tt>desc</tt>.
     * 
     * @param desc value to be assigned to property desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}