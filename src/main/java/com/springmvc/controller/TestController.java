package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jamin <br>
 * @date 2019/12/12 下午1:20<br>
 */
@Controller
public class TestController {
  @RequestMapping("/login")
  public String test() {
    return "/login";
  }
}
