package com.coderap.hos.core.usermanager;

import com.coderap.hos.core.HOSException;
import lombok.Getter;

/**
 * @program: HOS-Service
 * @description:
 * @author: Lennon Chin
 * @create: 2018/05/20 23:08:31
 */
@Getter
public class HOSUserManagerException extends HOSException {

    private int code;
    private String errorMessage;

    public HOSUserManagerException(int code, String errorMessage, Throwable cause) {
        super(errorMessage, cause);
        this.code = code;
        this.errorMessage = errorMessage;
    }

    public HOSUserManagerException(int code, String errorMessage) {
        super(errorMessage, null);
        this.code = code;
        this.errorMessage = errorMessage;
    }

    @Override
    public int errorCode() {
        return code;
    }
}
