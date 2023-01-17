pipeline {
    agent any
    stages {
        stage('Fetch code') {
            steps {
                git branch: 'testing-groovy-file', url: 'https://github.com/Simba91/vprofile.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

}