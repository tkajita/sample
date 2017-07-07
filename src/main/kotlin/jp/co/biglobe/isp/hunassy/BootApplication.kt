package jp.co.biglobe.isp.hunassy

import jp.co.biglobe.isp.config.BaseConfiguration
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(BaseConfiguration::class)
open class BootApplication

fun main(args: Array<String>) {
    SpringApplication.run(BootApplication::class.java, *args)
}
