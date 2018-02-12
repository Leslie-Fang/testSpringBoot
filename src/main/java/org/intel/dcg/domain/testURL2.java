package org.intel.dcg.domain;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class testURL2 {
    @RequestMapping("/testURL2")
    public String index2() {
        return "testURL2!";
    }
}
