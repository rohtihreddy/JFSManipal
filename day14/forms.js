/*
function validateForm(){
    let user= document.forms["loginform"]["username"].value;
    if(user=="" || user.length<=5){
        alert("User must be entered and should contain min 6 characters")
        return false;
    }
} */

var formelemnt = document.getElementById("loginform");
formelemnt.addEventListener("submit",submitForm);
function submitForm(e){
    e.preventDefault(); // preventing form submit
    var user= document.getElementById("uname").value;
    if(user.length <=5){
        var user= document.getElementById("Usererror");
        user.innerHTML="User must be entered and should contain min 6 characters";
        return false;
    }
    var pw = document.getElementById("pw").value;
    var loginFormData = {"username": user,"password":pw}
    var finalFormData =JSON.stringify(loginFormData);

    var http=new XMLHttpRequest();
   
    http.onreadystatechange = function(){
        console.log(http.readyState);
        if(this.readyState==4 && this.status==200){
            console.log(this.responseText);
           
        }
    }
    http.open("GET","http://localhost:7090/login",true);
    http.send(finalFormData);
    }
    
