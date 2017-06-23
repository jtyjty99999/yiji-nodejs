package com.yiji.openapi.message.product.ccp.info;


/**
 * Created by Administrator on 2016/3/25.
 */
public enum ActionTypeEnum {

    NEW_AND_AUD("NEW_AND_AUD", "审核申请"),
    UPDATE_NOT_AUD("UPDATE_NOT_AUD", "审核更新");

    /** 枚举值 */
    private final String code;

    /** 枚举描述 */
    private final String message;

    /**
     *
     * @param code 枚举值
     * @param message 枚举描述
     */
    private ActionTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @return Returns the code.
     */
    public String getCode() {
        return code;
    }

    /**
     * @return Returns the message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return Returns the code.
     */
    public String code() {
        return code;
    }

    /**
     * @return Returns the message.
     */
    public String message() {
        return message;
    }

    /**
     * 通过枚举<code>code</code>获得枚举
     *
     * @param code
     * @return ChannelTypeEnum
     */
    public static ActionTypeEnum getByCode(String code) {
        for (ActionTypeEnum _enum : values()) {
            if (_enum.getCode().equals(code)) {
                return _enum;
            }
        }
        return null;
    }

    /**
     * 获取全部枚举
     *
     * @return List<ChannelTypeEnum>
     */
    public java.util.List<ActionTypeEnum> getAllEnum() {
        java.util.List<ActionTypeEnum> list = new java.util.ArrayList<ActionTypeEnum>();
        for (ActionTypeEnum _enum : values()) {
            list.add(_enum);
        }
        return list;
    }

    /**
     * 获取全部枚举值
     *
     * @return List<String>
     */
    public java.util.List<String> getAllEnumCode() {
        java.util.List<String> list = new java.util.ArrayList<String>();
        for (ActionTypeEnum _enum : values()) {
            list.add(_enum.code());
        }
        return list;
    }
}
