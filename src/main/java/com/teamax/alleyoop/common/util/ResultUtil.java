package com.teamax.alleyoop.common.util;

public class ResultUtil {

    public static Result success() {
        return success(null);
    }

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success(long total, int currentPage, int pageSize, Object object) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setTotal(total);
        result.setCurrentPage(currentPage);
        result.setPageSize(pageSize);
        result.setData(object);
        return result;
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
