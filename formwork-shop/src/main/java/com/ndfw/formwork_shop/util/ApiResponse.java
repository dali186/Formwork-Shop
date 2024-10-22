package com.ndfw.formwork_shop.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
    //응답 상수
    private static final String STATUS_SUCCESS = "success";
    private static final String STATUS_FAIL = "fail";
    private static final String STATUS_ERROR = "error";

    //필드
    private String status;
    private T data;
    private String msg;

    /* Success */
    public static <T> ApiResponse<T> returnSuccessCode() {
        return new ApiResponse<>(STATUS_SUCCESS, null, null);
    }

    public static <T> ApiResponse<T> returnSuccessData(T data) {
        return new ApiResponse<>(STATUS_SUCCESS, data, null);
    }

    public static <T> ApiResponse<T> returnSuccessMsg(String msg) {
        return new ApiResponse<>(STATUS_SUCCESS, null, msg);
    }

    public static <T> ApiResponse<T> returnSuccessAll(T data, String msg) {
        return new ApiResponse<>(STATUS_SUCCESS, data ,msg);
    }

    /* Error */
}
