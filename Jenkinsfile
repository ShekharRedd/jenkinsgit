pipeline {
  agent any
    stages{
            stage("clone")
                {
                  steps 
                    { 
                      script{
                        
                      git "https://github.com/ShekharRedd/companyauropro.git"
                      sh "python code.py"
                      }
                        
                    }
                }
            stage("deplov")
                { 
                  steps
                     { echo "deplov successfully"
                     }
                }
    }
  
}



                       
        
                    
        
