package com.sample.jenkincicdpipe;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@WebMvcTest
class JenkincicdpipeApplicationTests {

    @Autowired
    private MockMvc mvc;


    @Test
    public void testGreetingsEndPoints() throws Exception {

        String name="SatyaRanjan";

        mvc.perform(MockMvcRequestBuilders.get("/greeting/{name}",name)).
                andExpect(MockMvcResultMatchers.status().isOk()).
                andExpect(MockMvcResultMatchers.content().string("Hello" + name + "congratulations for fist CICD Demo"));

    }

}
