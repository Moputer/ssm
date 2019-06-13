package cn.tycoding.service.ex;



/**
 * 验证用户密码失败的异常
 */
public class PasswordErrorException extends ServiceException {

    private static final long serialVersionUID = 1903639604855086304L;

    public PasswordErrorException() {
        super();
    }

    public PasswordErrorException(String message, Throwable cause, boolean enableSuppression,
                                     boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public PasswordErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordErrorException(String message) {
        super(message);
    }

    public PasswordErrorException(Throwable cause) {
        super(cause);
    }

}
