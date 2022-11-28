import groovy.inspect.swingui.AstNodeToScriptVisitor


void call(String label, Closure body){
 
  steps.stage(label){
    echo "Custom Stage"
    echo "------Declared Methods----------"
     new StringWriter().with { writer ->
      body.metaClass.classNode.getDeclaredMethods("doCall")[0].code.visit new AstNodeToScriptVisitor( writer )
      println "{\n$writer}"
    }
    echo "--------------------------------"
    body()
    }
   
}
