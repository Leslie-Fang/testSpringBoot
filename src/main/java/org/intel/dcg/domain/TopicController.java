package org.intel.dcg.domain;
import org.intel.dcg.dao.Topic;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getTopic() {
        List<Topic> myTopic = new ArrayList<Topic>();
        myTopic.add(new Topic(1,"leslie","hhh"));
        myTopic.add(new Topic(2,"mango","hhh2"));
        return myTopic;
    }
}
