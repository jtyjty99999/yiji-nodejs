package com.yiji.openapi.message.mpay.enums;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-08 11:01.
 */
public enum PurposeEnum {

    WITHDRAW("withdraw", "提现"),
    DEDUCT("deduct", "快捷支付"),
    REALNAMEDEDUCT("realnamededuct", "实名代扣");

    private final String code;
    private final String message;

    PurposeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public static PurposeEnum getByCode(String code) {
        PurposeEnum[] arr$ = values();
        for (PurposeEnum _enum : arr$) {
            if (_enum.getCode().equals(code)) {
                return _enum;
            }
        }

        return null;
    }

    public static List<PurposeEnum> getAllEnum() {
        List<PurposeEnum>list = new LinkedList<PurposeEnum>();
        PurposeEnum[] arr$ = values();
        Collections.addAll(list, arr$);
        return list;
    }

    public List<String> getAllEnumCode() {
        List<String> list = new LinkedList<String>();
        PurposeEnum[] arr$ = values();
        for (PurposeEnum _enum : arr$) {
            list.add(_enum.code());
        }
        return list;
    }
}
