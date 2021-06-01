package com.leyou.search.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 商品的FeignClient
 * @Author wanggang
 * @Date 2021年06月01日
 */
@FeignClient(value = "item-service")
public interface GoodsClient extends GoodsApi {
}
