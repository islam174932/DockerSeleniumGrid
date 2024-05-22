pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            echo 'we now start build the test stage'
          }
        }

        stage('Test') {
          steps {
            echo 'test willbe on stage now '
          }
        }

      }
    }

    stage('deploy') {
      steps {
        echo 'deploy running'
      }
    }

  }
}