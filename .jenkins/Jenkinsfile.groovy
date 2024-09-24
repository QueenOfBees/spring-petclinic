pipeline {
    agent any

    stages {
        stage('Test') {
            agent {
                docker {
                    image 'maven:3.9.6'
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
