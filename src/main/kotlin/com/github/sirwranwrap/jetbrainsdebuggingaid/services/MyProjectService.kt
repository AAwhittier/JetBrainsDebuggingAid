package com.github.sirwranwrap.jetbrainsdebuggingaid.services

import com.github.sirwranwrap.jetbrainsdebuggingaid.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
