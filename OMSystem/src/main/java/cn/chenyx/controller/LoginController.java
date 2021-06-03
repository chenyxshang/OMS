package cn.chenyx.controller;

import cn.chenyx.common.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class LoginController extends BaseController {
    @RequestMapping("/")
    public String login(HttpServletRequest request){
        return "login";
    }

}
