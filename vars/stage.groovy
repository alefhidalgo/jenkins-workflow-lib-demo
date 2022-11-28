
void call(String label, Closure body){
 
  steps.stage(label){
    echo "Custom Stage"
    if (label == "validate"){
      validate()
    } else if(label == "security"){
       security()
    } else {
      body()    
    }
  }
   
}

def validate(){
  echo "Legacy Validate stage"
}

def security(){
  echo "Legacy Security stage"
}