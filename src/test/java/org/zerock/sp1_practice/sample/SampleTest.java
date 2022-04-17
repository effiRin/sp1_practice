package org.zerock.sp1_practice.sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
@ExtendWith(SpringExtension.class)
@Log4j2
public class SampleTest {

    @Autowired
    private SampleService sampleService;

    @Test
    public void test1(){
        log.info(sampleService);
    }
}
