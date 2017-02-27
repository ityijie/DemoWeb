package ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.model.User;
import ssm.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        //jie 通过 userList 标识 showUser.jsp中的数据
        model.addAttribute("userList",userList);
        //jie->跳转到prefix为/WEB-INF/jsp/ ,后缀为.jsp的页面
        //   ->/WEB-INF/jsp/ShowUser.jsp
        return "showUser";
    }
}
