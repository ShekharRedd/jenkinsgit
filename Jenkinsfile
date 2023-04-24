pipeline {
  agent any
    
    
    stages{
            stage("build")
                {
                  steps 
                    { 
                      sh "python app.py"
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
                       
        
                    
        
