
package com.hellochengkai.github.plugins;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

class MyPlugin implements Plugin<Project>{
    @Override
    void apply(Project project) {
            project.task('mytest'){
            doLast{
                println "Plugin add task"
            }
        }
    }
}