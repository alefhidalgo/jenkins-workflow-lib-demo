
void call(Closure body){

    stages{    
      body()
      stage("FIN") {

        steps {
          script {
            echo "FIN"
          }
        }
      }
    }
  
}
