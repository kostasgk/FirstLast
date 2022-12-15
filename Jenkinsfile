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

        stage('') {
          steps {
            sh 'javac Main.java'
          }
        }

      }
    }

  }
}