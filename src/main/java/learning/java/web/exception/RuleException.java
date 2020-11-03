package learning.java.web.exception;

import learning.java.web.enums.ErrorCode;

/**
 * 规则异常
 * 
 * @author Rayliu40k
 * @version $Id: RuleException.java, v 0.1 Oct 27, 2020 10:34:24 AM Rayliu40k Exp $
 */
public class RuleException extends RuntimeException {

    /** 序列号 */
    private static final long serialVersionUID = -5425031445281776393L;

    /** 异常代码 */
    private ErrorCode         errorCode;

    /** 异常消息 */
    private String            message;

    /**
     * 构造器
     * 
     * @param errorCode 异常代码
     * @param message 异常消息
     */
    public RuleException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        this.message = message;
    }

    /**
     * 构造器
     * 
     * @param errorCode 异常代码
     * @param message 异常消息
     * @param throwable {@link Throwable}
     */
    public RuleException(ErrorCode errorCode, String message, Throwable throwable) {
        super(message, throwable);
        this.errorCode = errorCode;
        this.message = message;
    }

    /**
     * Getter method for property <tt>errorCode</tt>.
     * 
     * @return property value of errorCode
     */
    public ErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * Setter method for property <tt>errorCode</tt>.
     * 
     * @param errorCode value to be assigned to property errorCode
     */
    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter method for property <tt>message</tt>.
     * 
     * @return property value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method for property <tt>message</tt>.
     * 
     * @param message value to be assigned to property message
     */
    public void setMessage(String message) {
        this.message = message;
    }
}