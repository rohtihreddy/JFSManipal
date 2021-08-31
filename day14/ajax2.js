function loadData(){
    var http=new XMLHttpRequest();
    console.log(http.readyState);
    http.onreadystatechange = function(){
        console.log(http.readyState);
        if(this.readyState==4 && this.status==200){
            processNames(this.responseText)
           
        }
    }
    http.open("GET","https://jsonplaceholder.typicode.com/posts",true);
    http.send();
    }
    
    function processNames(data){
        var el= document.getElementById("data");
        var posts = JSON.parse(data);
       // console.log(data);
        var output="";
        for(post of posts){
            output += "<div> "+post.title+ "</div>";
            // for( prop in user){
            // console.log(user[prop]);
            // }
        }
        el.innerHTML=output;
    }
    
    var btn = document.getElementById("btn");
    btn.addEventListener("click",loadData);