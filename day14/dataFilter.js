const projects = [
    { name: "Project One",  category: "Ecom", start: 1981, end: 2004},
    { name: "Project Two", category: "Finance", start: 1991, end: 2014},
    { name: "Project Three", category: "Retail", start: 1999, end: 2012},
    { name: "Project Four", category: "Technology", start: 1989, end: 2010},
    { name: "Project Five", category: "Retail", start: 1999, end: 2019},
    { name: "Project Six", category: "Auto", start: 1980, end: 2006},
    { name: "Project Seven", category: "Ecom", start: 1986, end: 2009},
    { name: "Project Eight", category: "Finance", start: 2011, end: 2019},
    { name: "Project Nine", category: "Retail", start: 1971, end: 1989}
]

const grades = [23,45,78,92,34,56,98,45,68,49]

// for(let i=0;i<projects.length;i++){
//     console.log(projects[i]);
// }

/*
projects.forEach(function(proj){
    console.log(proj);
})
*/

//projects.forEach((proj) => console.log(proj))

/*
let promotion =[];
for(let i=0;i<grades.length;i++){
    if(grades[i] >= 60){
        promotion.push(grades[i]);
    }
}
*/

// let promotion=grades.filter(grade => grade>=60);
// console.log(promotion);

//filter
const ecomProject=projects.filter(projects=> projects.category==="Ecom");
const price90Project=projects.filter(projects=>projects.start>1980 && projects.start<1990)

const duration10orlessProject=projects.filter(projects=>projects.end-projects.start<=10)

//map
let projectNames= projects.filter(project=>project.name);

let projectNames2= projects.map(projects=>projects.name);
let projectdetails=projects.map(project=>`${project.name} started in ${project.start}`);

const upgrade=grades.map(grade=>grade+5)

const sortProject=projects.sort(function(p1,p2){
    if(p1.start<p2.start){
        return 1;
    }else{
        return -1;
    }
})

const sortedProjects=projects.sort((p1,p2)=>(p1.start<p2.start ? 1:-1));

const gradesSort= grades.sort((a,b)=> b-a)

//reduce
const totalGrades =grades.reduce((total,grade)=> total+grade,0);

const totalDuration = projects.reduce((total,project)=>total+(project.end-project.start),0);

//upgrade then filter then sort

const mergeFunction = grades
                        .map(grade=>grade+5)
                        .filter(grade=>grade>=60)
                        .sort((a,b)=>b-a)




