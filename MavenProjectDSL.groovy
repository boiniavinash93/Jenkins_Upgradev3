job('First-Maven-Project-Via-DSL') {
    description("First Maven job generated by the DSL on ${new Date()}, this project is a small Maven project hosted on github")
    scm {
        git("https://github.com/boiniavinash93/Jenkins_Upgradev3.git", 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package', 'maven-samples/single-module/pom.xml')
    }
    publishers {
        //archive the war file generated
        archiveArtifacts '**/*.jar'
    }
}