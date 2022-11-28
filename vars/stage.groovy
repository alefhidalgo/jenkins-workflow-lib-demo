void call(String label = null, Closure body){
    if(label){
      stage(label){
        echo "Custom Stage"
        body()
       }
    } else {
      error "Stage label is required."
    }
}
