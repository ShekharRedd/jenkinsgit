pipeline {
  agent any
    
    
    stages{
            stage("clone")
                {
                  steps 
                    { 
                      git "https://github.com/ShekharRedd/companyauropro.git"
                      sh "python3 code.py"
                     
                        
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



                       
        
                    
        
