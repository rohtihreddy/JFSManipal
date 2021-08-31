function loadData(){
var http = new XMLHttpRequest();
console.log(http.readyState);
http.onload = function(){
    console.log(http.readyState);
    var element = document.getElementById("data");
    element.innerHTML= this.responseText;
}

http.open("GET","simple.txt", true);
http.send();
}
var btn = document.getElementById("btn");
btn.addEventListener("click",loadData);









