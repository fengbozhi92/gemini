package org.fbz.gemini.dictionary;

public enum ResultEnum {
    Success(0, "请求成功"),
    Error(-1, "网络异常，请稍后重试");

    private int code;
    private String msg;

    ResultEnum(int code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
