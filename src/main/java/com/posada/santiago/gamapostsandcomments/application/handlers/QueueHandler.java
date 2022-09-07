package com.posada.santiago.gamapostsandcomments.application.handlers;

import co.com.sofka.domain.generic.DomainEvent;
import com.google.gson.Gson;
import com.posada.santiago.gamapostsandcomments.application.bus.models.CommentModel;
import com.posada.santiago.gamapostsandcomments.application.bus.models.PostModel;
import com.posada.santiago.gamapostsandcomments.domain.Post;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class QueueHandler implements Consumer<String> {
    private final Gson gson = new Gson();


    @Override
    public void accept(String received) {


        if (received.contains("content")){
            CommentModel commentModel = null;
            try {
                commentModel = (CommentModel) gson.fromJson(received, Class.forName("com.posada.santiago.gamapostsandcomments.application.bus.models.CommentModel"));
                System.out.printf(commentModel.toString());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            System.out.println(commentModel.toString());
        } else {
            try {
                PostModel postModel = (PostModel) gson.fromJson(received,Class.forName("com.posada.santiago.gamapostsandcomments.application.bus.models.PostModel"));
                System.out.printf(postModel.toString());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
