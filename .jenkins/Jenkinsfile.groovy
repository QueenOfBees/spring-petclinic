#!groovy

pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}," +
                        "branch is ${env.BRANCH_NAME}, change title is ${env.CHANGE_TITLE}"
                echo "all env:>>>>"
                echo env
            }
        }
    }
}
