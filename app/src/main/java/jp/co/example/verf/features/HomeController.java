package jp.co.example.verf.features;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "TBD";
    }

}
