package com.github.pineappleinairdrop.demoplugin.services

import com.github.pineappleinairdrop.demoplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
