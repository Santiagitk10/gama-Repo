package com.posada.santiago.gamapostsandcomments.application.bus;



import com.posada.santiago.gamapostsandcomments.application.handlers.QueueHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class RabbitMqConsumer {

    public static final String PROXY_QUEUE_POST_CREATED = "events.proxy.post.created";
    public static final String PROXY_QUEUE_COMMENT_ADDED = "events.proxy.comment.added";


    @Autowired
    private QueueHandler handler;
    @RabbitListener(queues = PROXY_QUEUE_POST_CREATED)
    public void listenToPostCreatedQueue(String received){
        /**Starting point*/
        handler.accept(received);
    }

    @RabbitListener(queues = PROXY_QUEUE_COMMENT_ADDED)
    public void listenToCommentAddedQueue(String received){
        /**Starting point*/
        handler.accept(received);
    }

}
