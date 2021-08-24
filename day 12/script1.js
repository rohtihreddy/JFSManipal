// DOM: document
var divEl =document.createElement("div");

document.body.appendChild(divEl);

var data = document.createTextNode("Text");

divEl.appendChild(data);

divEl.setAttribute("id","17529");

//divEl.remove();

/*console.log(divEl.innerText)
divEl.innerText="new updated text";
console.log(divEl.innerText) */

console.log(divEl.innerHTML)
var name="Rohith"
divEl.innerHTML="<p>Hey "+name+" this is paragrapgh content</p>";


//reading element
var el = document.getElementById("17529");
//console.log(el);
 el.innerHTML="new text"; 