package org.fbz.gemini.common;

import org.fbz.gemini.dictionary.ResultEnum;
import org.fbz.gemini.domain.user.CurrentUser;

public class ResultData {
	
	private int code;
    private String message;
    private Object data;
    private CurrentUser user;

    public ResultData(ResultEnum res) {
        this.code = res.getCode();
        this.message = res.getMsg();
    }

    public ResultData(ResultEnum res, Object data) {
        this(res);
        this.data = data;
    }

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

    public CurrentUser getUser() {
        return user;
    }

    public void setUser(CurrentUser user) {
        this.user = user;
    }
    
}
