/*
function welcome(){
    alert("this is event")
}

var btn = document.getElementById("btn");
//btn.onclick = welcome;

//Element.addEventListener(event,function?,true/false)

btn.addEventListener("click",welcome); */

var p1= document.getElementById("parent1");
var p2= document.getElementById("parent2");
var c1=document.getElementById("child1");
var c2=document.getElementById("child2");
var a=document.getElementById("a")

function message1(e){
    //console.log("this msg is from parent")
    //console.log(e.target);
    console.log(e.currentTarget);

}
p1.addEventListener("click",message1);
function message2(e){
    e.stopPropagation()
    console.log("this msg is from child")
}
/*
function message3(e){
    if(false){//if false executes 3 functions if true executes only msg1 and msg3
        e.stopImmediatePropagation()
    }
    console.log("this is 3rd msg from parent")
}
function message4(){
    console.log("this is 4th msg from parent")
}

p1.addEventListener("click", message1);
p1.addEventListener("click", message3);
p1.addEventListener("click", message4); */


/*
p1.addEventListener("click", message1);
c1.addEventListener("click",message2);

// p2.addEventListener("click", message1,true); // enable top to bottom approach
// c2.addEventListener("click",message2,true);

p2.addEventListener("click", message1);
c2.addEventListener("click",message2); */

function message5(e){
    e.preventDefault();
    console.log("this is 5th msg from parent")
    
}

a.addEventListener("click",message5);