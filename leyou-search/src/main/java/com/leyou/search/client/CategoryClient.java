package com.leyou.search.client;

import com.leyou.item.api.CategoryApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 商品分类的FeignClient
 * @Author wanggang
 * @Date 2021年06月01日
 */
@FeignClient(value = "item-service")
public interface CategoryClient extends CategoryApi {
}
