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

        stage('run') {
          steps {
            sh '''javac FirstLastDigitSum.java
java FirstLastDigitSum
'''
          }
        }

      }
    }

  }
}