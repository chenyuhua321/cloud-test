package com.cyh.code.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Chenyuhua
 * @date 2020/5/23 20:47
 */
@FeignClient("mail-server")
public interface MailService {
    @GetMapping("/email/send/{email}/{code}")
    String sendMail(@PathVariable("email") String email, @PathVariable("code") String code);
}
