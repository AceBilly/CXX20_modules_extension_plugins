package com.github.acebilly.cxx20modulesextensionplugins.services

import com.github.acebilly.cxx20modulesextensionplugins.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
