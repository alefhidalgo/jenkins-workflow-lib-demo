
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

def validate(){
  echo "VALIDATE stage"
}

def security(){
  echo "SECURITY stage"
}