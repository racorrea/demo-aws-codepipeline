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
                echo 'mvn spring-boot:run'
            }
        }
    }
}