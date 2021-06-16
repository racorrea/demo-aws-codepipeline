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
        stage('Dockerize') {
            steps {
                sh 'docker build -t racorrea13/hello-world:latest .'
            }
        }
        // stage('Dockerize-Publish-image') {
        //     steps {
        //         sh 'docker push racorrea13/hello-world:latest'
        //     }
        // }
        // stage('Dockerize-Deploy') {
        //     steps {
        //         sh 'docker run -d -p 8080:8181 racorrea13/hello-world:latest'
        //     }
        // }
    }
}