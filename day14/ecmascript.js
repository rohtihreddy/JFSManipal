let name="venkat";  //let has block scope
var tool="js";  // var has global scope
const tools=["htmml","css","js"];
tools.push("mongodb") //it doesnt show any error because we arent changing any array properties
//tools={}; // it shows errorbecause we cant change the array

let display=()=>{
    console.log("in function")
}
let displaysingleline=()=>console.log("in single line function")
// let displaysingleline=()=> "in single line function"
display();
displaysingleline();

function add(a,b=5){  //add(a=5,b) shows error because add(5) takes 5 as frst argument
    console.log(a+b)
}

var name1="mohit";
var prof="Fresher";
 var person ={
     name1,
     prof,
     getName(){
        return this.name1;
     },
     "getProf"(){
         return this.prof;
     }
};

var a=tools[0];
var b=tools[1];
var [a,b] = tools

var product={
    brand: "HTC",
    ram:"4gb",
    processor: "Mediatek"

}
var {brand,ram} =product;

//template literals
var message = `Mobile brand is ${brand} and ram is ${ram}`;

// rest and spread operators
var priceArr=[32,34,5667,822];
function getCartTotal(...priceArr){ // using rest operator ... for getCartTotal(23,34) no need to mention as array[23,34]
    var total=0;
    for(itemPrice of priceArr)
    {
        total+=itemPrice;
    }
    return total;
}

var nums=[23,25,67,78,57]; // Math.max(23,45) // Math.max(nums) shows error so use Math.max(...nums) spread operator
