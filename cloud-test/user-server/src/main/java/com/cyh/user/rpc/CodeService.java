package com.cyh.user.rpc;

import com.cyh.common.domain.IResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Chenyuhua
 * @date 2020/5/24 15:41
 */
@FeignClient("code-server")
public interface CodeService {
    @GetMapping("/code/validate/{email}/{code}")
    IResponse validateCode(@PathVariable("email") String mail, @PathVariable("code") String code);
}
