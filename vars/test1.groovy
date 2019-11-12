#!groovy



def lib(){
    import groovy.grape.Grape
    @Grab(group ='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.5.2')


    import groovyx.net.http.*
    import groovyx.net.http.ContentType.*
    import groovyx.net.http.Method.*
    import net.sf.json.*

}
