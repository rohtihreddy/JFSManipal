function userLogin(user,pw,callback){
    setTimeout( ()=> {
        console.log("user logged in")
        callback({username:user})
    },3000)
}

function getUserProjects(uname,callback){
    setTimeout( ()=> {
        console.log("these are the projects")
        callback(["proj1","proj2","proj3"])
    },3000)
}

function getProjectDetails(project,callback){
    setTimeout( ()=> {
        console.log("these are the project details")
    },3000)
}

userLogin("rohith","password",(user)=> {
    console.log(user);
    getUserProjects(user,(projects)=>{
        console.log(projects);
        var proj = projects[0];
        getProjectDetails(proj, ()=>{
            console.log(proj)
        })
    })
})