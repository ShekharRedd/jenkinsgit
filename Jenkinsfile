pipeline {
  agent any
    
    
    stages{
            stage("clone")
                {
                  steps 
                    { 
                      git "https://github.com/ShekharRedd/companyauropro.git"
                      sh "cat code.py"
                     
                        
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



                       
        
                    
        
