package example.ex1.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
public class indexControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void index_test() throws Exception {
        log.error("이곳은 indexControllerTest.java입니다.");
        ResultActions resultActions = mvc.perform(MockMvcRequestBuilders.get("/index"));
        log.error("index 페이지를 가져왔네요.");
        log.debug("이런건가?");
        resultActions.andExpect(MockMvcResultMatchers.status().isCreated());
    }

}
