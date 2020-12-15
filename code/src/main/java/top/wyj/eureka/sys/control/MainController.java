package top.wyj.eureka.sys.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther 王宇杰
 * @create 2020/12/15 13:47
 */
@Controller
public class MainController {

    @RequestMapping("")
    public String main() {
        return "sys/main";
    }


}
