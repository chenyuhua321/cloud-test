package com.lagou.edu.rpc;

import com.cyh.common.domain.IResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Chenyuhua
 * @date 2020/5/24 20:51
 */
@FeignClient("user-server")
public interface UserService {
    @GetMapping("/user/info/{token}")
    IResponse userInfo(@PathVariable("token") String token);
}
