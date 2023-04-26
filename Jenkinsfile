pipeline {
  agent any


    stages{
            stage("build")
                {
                  when{
                    expression{
                      BRANCH_NAME=='ram'

                    }
                  }
                  steps 
                    { 
                       echo "hello world"
                    }
                }
            stage("deplov")
                { 
                  steps
                     { echo "deplov successfully"
                     }
                }
    }
    post{
        always{
          echo "always pass"
        }
        success{
          echo "success pass"

        }
        failure{
          echo "failure fails"
        }
    }

}
