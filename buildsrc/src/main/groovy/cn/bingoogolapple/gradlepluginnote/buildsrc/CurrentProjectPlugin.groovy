package cn.bingoogolapple.gradlepluginnote.buildsrc

import org.gradle.api.Plugin
import org.gradle.api.Project

public class CurrentProjectPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println "==============================${project.name}"
        println "CurrentProjectPlugin"
        println "==============================${project.name}"

        project.task('testCurrentProjectPlugin') << {
            println "测试 CurrentProjectPlugin"
        }

        project.gradle.addListener(new TimeListener())
    }
}