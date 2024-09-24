pipeline {
    agent any

    stages {
        stage('Test') {
            agent {
                docker {
                    image 'maven:3.5.0'
                }
            }
            steps {
                sh 'mvn clean install'
                sh 'make check || true'
                junit '**/target/*.xml'
            }
        }
    }
}
