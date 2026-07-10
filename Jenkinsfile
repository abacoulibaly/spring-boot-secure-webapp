
pipeline {
	agent any
	
 stages {
        stage('without-docker ') {
            steps {
            
                      echo " echo without Docker !"
                           }
                                 }
	   
	        }
	  


stage('stage-2') 
		 {
           
            steps {
                      sh '''
                      echo " echo With Docker !"
                      ls -la
                      touch container-yes.txt
                     '''
                   }
        }





	  }
