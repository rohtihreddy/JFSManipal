/* var name ="Java Script";

function scope(){
    var data ="test data";

    function childScope(){

    }
    return data;

}

var d =scope();
console.log(d);

function init(){
    var name="Java script";
    function print(){
        console.log(name);
    }
    print();
}
init(); */

/* function init2(){
    var name="Java script";
    function print2(){
        console.log(name);
    }
    return print2();
}
init2();
var func = init2();
func();
*/

/* function calc() {
    var b=12; // if var is not mentioned it can be accesses out side function
    return b*b;
}

var counter=0;

function calc2() {
    // var counter=10; // if counter is declared here it everytime prints same number because counter resets for every function implementation
    console.log(counter+=1);
}
calc2();
calc2();
calc2();
*/

// function calc3() {
//     var counter=10;
//     function sum() {
//         counter+=1;
//         return counter;
//     }
//    return sum();
// }
// var test = calc3();

var calc4 =(function(){
    var counter = 10;
    return function(){
        counter+=1;
        return counter;
    };
})()

console.log(calc4())
console.log(calc4())
console.log(calc4())
console.log(calc4())