package cn.bingoogolapple.gradlepluginnote.buildsrc

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

public class CustomTask extends DefaultTask {

    CustomTask() {
        group = 'bga'
        description = 'bga first task'
    }

    @TaskAction
    void output() {
        println "Sender is ${project.customArgs.sender},\nmessage: ${project.customArgs.message}"
        println "Receiver is ${project.customArgs.nestArgs.receiver} \nemail: ${project.customArgs.nestArgs.email}"
    }
}