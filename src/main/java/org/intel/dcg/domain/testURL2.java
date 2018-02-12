package org.intel.dcg.domain;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class testURL2 {
    @RequestMapping("/testURL2")
    public ModelAndView index2() {
        ModelAndView modelAndView = new ModelAndView("main");
        return modelAndView;
    }
}
