#!usr/bin/env groovy
@Library("SharedLib")
def gv
pipeline {
  agent any
  
  stages {
    
    stage("checkout"){
      steps{
//       sh ' git checkout master '
        script{
        test.call1()
        }
      }
    
    
    }
//     stage('Build') {
//       when {
//         expression { env.BRANCH_NAME == 'master' }
//       }
//       steps {
//         sh 'echo "Building on master branch"'
//       }
//     }
//     stage('Checkout') {
//       when {
//         expression { env.BRANCH_NAME == 'master' }
//       }
//       steps {
//         sh 'echo "Checkout to master branch"'
//       }
//     }
  }
}
