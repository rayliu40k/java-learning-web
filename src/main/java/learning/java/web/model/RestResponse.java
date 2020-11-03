/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package learning.java.web.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

/**
 * Rest响应对象
 * 
 * @author Rayliu40k
 * @version $Id: RestResponse.java, v 0.1 Oct 22, 2020 10:09:19 AM Rayliu40k Exp $
 */
@Data
public class RestResponse<T> {

    /** 响应状态 */
    @JsonInclude(value = Include.NON_EMPTY)
    private String status;

    /** 错误描述 */
    @JsonInclude(value = Include.NON_EMPTY)
    private String summary;

    /** 错误描述 */
    @JsonInclude(value = Include.NON_EMPTY)
    private String description;

    /** 数据 */
    @JsonInclude(value = Include.NON_EMPTY)
    private T      data;

    /**
     * 构造方法
     */
    public RestResponse(String status) {
        this.status = status;
    }

    /**
     * 构造方法
     */
    public RestResponse(String status, String summary) {
        this.status = status;
        this.summary = summary;
    }

    /**
     * 构造方法
     */
    public RestResponse(String status, String summary, String description) {
        this.status = status;
        this.summary = summary;
        this.description = description;
    }

    /**
     * 构造方法
     */
    public RestResponse(String status, T data) {
        this.status = status;
        this.data = data;
    }

}
