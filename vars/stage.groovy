void call(String label, Closure body){ 
  steps.stage(label){   
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