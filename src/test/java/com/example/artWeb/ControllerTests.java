package com.example.artWeb;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class ControllerTests {
    @Test
    public void learningTest() throws Exception {
        LearningController controller = new LearningController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/learning")).andExpect(view().name("learning_pg"));
    }

    @Test
    public void aboutUsTest() throws Exception {
        AboutUsController controller = new AboutUsController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/aboutus")).andExpect(view().name("aboutUs"));
    }

    @Test
    public void servicesTest() throws Exception {
        ServicesController controller = new ServicesController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/services")).andExpect(view().name("services_pg"));
    }

}
