package org.intel.dcg.service;

import org.intel.dcg.domain.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> myTopics = new ArrayList<Topic>();

    public TopicService(){
        myTopics.add(new Topic(1,"leslie","hhh"));
        myTopics.add(new Topic(2,"mango","hhh2"));
    }

    public List<Topic> getAllTopics(){
        return myTopics;
    }

    public Topic getTopic(int id){
        for(Topic topic:myTopics){
            if(topic.getId() == id){
                return topic;
            }
        }
        return new Topic(id,"new leslie","new hhh");
    }

    public void addTopic(Topic topic){
        myTopics.add(topic);
    }
}
