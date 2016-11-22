package com.xc.springMvc.web;

import com.xc.springMvc.MyMvcConfig;
import com.xc.springMvc.service.DemoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by Administrator on 2016/11/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyMvcConfig.class})
@WebAppConfiguration("src/main/resources")
public class ControllerIntergrationTests {

    private MockMvc mockMvc;

    @Autowired
    private DemoService demoService;

    @Autowired
    WebApplicationContext wac;

    @Autowired
    MockHttpSession session;

    @Autowired
    MockHttpServletRequest request;

    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void testNormalController() throws Exception {
        mockMvc.perform(get("/normal"))
                .andExpect(status().isOk())
                .andExpect(view().name("page"))
                .andExpect(forwardedUrl("/WEB-INF/classes/views/page.jsp"))
                .andExpect(model().attribute("msg",demoService.saySomething()));
    }

    @Test
    public void testRestController() throws Exception {
        mockMvc.perform(get("testRest"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charSet=UTF-8"))
                .andExpect(content().string(demoService.saySomething()));
    }
}
