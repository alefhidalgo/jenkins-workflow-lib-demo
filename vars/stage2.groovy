// support the original node interface
void call(String label = null, Closure body){
    if(label){
      steps.stage(label){
        echo "Custom Stage"
        body()
       }
    } else {
      steps.stage{
        echo "Custom Stage"
        body()
      }
}
