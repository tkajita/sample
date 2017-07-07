import java.nio.charset.Charset


def PROJECT_NAME = "super-hunassy"

// デフォルトのログレベル
def DEFAULT_LOG_LEVEL = INFO

// デフォルトのログレベル
def APPLICATION_LOG_LEVEL = INFO

// ログの出力フォーマット
def LOG_FORMAT = "%d{yyyy/MM/dd HH:mm:ss.SSS} [%level] [%thread] [%logger] %message%n"

// ログのデフォルト文字コード
def DEFAULT_CHARSET = Charset.forName("UTF-8")

// 標準出力へのログ出力設定
appender("STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        charset = DEFAULT_CHARSET
        pattern = LOG_FORMAT
    }
}

// ログレベル設定
root(DEFAULT_LOG_LEVEL, ["STDOUT"])
logger("org.kajip", APPLICATION_LOG_LEVEL)
