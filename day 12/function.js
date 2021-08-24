function hey(){
    console.log("Hey!! Welcome to function");
    return "hello";
    console.log("Test"); //lines written after return wont be called
}
hey();

// var a=15;
// var b=32;
function sum(a,b){
return a+b;
}

//sum(1,2,3) it ignores 3rd argument
// sum(1)returns NaN 


   /* in console sum without paranthesis returns
    sum(a,b){
    return a+b;
    } */
   
   /* in console
    var calc=sum;
    undefined
    calc(1,27)
    28  */

    function cartTotal(){
        //console.log(arguments)
        var total =0;
        for(price of arguments){

            total+=price;
        }
       return total;
    }

    //self invoking func
    (function(name){
        console.log(name+" Hii");
    }
    )("rohith")

    //hoisting
    test(); 
    function test(){
        console.log("In test function")
    }

    //testOne(); shows error because function is declared(literal way) differently compared to above
    var testOne = function(){
        console.log("this is test one function")
    }
    testOne();

