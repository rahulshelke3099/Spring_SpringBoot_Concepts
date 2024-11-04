package mvc.springboot;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String HomePage() {
        return "index";
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1")int num1, @RequestParam("num2") int num2, ModelAndView mv) {
//    public String add(@RequestParam("num1")int num1, @RequestParam("num2") int num2, Model model) {
//       public String add(HttpServletRequest request, HttpSession httpSession) {
//       int num1 =  Integer.valueOf(request.getParameter("num1"));
//       int num2 =  Integer.valueOf(request.getParameter("num2"));
       int result = num1 + num2;
//       httpSession.setAttribute("result", result);
        mv.addObject("result",result);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("/addAlien")
    public ModelAndView addAlien(@RequestParam("aid")int aid, @RequestParam("aname") String aname, ModelAndView mv) {
        Alien alien = new Alien();
        alien.setAid(aid);
        alien.setAname(aname);
        mv.setViewName("result");
        mv.addObject("alien",alien);
        return mv;
    }
}
