package org.intel.dcg.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class testURL3 {
    @RequestMapping("/testURL3")
    public String index3() {
        return "testURL3!";
    }
}
