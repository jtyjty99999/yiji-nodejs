package com.yiji.openapi.message.product.ccp;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.ccp.info.AttachmentInfoDto;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Administrator on 2016/3/25.
 */
@OpenApiMessage(service = "ccpUploadLoan", type = ApiMessageType.Request)
public class CcpUploadLoanAttRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "外部商户订单号",demo = "201603130054")
    private String outOrderNo;

    @NotBlank
    @OpenApiField(desc = "融资订单号",demo = "201603130054")
    private String bizNo;

    @OpenApiField(desc = "贷款申请需要的附件资料")
    private List<AttachmentInfoDto> attachments;

    @NotNull
    @OpenApiField(desc = "上传者类型",demo = "1")
    private Long uploaderType;

    public Long getUploaderType() {
        return uploaderType;
    }

    public void setUploaderType(Long uploaderType) {
        this.uploaderType = uploaderType;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public List<AttachmentInfoDto> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfoDto> attachments) {
        this.attachments = attachments;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }
}
