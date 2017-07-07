package jp.co.biglobe.isp.properties

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * application.yml に独自プロパティを追加
 */
@ConfigurationProperties(prefix = "hunassy")
open class HunassyProperties {

    var name: String = ""

    var age: Int = 0
}