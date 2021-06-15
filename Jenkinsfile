pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh 'mvn -B clean compile'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package -D maven.test.skip=true'
            }
        }
        stage('Deploy') {
            steps {
                sh 'java -jar target/demo-aws-pipeline-0.0.1.jar'
            }
        }
    }
}