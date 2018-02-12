package org.intel.dcg.domain;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class testURL {
    //get the data from application.properties
    @Value("${org.intel.dcg.name}")
    private String result;

    @RequestMapping("/")
    public String index() {
        return result;
    }
}
