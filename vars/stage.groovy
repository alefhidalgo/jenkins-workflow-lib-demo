void call(String label, Closure body){
 
  steps.stage(label){
    echo "Custom Stage"
    echo "------Declared Methods----------"
    println body.metaClass.classNode.getDeclaredMethods("doCall")[0].code.text
    echo "--------------------------------"
    body()
    }
   
}
