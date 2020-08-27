pipeline {
      agent any
      stages {
            stage('Init') {
                  steps {
                        echo 'Hi, This is Avinash'
                        echo 'We are Starting the Testing'
                  }
            }
            stage('Build') {
                  steps {
                        echo 'Building Sample Maven Project'
                  }
            }
            stage('Deploy') {
                  steps {
                        echo "Deploying in Staging Area"
                  }
            }
            stage('Deploy Production') {
                  steps {
                        echo "Deploying in Production"
                  }
            }
      }
}