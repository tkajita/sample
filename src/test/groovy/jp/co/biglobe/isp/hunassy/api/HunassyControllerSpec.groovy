package jp.co.biglobe.isp.hunassy.api

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

import spock.lang.Specification

@WebMvcTest(HunassyController)
class HunassyControllerSpec extends Specification {

    @Autowired
    MockMvc mockMvc

    def "hello world!"() {
        when:
        def response = mockMvc.perform(MockMvcRequestBuilders.get("/hello")).andReturn().response

        then:
        assert response.status == HttpStatus.OK.value()
        assert response.contentType.startsWith(MediaType.TEXT_PLAIN_VALUE)
        assert response.contentAsString == "HogeHoge"
    }
}
