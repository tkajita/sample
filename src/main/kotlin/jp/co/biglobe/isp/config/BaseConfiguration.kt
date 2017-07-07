package jp.co.biglobe.isp.config

import jp.co.biglobe.isp.properties.HunassyProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(
    HunassyProperties::class
)
open class BaseConfiguration