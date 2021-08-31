function loadData(){
var http=new XMLHttpRequest();
console.log(http.readyState);
http.onreadystatechange = function(){
    console.log(http.readyState);
    if(this.readyState==4 && this.status==200){
        processNames(this.responseText)
       
    }
}
http.open("GET","https://jsonplaceholder.typicode.com/users",true);
http.send();
}

function processNames(data){
    var el= document.getElementById("data");
   // el.innerHTML= this.responseText;
    var users = JSON.parse(data);
   // console.log(data);
    var output="";
    for(user of users){
        output += "<div> "+user.name+ "</div>";
        // for( prop in user){
        // console.log(user[prop]);
        // }
    }
    el.innerHTML=output;
}

var btn = document.getElementById("btn");
btn.addEventListener("click",loadData);