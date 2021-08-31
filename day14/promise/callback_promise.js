function userLogin(user,pw){
    return new Promise((resolve,reject)=> {

    setTimeout( ()=> {
        console.log("user logged in")
        resolve({user:"rohith"})
    },3000)
});
}

function getUserProjects(uname){
    return new Promise((resolve,reject)=> {
    
    setTimeout( ()=> {
        console.log("these are the projects")
        resolve(["proj1","proj2","proj3"])
    },3000)
});
}

function getProjectDetails(project){
    return new Promise((resolve,reject)=> {
    setTimeout( ()=> {
        console.log("these are the project details")
    },3000)
});
}



/*userLogin("Rohith","pass")
        .then(user => getUserProjects(user))
        .then(projects => getProjectDetails(projects[0])
        .then(details => console.log(details))
        .catch(err => console.log(err)) */

//async await
async function displayProject(){
    try{
    let LoggedInUser = await userLogin("rohith","pass");
    let projects = await getUserProjects(LoggedInUser);
    let projectDetails =await getProjectDetails(projects[0]);
    console.log(projectDetails);
    }
    catch(error){
        console.log(error.messsage)
    }
}
displayProject();