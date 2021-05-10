package com.graphql;

import com.graphql.entity.Affiliation;
import com.graphql.entity.Author_profile;
import com.graphql.entity.Preferred_name;
import org.springframework.stereotype.Service;

@Service
public class AuthorRetrievalService {

    /* Static data for Testing */
    private static final Affiliation affiliation = new Affiliation(
            "Faculdade de Ciências e Tecnologia, Universidade Nova de Lisboa, Department of Environmental Sciences",
            "Department of Environmental Sciences",
            "Department of Environmental Sciences");

    private static final Preferred_name preferred_name = new Preferred_name("P.","Beça P.","Beça","Pedro");

    public Author_profile getAuthor_profile(String  authorId) {
        return new Author_profile("1",affiliation,preferred_name);
    }
}
