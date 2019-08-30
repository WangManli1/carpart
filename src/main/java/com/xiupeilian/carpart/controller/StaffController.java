package com.xiupeilian.carpart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: 员工管理模板
 * @CreateDate: 2019/8/22 9:44
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/staff")
public class StaffController {

    @RequestMapping("/staffList")
    public String  staffList(HttpServletResponse response) throws IOException {
        return "staff/staffList";
    }
}
