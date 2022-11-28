
void call(Closure body){

    step.stages{    

      body()
      
      step.stage("FIN") {

        steps {
          script {
            echo "FIN"
          }
        }
      }
    }
  
}
