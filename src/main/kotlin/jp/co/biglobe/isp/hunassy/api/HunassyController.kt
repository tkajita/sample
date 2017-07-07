package jp.co.biglobe.isp.hunassy.api

import jp.co.biglobe.isp.properties.HunassyProperties
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
open class HunassyController(val hunassyProperties: HunassyProperties) {

    @RequestMapping("/hello")
    @ResponseBody
    fun hello():String {
        return hunassyProperties.name
    }
}