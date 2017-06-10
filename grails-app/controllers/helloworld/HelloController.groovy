package helloworld

class HelloController {
    def index() {
        def ymlProperty1 = grailsApplication.config.getProperty("property.with.period")
        def envVariable1 = grailsApplication.mainContext.environment.getProperty("property_with_period")
        def ymlProperty2 = grailsApplication.config.getProperty("property_with_underscore")
        def envVariable2 = grailsApplication.mainContext.environment.getProperty("property_with_underscore")

        render "${ymlProperty1} | ${envVariable1} | ${ymlProperty2} | ${envVariable2}"
    }
}
