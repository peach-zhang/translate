package com.github.peachzhang.translate.services

import com.intellij.openapi.project.Project
import com.github.peachzhang.translate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
