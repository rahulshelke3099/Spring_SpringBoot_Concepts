package mvc.springboot;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String HomePage() {
        return "index.jsp";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1")int num1, @RequestParam("num2") int num2, HttpSession httpSession) {
//       public String add(HttpServletRequest request, HttpSession httpSession) {
//       int num1 =  Integer.valueOf(request.getParameter("num1"));
//       int num2 =  Integer.valueOf(request.getParameter("num2"));
       int result = num1 + num2;
       httpSession.setAttribute("result", result);
        return "result.jsp";
    }
}
