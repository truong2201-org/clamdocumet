package vn.com.t3h.controller.cms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cms")
public class DashboardController {
   //url :localhost:8080/cms/dashboard
    @GetMapping("/dashboard")
    public String dashboard() {
       return "cms/dashboard";
   }

   @GetMapping("/report")
    public String report() {
       return "cms/report";
   }

}
