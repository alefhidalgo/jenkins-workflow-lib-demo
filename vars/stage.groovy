
void call(String label, Closure body){
 
  steps.stage(label){
    echo "Custom Stage"
    echo "------Declared Methods----------"
    println body.inspect()
    echo "--------------------------------"
    body()
    }
   
}
