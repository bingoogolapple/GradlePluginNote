# GradlePluginNote

## Android Studio 调试 Gradle Plugin

* 1.在 Edit Configurations 中添加 Remote「远程调试任务」
* 2.在 Terminal 中运行下面的命令，其中 build 任务可以换成其他的

```
gradle build -Dorg.gradle.daemon=false -Dorg.gradle.debug=true
```
* 3.选择第 1 步添加的远程调试任务，点击 Debug 按钮就可以像调试 Java 代码一样调试了