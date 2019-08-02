package com.teamax.alleyoop.common.util;

public class Result1Util {

    public static R1Result success() {
        return success(null);
    }

    public static R1Result success(Object object) {
        R1Result result = new R1Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static R1Result error(Integer code, String msg) {
        R1Result result = new R1Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
