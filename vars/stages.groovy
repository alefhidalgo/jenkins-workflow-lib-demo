
void call(Closure body){

    steps.stage(label){
      echo "Custom Stages"
      body()
      }
  
}
