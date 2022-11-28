void call(String label, Closure body){
 
  steps.stage(label){
    echo "Custom Stage"
    body()
    }
   
}
