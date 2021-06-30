package org.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ExecWait extends DefaultTask {
    String[] command
    String ready
    String workingDirectory


    @TaskAction
    def spawnProcess() {
        ProcessBuilder builder = new ProcessBuilder(command)
        builder.directory(new File(workingDirectory))
        builder.redirectErrorStream(true)
        Process process = builder.start();
        InputStream stdout = process.getInputStream()
        BufferedReader reader = new BufferedReader(new
                InputStreamReader(stdout))

        def line
        while ((line = reader.readLine()) != null) {
            println line
            if (line.contains(ready)) {
                println "$command is ready"
                break;
            }
        }
    }
}