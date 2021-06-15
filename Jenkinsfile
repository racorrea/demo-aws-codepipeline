pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package -D maven.test.skip=true'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}