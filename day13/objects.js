/*
var person ={
    name: "rohith",
    prof: "Training",
    getName: function(){
        return this.name;
    }
}

person.skills =["cricket","Badminton","Volleyball","snooker"]
person.getProfession= function(){
    return this.prof;
}

var p1=Object.create(person);
p1.name="Neha";   */

function Laptop(brand,ram,color){
    this.brand= brand;
    this.ram=ram;
    this.color=color;
    this.getLaptopInfo = function(){
        return "Laptop Brand is "+this.brand+", ram is "+this.ram+", color is "+this.color;
    }
}

Laptop.prototype.os = "DOS";

Laptop.prototype.processor ="InterCore";

var laptop1 = new Laptop("Lenovo","16GB","Grey");
var laptop2 = new Laptop("Dell","16GB","Black");

var tools = new Array("html","java","css");

function shoe(size,color,brand){
    this.size=size;
    this.color=color;
    this.brand=brand;
    this.getShoeDetails =function(){
        return "Shoe Brand is "+this.brand+", size is "+this.size+", color is "+this.color;
}

}
var shoe1 = new shoe("8","Black","Puma");
var shoe2 = new shoe("10","White","Nike");
