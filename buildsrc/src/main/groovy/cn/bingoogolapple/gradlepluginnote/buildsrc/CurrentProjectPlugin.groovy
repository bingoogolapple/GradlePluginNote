package cn.bingoogolapple.gradlepluginnote.buildsrc

import cn.bingoogolapple.gradlepluginnote.buildsrc.exten.CustomPluginExtension
import cn.bingoogolapple.gradlepluginnote.buildsrc.exten.NestPluginExtension
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


        project.extensions.create('customArgs', CustomPluginExtension)
        project.customArgs.extensions.create('nestArgs', NestPluginExtension)

        project.task('customTask', type: CustomTask)

        project.gradle.addListener(new TimeListener())
    }
}