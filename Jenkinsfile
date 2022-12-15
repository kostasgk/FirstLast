pipeline {
  agent any
  stages {
    stage('Test') {
      parallel {
        stage('Test') {
          steps {
            echo 'Compile'
          }
        }

        stage('error') {
          steps {
            sh 'javac FirstLastDigitSum.java'
          }
        }

      }
    }

  }
}