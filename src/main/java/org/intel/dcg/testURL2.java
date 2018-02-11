package org.intel.dcg;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class testURL2 {
    @RequestMapping("/main")
    public String index2() {
        return "main page!";
    }
}
