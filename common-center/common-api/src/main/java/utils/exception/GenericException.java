package utils.exception;

import java.io.Serializable;

/**
 * @author yafei
 * @since 2016/11/15
 */
public class GenericException extends RuntimeException implements Serializable {
    String errorCode;
    String errorMessage;
    Exception errOri;

    public String getMessage() {
        return this.getErrorMessage();
    }

    public GenericException() {
    }

    public GenericException(String errCode) {
        this.errorCode = errCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Exception getErrOri() {
        return this.errOri;
    }

    public void setErrOri(Exception errOri) {
        this.errOri = errOri;
    }
}
