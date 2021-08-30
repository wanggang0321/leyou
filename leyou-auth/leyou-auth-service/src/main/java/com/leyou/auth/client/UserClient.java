package com.leyou.auth.client;

import com.leyou.user.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Description TODO
 * @Author wanggang
 * @Date 2021年06月05日
 */
@FeignClient(value = "user-service")
public interface UserClient extends UserApi {
}
