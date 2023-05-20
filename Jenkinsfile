#!/usr/bin/env groovy
@Library("SharedLib")
def gv
pipeline {
  agent any
    stages{
//             stage("clone")
//                 {
//                   steps 
//                     { 
//                       script{
                        
//                       git "https://github.com/ShekharRedd/companyauropro.git"
//                       sh "python code.py"
//                       }
                        
//                     }
//                 }
//                   stage("deplobv")
//                             { 
//                          when{
//                          expression{
//                            env.BRANCH_NAME=='master'
//                          }
//                          }
//                   steps
//                      { 

//                        echo "deplov successfully"
//                      }
//                 }
      
      
      
            stage("deploying")
                { 
                  steps
                     { echo "deplov successfully"
                      script{
                        deplov.dep()
                      }
                     }
                }
      
    }
  
}



                       
        
                    
        
