
pipeline {
	agent any
	
 stages {
        stage('without-docker ') {
            steps {
            
                      echo " echo without Docker !"
                           }
                                 }
	   
	        }
	  


stage('Testining') 
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
