
pipeline {
  agent any
  parameter{
      choice(name:"third",choices:["good morning","afternoon","good evening"])
			choice(nam:"one",choices:["dev","test"])
			choice(nam:"two",choices:["init","build"])
      }
    stages{

      

            stage("build")
                { 
                  steps
                     { echo "deplov successfully"
                      sh "pip install request"
                     }
                }

            stage("deplov")
                { 
                  steps
                     { echo "deplov successfully"
                     }
                }

            stage("test")
                { 
                  steps
                     { echo "deplov successfully"
                     }
                }
    }
  
}



                       
        
                    
        
