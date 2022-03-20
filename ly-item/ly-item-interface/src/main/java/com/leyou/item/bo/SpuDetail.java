package com.leyou.item.bo;

import lombok.Data;

import javax.persistence.Table;

/**
 * @Description TODO
 * @Author wanggang
 * @Date 2021年06月01日
 */
@Data
@Table(name = "tb_spu_detail")
public class SpuDetail {

    private Long spuId;
    private String description; // 商品描述信息
    private String specifications; // 全部规格参数数据
    private String specTemplate; // 特有规格参数及可选值信息，json格式
    private String packingList; // 包装清单
    private String afterService; // 售后服务

}
