package hu.klayton.wade.websocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Walter Krix <walter.krix@inbuss.hu>
 */

@Controller
public class HelloController {


    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
