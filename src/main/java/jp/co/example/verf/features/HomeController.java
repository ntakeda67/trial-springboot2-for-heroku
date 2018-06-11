package jp.co.example.verf.features;

import org.springframework.web.bind.annotation.*;

public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "TBD";
    }

}
