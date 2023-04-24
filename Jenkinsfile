pipeline {
  agent any


    stages{
            stage("app")
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
