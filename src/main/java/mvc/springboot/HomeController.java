package mvc.springboot;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String HomePage() {
        return "index.jsp";
    }
}
