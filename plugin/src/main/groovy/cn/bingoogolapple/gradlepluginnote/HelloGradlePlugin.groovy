package cn.bingoogolapple.gradlepluginnote

import org.gradle.api.Plugin
import org.gradle.api.Project

public class HelloGradlePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println "==============================${project.name}"
        println "Hello Gradle Plugin"
        println "==============================${project.name}"
    }
}