package com.graphql;

import com.graphql.entity.Author_profile;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import org.springframework.beans.factory.annotation.Autowired;

@DgsComponent
public class Author_profileDataFetcher {

    @Autowired
    AuthorRetrievalService authorRetrievalService;

    @DgsData(parentType = "Query", field = "author_profile")
    public Author_profile author_profile(@InputArgument("id") String id) {
        return authorRetrievalService.getAuthor_profile(id);
    }
}
