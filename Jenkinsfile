pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[url: 'https://github.com/islam174932/DockerSeleniumGrid.git']]])
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            parallel {
                stage('Firefox Tests') {
                    steps {
                        bat "mvn -Dtest=nodesTest#openGoogleOnFirefox test"
                    }
                }
                stage('Chrome Tests') {
                    steps {
                        bat "mvn -Dtest=nodesTest#openOurPageOnChrome test"
                    }
                }
            }
        }
    }

}
