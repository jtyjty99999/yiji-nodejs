package com.yiji.openapi.message.product.common;

import com.yiji.openapi.message.product.common.info.SingleTradeInfos;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

import java.util.List;

/**
 * Created by Administrator on 2016/8/26.
 */
@OpenApiMessage(service = "multipleTradeMergeQuery", type = ApiMessageType.Response)
public class MultipleTradeMergeQueryResponse extends ApiResponse {

   @OpenApiField(desc = "买家付款总金额",demo = "100")
   private Money buyerTotalAmount;

   @OpenApiField(desc = "总笔数",demo = "10")
   private int totalCount;

   @OpenApiField(desc = "成功笔数",demo = "9")
   private int successCount;

   @OpenApiField(desc = "失败笔数",demo = "0")
   private int failCount;

   @OpenApiField(desc = "处理中笔数",demo = "1")
   private int processCount;

   @OpenApiField(desc = "交易详情")
   private List<SingleTradeInfos> singleTradeInfos;

   public Money getBuyerTotalAmount() {
      return buyerTotalAmount;
   }

   public void setBuyerTotalAmount(Money buyerTotalAmount) {
      this.buyerTotalAmount = buyerTotalAmount;
   }

   public int getTotalCount() {
      return totalCount;
   }

   public void setTotalCount(int totalCount) {
      this.totalCount = totalCount;
   }

   public int getSuccessCount() {
      return successCount;
   }

   public void setSuccessCount(int successCount) {
      this.successCount = successCount;
   }

   public int getFailCount() {
      return failCount;
   }

   public void setFailCount(int failCount) {
      this.failCount = failCount;
   }

   public int getProcessCount() {
      return processCount;
   }

   public void setProcessCount(int processCount) {
      this.processCount = processCount;
   }

   public List<SingleTradeInfos> getSingleTradeInfos() {
      return singleTradeInfos;
   }

   public void setSingleTradeInfos(List<SingleTradeInfos> singleTradeInfos) {
      this.singleTradeInfos = singleTradeInfos;
   }
}
