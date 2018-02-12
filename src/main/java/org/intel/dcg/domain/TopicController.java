package org.intel.dcg.domain;
import org.intel.dcg.dao.Topic;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {
    @RequestMapping("")
    public List<Topic> getTopic() {
        List<Topic> myTopic = new ArrayList<Topic>();
        myTopic.add(new Topic(1,"leslie","hhh"));
        myTopic.add(new Topic(2,"mango","hhh2"));
        return myTopic;
    }
    @RequestMapping(value="/{topicID}",method = RequestMethod.GET)
    public Topic getTopicbyID(@PathVariable int topicID) {
        return new Topic(topicID,"leslie","hhh");
    }
}
