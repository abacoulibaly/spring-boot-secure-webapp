pipeline {
    // Run this pipeline on any available agent/node
    agent any 

    // Global environment variables accessible across all stages
    environment {
        APP_NAME = 'my-node-app'
        DEPLOY_ENV = 'staging'
    }

    // Define all the pipeline phases inside the stages block
    stages {
        
        stage('Checkout') {
            steps {
                echo 'Pulling the latest code from repository...'
                // Checked out automatically if using "Pipeline from SCM"
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo "Building ${env.APP_NAME}..."
                // Example of running a shell script command
                sh 'npm install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running Unit and Integration Tests...'
                // Use timeouts to prevent tests from hanging indefinitely
                timeout(time: 10, unit: 'MINUTES') {
                    sh 'npm test'
                }
            }
        }

        stage('Deploy') {
            // Only execute this stage if the previous ones succeeded
            steps {
                echo "Deploying to ${env.DEPLOY_ENV} environment..."
                sh './deploy.sh'
            }
        }
    }

    // Post-build actions trigger based on the pipeline outcome
    post {
        always {
            echo 'Cleaning up the workspace...'
            cleanWs() // Deletes the workspace directory after execution
        }
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Sending alert notification...'
        }
    }
}
